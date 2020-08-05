package com.github.pcrawler.manage.persistence;


import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;

@Entity
@Table(name = "p_crawler_config")
@Getter
@Setter
public class CrawlerConfig extends BaseEntity{

    @Column(name = "url", columnDefinition = "varchar(128)")
    private String url;

    @Column(name = "depth", columnDefinition = "int(8)")
    private Integer depth;

    @Column(name = "next_page_select", columnDefinition = "varchar(255)")
    private String nextPageSelect;

    @Column(name = "content_select", columnDefinition = "varchar(255)")
    private String contentSelect;

    @Column(name = "time_interval", columnDefinition = "int(12)")
    private Integer timeInterval;

    @Column(name = "sw", columnDefinition = "bit(1)")
    private Boolean sw;

}
