package cn.hoook.service;

import cn.hoook.vo.Classes;

import java.util.List;

/**
 * 这是班级类service（业务）层数据接口
 */

public interface IClassesService {
    public boolean insert(Classes vo)throws Exception;
    public boolean update(Classes vo)throws Exception;
    public List<Classes> list()throws Exception;
}
