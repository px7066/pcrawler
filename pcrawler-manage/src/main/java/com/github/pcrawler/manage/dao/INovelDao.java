package com.github.pcrawler.manage.dao;

import com.github.pcrawler.manage.persistence.Novel;
import org.springframework.data.jpa.repository.JpaRepository;

public interface INovelDao extends JpaRepository<Novel, String> {
}
