package cn.hoook.action;

import cn.hoook.service.IClassesService;
import cn.hoook.utils.vaildater.Vaildater;
import cn.hoook.vo.Classes;
import com.alibaba.fastjson.JSONObject;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.util.HashMap;
import java.util.Map;

@Controller
@RequestMapping("page/back/classes/ClassesAction/*")
public class ClassesAction {
    /**
     * class类登录控制类
     */
    @Resource
    private IClassesService classesService;

    /**
     *修改数据的数据验证
     * @param vo
     */
    @RequestMapping("insert")
    public void insert(Classes vo, HttpServletResponse response, HttpServletRequest request) throws Exception {
        if (Vaildater.vaildationEmpty(vo.getTitle()) && Vaildater.vaildationEmpty(vo.getNote())){
            System.out.println(vo.getTitle()+vo.getNote()+"#########");
            if (classesService.insert(vo)){
                response.getWriter().print("success");//回传数据修改结果
            }else{
                response.getWriter().print("failure");
            }
        }else{
            response.getWriter().print("null-error");
        }
    }

    @RequestMapping("list")
    public void list(HttpServletResponse response)throws Exception{
        Map<String,Object> map = new HashMap<String,Object>();
        map.put("code",0);
        map.put("msg","");
        map.put("data",this.classesService.list());
        map.put("count",100);
        String classes = JSONObject.toJSONString(map);
        response.getWriter().println(classes);
    }
}
