package khannedy.spring.rest.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class HelloController {

    @ResponseBody
    @RequestMapping(value = "/hello", method = {RequestMethod.GET})
    public String hello() {
        return "follow my twitter @khannedy";
    }

}