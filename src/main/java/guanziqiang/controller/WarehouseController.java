package guanziqiang.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class WarehouseController {

    @ResponseBody
    public Object take() {
        
        return "sucess";
    }
    
}
