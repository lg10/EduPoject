package cn.hoook.dao;

import cn.hoook.utils.dao.IDAO;
import cn.hoook.vo.Teacher;

import java.sql.SQLException;


/**
 * 教师类别DAO（数据）层数据接口
 */


    public interface ITeacherDAO extends IDAO<String, Teacher> {
        /**
         * 数据层登录接口
         */
        public Teacher findLogin(Teacher vo)throws SQLException;
    }
