package com.joe.MybatisApplication.mapper;

import com.joe.MybatisApplication.entity.Article;
import org.apache.ibatis.annotations.*;

import java.util.List;

@Mapper
public interface ArticleMapper {

    @Select("select * from t_article where id=#{id}")
    public Article findById(@Param("id") int id);

    @Select("select * from t_article")
    public List<Article> findAll();

    @Insert("insert into t_article value (null, #{title}, #{content})")
    public int add(Article article);

    @Update("update  t_article set title=#{title}, content=#{content} where id=#{id}")
    public int update(Article article);

    @Delete("delete from t_article where id=#{id}")
    public int delete(int id);


}
