package com.github.pcrawler.manage.service;

import com.github.pcrawler.manage.persistence.Novel;
import com.github.pcrawler.manage.persistence.NovelChapter;
import com.github.pcrawler.manage.persistence.NovelMark;
import com.github.pcrawler.manage.pojo.so.NovelQuerySO;
import com.github.pcrawler.manage.pojo.vo.NovelVO;
import org.springframework.data.domain.Page;

public interface INovelService {

    Novel findById(String novelId);

    void saveNovel(Novel novel);

    NovelMark findByMarking(String marking);

    void saveMark(NovelMark novelMark);

    NovelChapter findChapterById(String chapterId);

    void saveChapter(NovelChapter novelChapter);

    Page<NovelVO> findNovelPage(NovelQuerySO novelQuerySO);

}
