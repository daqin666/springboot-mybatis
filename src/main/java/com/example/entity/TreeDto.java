package com.example.entity;

import com.alibaba.fastjson.annotation.JSONField;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import lombok.Data;

import java.util.List;

@Data
@JsonPropertyOrder({"id", "name"})
public class TreeDto {
//    @JSONField(ordinal = 0)
    private Integer id;

//    @JSONField(ordinal = 1)
    private String name;

//    @JsonInclude(JsonInclude.Include.NON_EMPTY)
    private List<TreeDto> subTreeDtoList;
}