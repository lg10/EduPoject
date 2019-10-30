package cn.hoook.dao;

import cn.hoook.utils.dao.IDAO;
import cn.hoook.vo.Teacher;

import java.sql.SQLException;

public interface ITeacherDAO extends IDAO<String, Teacher> {
    /**
     * 数据层登录接口
     * @param vo
     * @return
     * @throws SQLException
     */
    public Teacher findLogin(Teacher vo)throws SQLException;
}
