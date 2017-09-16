package guanziqiang.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * Created by GeYi on 2017/7/2.
 */

@Controller
@RequestMapping("/upload")
public class uploadController {

    @RequestMapping("/testUpload")
    public Object testUpload(){
        return "success";
    }

}
