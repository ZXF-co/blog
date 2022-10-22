package com.work.blogblog.controller.impl;

import com.work.blogblog.controller.BlogController;
import com.work.blogblog.entity.Blog;
import com.work.blogblog.entity.Comment;
import com.work.blogblog.entity.Picture;
import com.work.blogblog.entity.Tag;
import com.work.blogblog.service.*;
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
    private PictureService pictureService;
    @Resource
    private CommentService commentService;

    @Override
    public Blog insert(Blog blog) {
        if(null == blog) {
            return null;
        }
        // 1.blog非空,进行创建
        blogService.insert(blog);
        // 2.specialColumn非空,进行创建
        if(null != blog.getSpecialColumn()) {
            // TODO
            specialColumnService.insert(blog.getSpecialColumn());
        }
        // 3.tags非空,进行创建
        if(!CollectionUtils.isEmpty(blog.getTags())) {
            for (Tag tag : blog.getTags()) {
                // TODO
                tagService.insert(tag);
            }
        }
        // 4.pictures非空,进行创建
        if(!CollectionUtils.isEmpty(blog.getPictures())) {
            for(Picture picture: blog.getPictures()) {
                picture.setBlogId(blog.getId());
                pictureService.insert(picture);
            }
        }
        // 5.comments存在,创建对应的comments
        if(!CollectionUtils.isEmpty(blog.getComments())) {
            for(Comment comment : blog.getComments()) {
                comment.setBlogId(blog.getId());
                commentService.insert(comment);
            }
        }
        return blog;
    }

    @Override
    public List<Tag> findTagList(String createUserId) {
        return tagService.findTagList(createUserId);
    }

    @Override
    public Blog select(String blogId) {
        return blogService.select(blogId);
    }


}
