package com.work.blogblog.controller.impl;

import com.work.blogblog.controller.BlogController;
import com.work.blogblog.entity.Blog;
import com.work.blogblog.entity.Comment;
import com.work.blogblog.entity.Tag;
import com.work.blogblog.service.BlogService;
import com.work.blogblog.service.CommentService;
import com.work.blogblog.service.SpecialColumnService;
import com.work.blogblog.service.TagService;
import org.springframework.util.CollectionUtils;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.util.List;

/**
 * Blog接口定义实现类
 *
 * @author zhouxiaofa
 * @date 2022/10/9 16:08
 */
@RestController
public class BlogControllerImpl implements BlogController {

    @Resource
    private BlogService blogService;
    @Resource
    private SpecialColumnService specialColumnService;
    @Resource
    private TagService tagService;

    @Resource
    private CommentService commentService;

    @Override
    public List<Tag> findTagList(String createUserId) {
        return tagService.findTagList(createUserId);
    }

    @Override
    public Blog select(String blogId) {
        return blogService.select(blogId);
    }

    @Override
    public Blog insert(Blog blog) {
        if(null == blog) {
            return null;
        }
        // 1.blog非空,进行创建
        blogService.insert(blog);
        // 2.comments存在,创建对应的comments
        if(!CollectionUtils.isEmpty(blog.getComments())) {
            for(Comment comment : blog.getComments()) {
                comment.setBlogId(blog.getId());
                commentService.insert(comment);
            }
        }
        // 3.specialColumn非空,进行创建
        if(null != blog.getSpecialColumn()) {

        }
        return blog;
    }
}
