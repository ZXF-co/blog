package com.work.blogconsumer.tools;

import java.util.HashMap;
import java.util.Map;
import java.util.UUID;

/**
 * Token工具类
 *
 * @author zhouxiaofa
 * @date 2022/10/22 15:12
 */
public class TokenUtil {

    private static Map<String, Object> tokenMap = new HashMap<>();

    /**
     * 生成token,并存储token-object关系
     *
     * @param       object-->实体类
     * @return      map关系
     */
    public static String generateToken(Object object) {
        String token = UUID.randomUUID().toString();
        tokenMap.put(token, object);
        return token;
    }

    /**
     * 验证token是否合法
     *
     * @param       token-->待验证token
     * @return      是否合法
     */
    public static boolean verify(String token) {
        return tokenMap.containsKey(token);
    }

    /**
     * 根据token获取用户信息
     *
     * @param       token-->token
     * @return      获取到的用户信息
     */
    public static Object getObject(String token) {
        return tokenMap.get(token);
    }
}
