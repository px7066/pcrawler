package com.github.pcrawler.manage.pojo.vo;

import lombok.Data;

import java.util.Date;

/**
 * <p>标签</p>
 * @author <a href="mailto:7066450@qq.com">panxi</a>
 * @version 1.0.0
 * @since 1.0
 */
@Data
public class NovelMarkVO {
    private String id;

    private String marking;

    private String novelName;

    private Integer pageNum;

    private String title;

    private Date createTime;
}
