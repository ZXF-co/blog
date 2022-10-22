package com.work.blogblog.query;

/**
 * Blog查询定义类
 *
 * @author zhouxiaofa
 * @date 2022/10/21 12:39
 */
public interface BlogQuery {

    /**
     * 根据ID查询博客
     *
     * @param       id-->博客ID
     * @return      查询到的博客
     */
    BlogQuery id(String id);

    /**
     * 根据标题查询博客
     *
     * @param       title-->博客标题
     * @return      查询到的博客
     */
    BlogQuery title(String title);

    /**
     * 是否查询博客相关专栏
     *
     * @return      查询专栏
     */
    BlogQuery withSpecialColumn();

    /**
     * 是否查询博客相关标签
     *
     * @return      查询标签
     */
    BlogQuery withTag();

    /**
     * 是否查询博客相关图片
     *
     * @return      查询图片
     */
    BlogQuery withPicture();

    /**
     * 是否查询博客相关评论
     *
     * @return      查询评论
     */
    BlogQuery withComment();
}
