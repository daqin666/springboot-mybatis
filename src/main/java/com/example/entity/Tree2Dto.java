package com.example.entity;

import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import lombok.Data;

import java.util.List;

@Data
@JsonPropertyOrder({"lvId", "lvName"})
public class Tree2Dto {
    private String lvId;
    private String lvName;
    private List<Tree2Dto> childrenList;
}
