package cn.hoook.service.test.impl;

import cn.hoook.dao.ITeacherDAO;
import cn.hoook.service.test.ITeacherService;
import cn.hoook.vo.Teacher;
import org.springframework.stereotype.Service;
import javax.annotation.Resource;

@Service
public class TeacherServiceImpl implements ITeacherService {
    @Resource
    private ITeacherDAO teacherDAO;
    @Override
    public Teacher login(Teacher vo) throws Exception {
        return teacherDAO.findLogin(vo);
    }
}