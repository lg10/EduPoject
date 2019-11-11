package cn.hoook.service;

import cn.hoook.utils.md5.MD5Code;
import cn.hoook.vo.Teacher;
import junit.framework.TestCase;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class ITeacherServiceTest {

    private static ApplicationContext ctx ;
    private static ITeacherService teacherService;
    static {
        ctx = new ClassPathXmlApplicationContext("classpath:applicationContext.xml");
        teacherService = ctx.getBean("teacherServiceImpl",ITeacherService.class);
    }

    @Test
    public void loin()throws Exception {
        Teacher vo = new Teacher();
        vo.setTid("admin");
        vo.setPassword(new MD5Code().getMD5ofStr("{123456}"));
        TestCase.assertNotNull(teacherService.login(vo));
    }
}