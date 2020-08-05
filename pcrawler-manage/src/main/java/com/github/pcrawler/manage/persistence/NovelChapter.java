package com.github.pcrawler.manage.persistence;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;

@Entity
@Table(name = "p_novel_chapter")
@Setter
@Getter
public class NovelChapter extends BaseEntity{

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "novel", columnDefinition = "varchar(32)")
    private Novel novel;

    @Column(name = "title", columnDefinition = "varchar(64)")
    private String title;

    @Column(name = "content", columnDefinition = "blob")
    private String content;

    @Column(name = "page_num", columnDefinition = "int(20)")
    private Integer pageNum;

    @Column(name = "url", columnDefinition = "varchar(255)")
    private String url;
}
