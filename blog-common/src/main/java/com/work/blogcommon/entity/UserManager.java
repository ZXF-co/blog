package com.work.blogcommon.entity;

/**
 * UserManager类(存储通过token登录的用户信息)
 *
 * @author zhouxiaofa
 * @date 2022/10/22 12:20
 */
public class UserManager {

    private static ThreadLocal<Object> objectHolder = new ThreadLocal<>();

    public static Object getObject() {
        return objectHolder.get();
    }

    public static void setObject(Object object) {
        objectHolder.set(object);
    }
}
