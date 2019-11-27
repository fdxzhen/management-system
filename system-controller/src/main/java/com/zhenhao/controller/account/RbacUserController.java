package com.zhenhao.controller.account;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RequestMapping("system/user")
public class RbacUserController {

    @ResponseBody
    @RequestMapping("/list")
    String f(){
        return "test";
    }
}
