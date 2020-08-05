package com.github.pcrawler.manage.persistence;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name = "p_novel")
@Setter
@Getter
public class Novel extends BaseEntity{
    @Column(name = "novel_name", columnDefinition = "varchar(64)")
    private String novelName;


    @Column(name = "author", columnDefinition = "varchar(16)")
    private String author;
}
