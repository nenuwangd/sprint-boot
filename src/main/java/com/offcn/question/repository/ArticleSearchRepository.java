package com.offcn.question.repository;

import org.springframework.data.elasticsearch.repository.ElasticsearchRepository;

import com.offcn.question.entity.Article;

public interface ArticleSearchRepository extends ElasticsearchRepository<Article, Long>{
 
}