package com.github.pcrawler.manage.service.impl;

import com.github.pcrawler.manage.dao.INovelChapterDao;
import com.github.pcrawler.manage.dao.INovelDao;
import com.github.pcrawler.manage.dao.INovelMarkDao;
import com.github.pcrawler.manage.persistence.Novel;
import com.github.pcrawler.manage.persistence.NovelChapter;
import com.github.pcrawler.manage.persistence.NovelMark;
import com.github.pcrawler.manage.pojo.so.NovelQuerySO;
import com.github.pcrawler.manage.pojo.vo.NovelVO;
import com.github.pcrawler.manage.service.INovelService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Transactional
@Service
public class NovelServiceImpl implements INovelService {
    @Autowired
    private INovelDao novelDao;

    @Autowired
    private INovelChapterDao novelChapterDao;

    @Autowired
    private INovelMarkDao novelMarkDao;

    public Novel findById(String novelId) {
        return novelDao.findById(novelId).orElse(null);
    }

    public void saveNovel(Novel novel) {
        novelDao.save(novel);
    }

    @Override
    public NovelMark findByMarking(String marking) {
        return novelMarkDao.findByMarking(marking).orElse(null);
    }

    @Override
    public void saveMark(NovelMark novelMark) {
        novelMarkDao.save(novelMark);
    }

    @Override
    public NovelChapter findChapterById(String chapterId) {
        return novelChapterDao.findById(chapterId).orElse(null);
    }

    @Override
    public void saveChapter(NovelChapter novelChapter) {
        novelChapterDao.save(novelChapter);
    }

    public Page<NovelVO> findNovelPage(NovelQuerySO novelQuerySO) {
        return null;
    }

}
