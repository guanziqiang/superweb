package guanziqiang.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * Created by GeYi on 2017/7/9.
 */
@Controller
@RequestMapping("/user")
public class UserController {

    private HttpSession httpSession;

    private int testInt = 0;

    @ModelAttribute
    public void testDanLi(HttpServletRequest request, HttpServletResponse response){
        this.httpSession = request.getSession();
    }

    @RequestMapping("/login")
    @ResponseBody
    public Object login(HttpServletRequest request, HttpServletResponse response){
        System.out.println("======logoin=====");
        System.out.println(this);
        System.out.println(testInt++);

//        System.out.println(request.getSession());
//        System.out.println(request.getSession().getId());
//
//        System.out.println(this.httpSession);
//        System.out.println(this.httpSession.getId());


//        request.getSession().setAttribute("loginName","test");
//        response.addCookie(new Cookie("cookieTest","testCookie"));
//        response.addCookie(new Cookie("userName","WYM"));
        return "success";
    }

    @RequestMapping("/logout")
    @ResponseBody
    public Object logout(HttpServletRequest request){
        System.out.println("======logout=====");
        System.out.println(this);
        System.out.println(testInt = -1);
//        System.out.println(request.getSession().getAttribute("loginName"));
//        System.out.println(request.getSession().getId());
//        System.out.println(request.getAttribute("loginName"));

        return "success";
    }

}
