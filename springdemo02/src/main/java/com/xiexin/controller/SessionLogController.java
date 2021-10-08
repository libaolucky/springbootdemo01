package com.xiexin.controller;

import com.xiexin.bean.SessionLog;
import com.xiexin.respcode.Result;
import com.xiexin.service.SessionLogService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/sessionLog")
public class SessionLogController {
    @Autowired
    private SessionLogService sessionLogService;

    //全查  注意 不用 map  公司中 都用 一个类， 好几个类组成的类， 叫做 统一响应类， 每个公司都不一样
    // sessionLogs 的全查
    @RequestMapping("/selectAll")
    public Result selectALL(){
        List<SessionLog> sessionLogs = sessionLogService.selectByExample(null);
        Result result=new Result(sessionLogs);
        return result;
    }
}
