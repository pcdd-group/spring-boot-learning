package work.pcdd.mybatis.entity;

import lombok.Data;

import java.io.Serializable;

/**
 * <p>
 * Tag 和 Article 是多对多
 * 一个标签可以有多篇文章，一篇文章也可以有多个标签
 * </p>
 *
 * @author pcdd
 * @since 2024-03-12
 */
@Data
public class Tag implements Serializable {

    private Integer tagId;
    private String name;

}
