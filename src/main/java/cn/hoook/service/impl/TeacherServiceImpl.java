package cn.hoook.service.impl;

import cn.hoook.dao.ITeacherDAO;
import cn.hoook.service.ITeacherService;
import cn.hoook.vo.Teacher;
import org.springframework.stereotype.Service;
import javax.annotation.Resource;

/**
 * 这是教师类service（业务）层具体impl（实现）类
 * 作用是对业务层接口进行复写操作，链接DAO（数据）层将对数据具体实现操作写在这个文件中
 * 此类中方法继承与DAO层
 */

@Service
public class TeacherServiceImpl implements ITeacherService {
    @Resource
    private ITeacherDAO teacherDAO;
    @Override
    public Teacher login(Teacher vo) throws Exception {
        return teacherDAO.findLogin(vo);
    }
}