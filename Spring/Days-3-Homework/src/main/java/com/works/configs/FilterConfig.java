package com.works.configs;

import com.works.prop.User;
import com.works.services.UserService;
import org.springframework.context.annotation.Configuration;

import javax.servlet.*;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@Configuration
public class FilterConfig implements Filter {
    UserService service = new UserService();

    @Override
    public void doFilter(ServletRequest servletRequest, ServletResponse servletResponse, FilterChain filterChain) throws IOException, ServletException {
        HttpServletRequest req = (HttpServletRequest) servletRequest;
        HttpServletResponse res = (HttpServletResponse) servletResponse;

        String url = req.getRequestURI();
        String notNeedSessionUrls[] = {"/", "/userLogin"};
        boolean loginStatus = true;
        for (String item : notNeedSessionUrls) {
            if (url.equals(item)) {
                loginStatus = false;
                break;
            }
        }
        if (loginStatus) {
            //Cookie Control
            if (req.getCookies() != null) {
                Cookie[] cookies = req.getCookies();
                for (Cookie cookie : cookies) {
                    if (cookie.getName().equals("user")) {
                        int val = Integer.parseInt(cookie.getValue());
                        User u = service.singleUserInfo(val);
                        if (u != null) {
                            req.getSession().setAttribute("user", u);
                            break;
                        }
                    }
                }
            }
            // If session already true session control
            boolean status = req.getSession().getAttribute("user") == null;
            if (status) {
                res.sendRedirect("/");
            } else {
                User u = (User) req.getSession().getAttribute("user");
                req.setAttribute("user", u);
                filterChain.doFilter(req, res);
            }
        } else {
            filterChain.doFilter(req, res);
        }

    }
}
