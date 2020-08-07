package com.github.pcrawler.manage.pojo.vo;

import lombok.Data;

import java.util.List;

/**
 * 小说内容
 */
@Data
public class NovelContentVO {

    private String id;

    private String novelName;

    private Integer pageNum;

    private String title;

    List<String> content;
}
