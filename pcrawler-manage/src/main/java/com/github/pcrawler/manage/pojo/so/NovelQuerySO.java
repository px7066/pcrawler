package com.github.pcrawler.manage.pojo.so;

import lombok.Data;
import lombok.EqualsAndHashCode;

@EqualsAndHashCode(callSuper = true)
@Data
public class NovelQuerySO extends BaseQuerySO{
    private String novelName;
}
