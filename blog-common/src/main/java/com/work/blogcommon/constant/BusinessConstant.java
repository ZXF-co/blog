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

    /**
     * 学校级别
     */
    public enum SchoolLevel {
        PRIMARY_SCHOOL("小学"),
        JUNIOR_HIGH_SCHOOL("初中"),
        SENIOR_SCHOOL("高中"),
        UNIVERSITY("大学");

        private String chineseName;

        SchoolLevel(String chineseName) {
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
     * 教育学历
     */
    public enum EducationType {
        PRIMARY("小学学历"),
        JUNIOR_HIGH("初中学历"),
        SENIOR("高中学历"),
        JUNIOR_COLLEGE("专科学历"),
        UNIVERSITY("大学本科学历"),
        MASTER("硕士/研究生学历"),
        DOCTOR("博士学历");

        private String chineseName;

        EducationType(String chineseName) {
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
