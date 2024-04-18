package com.joe.MybatisApplication;

import com.joe.MybatisApplication.entity.Article;
import com.joe.MybatisApplication.mapper.ArticleMapper;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import javax.annotation.Resource;

@SpringBootTest
class MybatisApplicationTests {

	@Resource
	private ArticleMapper articleMapper;

	@Test
	void contextLoads() {
		System.out.println(articleMapper.findById(1));
	}

	@Test
	void test1(){
		System.out.println(articleMapper.findAll());
	}

	@Test
	void test2(){
		Article article = new Article();
		article.setTitle("Python网络爬虫");
		article.setContent("Python网络爬虫从入门到精通");
		int num = articleMapper.add(article);
		System.out.println(num);
	}

	@Test
	void test3(){
		Article article = new Article();
		article.setId(3);
		article.setTitle("Python网络爬虫");
		article.setContent("Python从入门到精通");
		int num = articleMapper.update(article);
		System.out.println(num);
	}

	@Test
	void test4(){
		articleMapper.delete(3);
	}

}
