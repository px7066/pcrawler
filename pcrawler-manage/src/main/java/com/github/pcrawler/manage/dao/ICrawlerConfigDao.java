package com.github.pcrawler.manage.dao;

import com.github.pcrawler.manage.persistence.CrawlerConfig;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ICrawlerConfigDao extends JpaRepository<CrawlerConfig, Integer> {
}
