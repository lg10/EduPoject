package cn.hoook.service;

import cn.hoook.vo.Teacher;

import java.sql.SQLException;


/**
 * 这是教师类service（业务）层数据接口
 */

public interface ITeacherService {
    /**
     * 业务层登录接口
     * @param vo
     * @return
     * @throws SQLException
     */
    public Teacher login(Teacher vo)throws SQLException, Exception;
}
