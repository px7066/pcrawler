package com.github.pcrawler.manage.dao;

import com.github.pcrawler.manage.persistence.NovelChapter;
import org.springframework.data.jpa.repository.JpaRepository;

public interface INovelChapterDao extends JpaRepository<NovelChapter, String> {
}
