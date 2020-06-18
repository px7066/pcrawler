package com.github.pcrawler.manage.crawler;

import cn.edu.hfut.dmic.webcollector.model.CrawlDatums;
import cn.edu.hfut.dmic.webcollector.model.Page;
import cn.edu.hfut.dmic.webcollector.plugin.berkeley.BreadthCrawler;
import com.github.pcrawler.manage.persistence.CrawlerConfig;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class BaseCrawler extends BreadthCrawler {

    private CrawlerConfig crawlerConfig;

    public BaseCrawler(String crawlPath, boolean autoParse) {
        super(crawlPath, autoParse);
        this.addSeed(crawlerConfig.getUrl());
    }

    public BaseCrawler(String crawlPath, boolean autoParse, CrawlerConfig crawlerConfig) {
        super(crawlPath, autoParse);
        this.addSeed(crawlerConfig.getUrl());
    }

    public void visit(Page page, CrawlDatums crawlDatums) {
        System.out.println(page.select("html"));
//        System.out.println(page.select(crawlerConfig.getContentSelect()).text());
//        System.out.println(page.select(crawlerConfig.getNextPageSelect()).text());

    }

    public static void main(String[] args) throws Exception {
        CrawlerConfig crawlerConfig = new CrawlerConfig();
        crawlerConfig.setDepth(1);

        crawlerConfig.setUrl("https://blog.csdn.net/u013243986/article/details/52027499");
        BaseCrawler baseCrawler = new BaseCrawler("C:\\Users\\70664\\Desktop\\crawler\\test", true, crawlerConfig);
        baseCrawler.start(crawlerConfig.getDepth());
    }
}
