package com.github.pcrawler.manage.pojo.vo;

import lombok.Data;

import java.util.List;

@Data
public class NovelVO {
    private String novelName;

    private String updateTime;

    private List<NovelChapterVO> novelChapterVOS;

}
