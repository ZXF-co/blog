package com.work.blogcommon.tools;

import org.apache.commons.lang.StringUtils;
import org.apache.ibatis.type.BaseTypeHandler;
import org.apache.ibatis.type.JdbcType;

import java.sql.CallableStatement;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

/**
 * 数据库字段加密工具
 *
 * @author zhouxiaofa
 * @date 2022/10/18 14:34
 */
public class EncryptionUtil extends BaseTypeHandler {

    @Override
    public void setNonNullParameter(PreparedStatement ps, int i, Object parameter, JdbcType jdbcType) throws SQLException {
        ps.setString(i, AesUtil.encrypt((String) parameter));
    }

    @Override
    public String getNullableResult(ResultSet rs, String columnName) throws SQLException {
        return StringUtils.isBlank(rs.getString(columnName)) ? rs.getString(columnName) : AesUtil.decrypt(rs.getString(columnName));
    }

    @Override
    public String getNullableResult(ResultSet rs, int columnIndex) throws SQLException {
        return StringUtils.isBlank(rs.getString(columnIndex)) ? rs.getString(columnIndex) : AesUtil.decrypt(rs.getString(columnIndex));
    }

    @Override
    public String getNullableResult(CallableStatement cs, int columnIndex) throws SQLException {
        return StringUtils.isBlank(cs.getString(columnIndex)) ? cs.getString(columnIndex) : AesUtil.decrypt(cs.getString(columnIndex));
    }
}
