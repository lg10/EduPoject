package cn.hoook.action;

import cn.hoook.service.test.ITeacherService;
import cn.hoook.utils.md5.MD5Code;
import cn.hoook.utils.vaildater.Vaildater;
import cn.hoook.vo.Teacher;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@Controller
@RequestMapping("/pages/back/TeacherLoginAction/*")
public class TeacherLoginAction {
    /**
     * Teacher登录控制类
     */
    @Resource
    private ITeacherService teacherService;

    /**
     *登录数据验证
     * @param vo
     */
    @RequestMapping("login")
    public void login(Teacher vo, HttpServletResponse response, HttpServletRequest request) throws Exception {
        if (Vaildater.vaildationEmpty(vo.getTid()) && Vaildater.vaildationEmpty(vo.getPassword())) {
            vo.setTid(vo.getTid());
            vo.setPassword(new MD5Code().getMD5ofStr("{" + vo.getPassword() + "}"));
            Teacher teacher = teacherService.login(vo);
            if (teacher != null){ //登录成功
                request.getSession().setAttribute("teacher",teacher);//保存登录数据
                response.getWriter().print("success");//回传登录结果
            }else{
                response.getWriter().print("failure");
            }
        }else {
            response.getWriter().print("null-error");
        }
    }

}
