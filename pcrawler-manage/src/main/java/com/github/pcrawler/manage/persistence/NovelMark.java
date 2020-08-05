package com.github.pcrawler.manage.persistence;


import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;

/**
 * <p>书签</p>
 *
 * @author <a href="mailto:xipan@bigvisiontech.com">panxi</a>
 * @version 1.0.0
 * @date 2020/8/5 17:27
 */
@Entity
@Table(name = "p_novel_mark")
@Setter
@Getter
public class NovelMark extends BaseEntity{


    @Column(name = "marking", columnDefinition = "varchar(64)")
    private String marking;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "chapter",columnDefinition = "varchar(32)")
    private NovelChapter chapter;

}
