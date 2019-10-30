package cn.hoook.service.impl;

import cn.hoook.dao.ITeacherDAO;
import cn.hoook.service.ITeacherService;
import cn.hoook.vo.Teacher;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.sql.SQLException;

@Service
public class TeacherServiceImpl implements ITeacherService {
    @Resource
    private ITeacherDAO teacherDAO;
    @Override
    public Teacher login(Teacher vo) throws SQLException {

        return teacherDAO.findLogin(vo);
    }
}
