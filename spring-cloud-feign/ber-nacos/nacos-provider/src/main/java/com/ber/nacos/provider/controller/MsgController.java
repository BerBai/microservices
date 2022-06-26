package com.ber.nacos.provider.controller;

import com.ber.nacos.provider.service.MsgService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author: ber
 * @date: 2022/6/25 0025 14:06
 * -------------------------------
 * Github：https://github.com/berbai
 * Blog：https://blog.csdn.net/Ber_Bai
 */
@RestController
public class MsgController {
    @Autowired
    MsgService msgService;

    @GetMapping("/getMsg/{msgStr}")
    public String getMsg(@PathVariable(value = "msgStr") String msgStr) {
        String res = "C服务";
        System.out.println(res + " 调用"+msgService.queryCount()+"次");
        msgService.addCount();
        return res + " 调用" + msgService.queryCount() + "次 Get " + msgStr;
    }
}
