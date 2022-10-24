package com.work.blogconsumer.entity;

import com.work.blogcommon.entity.AbstractEntity;
import org.springframework.stereotype.Component;

/**
 * 当前登录用户信息存储类
 *
 * @author zhouxiaofa
 * @date 2022/10/22 16:57
 */
@Component
public class UserManager<T extends AbstractEntity> {

    private static final ThreadLocal<Consumer> HOLDER = new ThreadLocal<>();

    public static void set(Consumer consumer) {
        HOLDER.set(consumer);
    }

    /**
     * 获取当前登录用户
     */
    public static Consumer get() {
        return HOLDER.get();
    }

    /**
     * 移除当前登录用户
     */
    public static void remove() {
        HOLDER.remove();
    }

    /**
     * 获取当前登录用户账号
     */
    public static String getId() {
        return HOLDER.get().getId();
    }

    /**
     * 获取当前登录用户姓名
     */
    public static String getName() {
        return HOLDER.get().getName();
    }

    /**
     * 创建数据时基础信息设置
     *
     * @param       t-->待创建数据
     */
    public void setCreateInfo(T t) {
        t.setCreateUserId(getId());
        t.setUpdateUserId(getId());
        t.setCreateUserName(getName());
        t.setUpdateUserName(getName());
    }

    /**
     * 更新数据时基础信息设置
     *
     * @param       t-->待更新数据
     */
    public void setUpdateInfo(T t) {
        t.setUpdateUserId(getId());
        t.setUpdateUserName(getName());
    }
}
