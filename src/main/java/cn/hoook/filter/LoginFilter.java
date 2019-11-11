package cn.hoook.filter;



import javax.servlet.*;
import javax.servlet.annotation.WebFilter;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;
import java.io.IOException;

/*
登录检查过滤器
实现登录检查是否有用户登录，没有则跳转到登录页
 */
@WebFilter("/pages/back/*")
public class LoginFilter implements Filter {
    @Override
    public void init(FilterConfig filterConfig) throws ServletException {

    }

    @Override
    public void doFilter(ServletRequest servletRequest, ServletResponse servletResponse, FilterChain filterChain) throws IOException, ServletException {
        HttpServletRequest req =  (HttpServletRequest)servletRequest;
        HttpSession ses = req.getSession();
        if(ses.getAttribute("teacher")!= null){
            filterChain.doFilter(servletRequest,servletResponse);
        }else{
            servletRequest.getRequestDispatcher("/login.jsp").forward(servletRequest,servletResponse);
        }
    }

    @Override
    public void destroy() {

    }
}
