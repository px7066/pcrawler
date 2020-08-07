package com.github.pcrawler.manage.pojo.vo;

import lombok.Data;


/**
 * <p>小说章节</p>
 * @author <a href="mailto:7066450@qq.com">panxi</a>
 * @version 1.0.0
 * @since 1.0
 */
@Data
public class NovelChapterVO {
    private String id;

    private String title;

    private String createTime;

    private Integer pageNum;

    private String url;

}
