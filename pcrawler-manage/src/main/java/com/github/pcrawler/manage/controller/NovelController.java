package com.github.pcrawler.manage.controller;

import com.github.pcrawler.manage.service.INovelService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("novel")
public class NovelController {
    @Autowired
    private INovelService novelService;


}
