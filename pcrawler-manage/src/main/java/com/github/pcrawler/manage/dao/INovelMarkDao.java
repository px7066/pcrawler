package com.github.pcrawler.manage.dao;

import com.github.pcrawler.manage.persistence.NovelMark;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface INovelMarkDao extends JpaRepository<NovelMark, String> {
    Optional<NovelMark> findByMarking(String marking);
}
