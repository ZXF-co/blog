package com.work.blogcommon.constant;

/**
 * 业务模块常量定义类
 *
 * @author zhouxiaofa
 * @date 2022/10/19 22:51
 */
public class BusinessConstant {

    /**
     * 博客创作类型
     */
    public enum CreationType {
        ORIGINAL("原创"),
        REPRINT("转载"),
        TRANSLATE("翻译");

        private String chineseName;

        CreationType(String chineseName) {
            this.chineseName = chineseName;
        }

        public String getChineseName() {
            return chineseName;
        }

        public void setChineseName(String chineseName) {
            this.chineseName = chineseName;
        }
    }

    /**
     * 是否可用状态
     */
    public enum StateType {
        U("可用"),
        E("不可用");

        private String chineseName;

        StateType(String chineseName) {
            this.chineseName = chineseName;
        }

        public String getChineseName() {
            return chineseName;
        }

        public void setChineseName(String chineseName) {
            this.chineseName = chineseName;
        }
    }

    /**
     * 角色类型
     */
    public enum RoleType {
        ADMIN("管理员"),
        DEVELOPER("开发者"),
        CONSUMER("普通游客");

        private String chineseName;

        RoleType(String chineseName) {
            this.chineseName = chineseName;
        }

        public String getChineseName() {
            return chineseName;
        }

        public void setChineseName(String chineseName) {
            this.chineseName = chineseName;
        }
    }
}
