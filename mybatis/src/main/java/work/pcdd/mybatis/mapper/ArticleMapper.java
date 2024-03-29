package work.pcdd.mybatis.mapper;

import work.pcdd.mybatis.entity.Article;

import java.util.List;

/**
 * <p>
 * Mapper 接口
 * </p>
 *
 * @author pcdd
 * @since 2024-03-12
 */
public interface ArticleMapper {

    List<Article> findByManyToOne(Integer authorId);

}
