package guanziqiang.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import guanziqiang.entities.UserDO;
import guanziqiang.service.UserService;

/**
 * Created by GeYi on 2017/7/9.
 */
@Controller
@RequestMapping("/user")
public class UserController {

	@Autowired
    private UserService userService;

    @ModelAttribute
    public void testDanLi(HttpServletRequest request, HttpServletResponse response){
    	
    }

    @RequestMapping(value="/signUp")
    @ResponseBody
    public Object signUp(HttpServletRequest request, HttpServletResponse response, UserDO userDO){
    	userService.insert(userDO);
    	return "success";
    }
    
    @RequestMapping("/signIn")
    @ResponseBody
    public Object signIn(HttpServletRequest request, HttpServletResponse response){
        System.out.println("======signIn=====");
        System.out.println(this);

        return "success";
    }

    @RequestMapping("/signOut")
    @ResponseBody
    public Object signOut(HttpServletRequest request){
        System.out.println("======signOut=====");
        System.out.println(this);
//        System.out.println(request.getSession().getAttribute("loginName"));
//        System.out.println(request.getSession().getId());
//        System.out.println(request.getAttribute("loginName"));

        return "success";
    }

}
