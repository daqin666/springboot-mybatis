package com.example.generator.code;

import org.mybatis.generator.api.MyBatisGenerator;
import org.mybatis.generator.config.Configuration;
import org.mybatis.generator.config.xml.ConfigurationParser;
import org.mybatis.generator.internal.DefaultShellCallback;

import java.util.ArrayList;
import java.util.List;

public class CodeGenerator {
    public static void main(String[] args) throws Exception {
        // warnings用于存放代码生成过程中的警告信息
        List<String> warnings = new ArrayList<>();

        // 指定是否覆盖原有文件，如果为true则会覆盖原有文件
        boolean overwrite = true;

        // 解析MBG配置文件
        ConfigurationParser cp = new ConfigurationParser(warnings);
        Configuration config = cp.parseConfiguration(CodeGenerator.class.getResourceAsStream("/generatorConfig.xml"));

        // 创建MBG
        DefaultShellCallback callback = new DefaultShellCallback(overwrite);
        MyBatisGenerator myBatisGenerator = new MyBatisGenerator(config, callback, warnings);

        // 执行代码生成
        myBatisGenerator.generate(null);

        // 打印警告信息
        for (String warning : warnings) {
            System.out.println(warning);
        }
    }
}
