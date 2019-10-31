package cn.hoook.service.test;

import cn.hoook.vo.Teacher;

import java.sql.SQLException;

public interface ITeacherService {
    /**
     * 业务层登录接口
     * @param vo
     * @return
     * @throws SQLException
     */
    public Teacher login(Teacher vo)throws SQLException, Exception;
}
