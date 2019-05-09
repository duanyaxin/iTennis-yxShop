package com.itennishy.yxShop.repository;



import org.springframework.data.elasticsearch.annotations.Document;
import org.springframework.data.elasticsearch.repository.ElasticsearchRepository;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;

import com.itennishy.yxShop.domain.Article;


@Component 
//@Repository
public interface ArticleRepository extends ElasticsearchRepository<Article, Long> {

	
}
