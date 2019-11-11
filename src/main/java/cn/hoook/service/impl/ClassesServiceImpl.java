package cn.hoook.service.impl;

import cn.hoook.dao.IClassesDAO;
import cn.hoook.service.IClassesService;
import cn.hoook.vo.Classes;
import org.springframework.stereotype.Service;
import javax.annotation.Resource;
import java.util.List;

/**
 * 这是班级类service（业务）层具体impl（实现）类
 * 作用是对业务层接口进行复写操作，链接DAO（数据）层将对数据具体实现操作写在这个文件中
 * 此类中方法继承与DAO层
 */

@Service
public class ClassesServiceImpl implements IClassesService {
    @Resource
    private IClassesDAO classesDAO;
    @Override
    public boolean insert(Classes vo) throws Exception {
        return this.classesDAO.doCreate(vo);
    }

    @Override
    public boolean update(Classes vo) throws Exception {
        return this.classesDAO.doUpdate(vo);
    }

    @Override
    public List<Classes> list() throws Exception {
        return this.classesDAO.findAll();
    }

}