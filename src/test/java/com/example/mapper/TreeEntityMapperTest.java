package com.example.mapper;

import cn.hutool.core.lang.tree.Tree;
import cn.hutool.core.lang.tree.TreeNodeConfig;
import cn.hutool.core.lang.tree.TreeUtil;
import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;
import com.example.entity.TreeDto;
import com.example.entity.TreeEntity;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import junit.framework.TestCase;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runner.Runner;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

@SpringBootTest
@RunWith(SpringRunner.class)
public class TreeEntityMapperTest extends TestCase {

    @Autowired
    private TreeEntityMapper mapper;

    @Test
    public void testSelectTree() throws JsonProcessingException {
        List<TreeDto> treeDtos = mapper.selectTree();
        ObjectMapper objectMapper = new ObjectMapper();
        String s = objectMapper.writeValueAsString(treeDtos);
        System.out.println(s);
    }

    @Test
    public void testSelectTree2() throws JsonProcessingException {
        List<TreeEntity> treeEntities = mapper.selectAll();
        List<TreeEntity> trees = buildTree(treeEntities);
        ObjectMapper objectMapper = new ObjectMapper();
        String s = objectMapper.writeValueAsString(trees);
        System.out.println(s);
    }

    //将节点数组归并为一个森林（多棵树）（填充节点的children域）
    public static List<TreeEntity> buildTree(List<TreeEntity> items) {
        //获取parentId = -1l的根节点
//        List<TreeEntity> list = items.stream().filter(item -> item.getParentId() == null)
//                .collect(Collectors.toList());
        List<TreeEntity> list = new ArrayList<>();
        for (TreeEntity item : items) {
            if(item.getParentId() == null){
                item.setParentId(-1);
                list.add(item);
            }
        }

        //根据parentId进行分组
        Map<Integer, List<TreeEntity>> map = items.stream()
                .collect(Collectors.groupingBy(TreeEntity::getParentId));
        recursionFnTree(list, map);
        return list;
    }

    public static void recursionFnTree(List<TreeEntity> list,
                                       Map<Integer, List<TreeEntity>> map) {
        for (TreeEntity treeSelect : list) {
            List<TreeEntity> childList = map.get(treeSelect.getId());
            if (null != childList && 0 < childList.size()) {
                treeSelect.setSubTreeList(childList);
                recursionFnTree(childList, map);
            } else {
                treeSelect.setSubTreeList(null);
            }
        }
    }

    /**
     * hutool-all 包的工具类方式
     *
     * @throws JsonProcessingException --
     */
    @Test
    public void testSelectTree3() throws JsonProcessingException {
        List<TreeEntity> treeEntities = mapper.selectAll();

        TreeNodeConfig config = new TreeNodeConfig();
        //id
        config.setIdKey("id");
        //父id
        config.setParentIdKey("parentId");
        //排序字段
//        config.setWeightKey("sort");
        List<Tree<Long>> treeList = TreeUtil.build(treeEntities, null, config, ((object, treeNode) -> {
            //对key进行映射赋值
            treeNode.putExtra("id", object.getId());
            treeNode.putExtra("parentId", object.getParentId());
            treeNode.putExtra("name", object.getName());
        }));


        ObjectMapper objectMapper = new ObjectMapper();
        String s = objectMapper.writeValueAsString(treeList);
        System.out.println(s);
    }
}