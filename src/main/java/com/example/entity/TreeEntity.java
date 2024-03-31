package com.example.entity;

import lombok.Data;

import java.util.List;

@Data
public class TreeEntity {
    private Integer id;

    private String name;

    private Integer parentId;

    private List<TreeEntity> subTreeList;
}