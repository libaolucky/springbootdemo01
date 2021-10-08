package com.xiexin.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/page")
public class PageController {

    @RequestMapping("/sessionLoglist")
    public String sessionLoglist(){
        return "sessionLoglist";
    }
    @RequestMapping("/sysLogList")
    public String sysLogList(){
        return "sysLogList";
    }

}
