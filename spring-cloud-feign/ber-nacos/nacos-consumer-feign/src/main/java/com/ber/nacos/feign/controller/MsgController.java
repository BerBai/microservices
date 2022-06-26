package com.ber.nacos.feign.controller;

import com.ber.nacos.feign.service.MsgService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author: ber
 * @date: 2022/6/25 0025 22:46
 * -------------------------------
 * Github：https://github.com/berbai
 * Blog：https://blog.csdn.net/Ber_Bai
 */
@RestController
public class MsgController {

    @Autowired
    MsgService msgService;

    /**
     * 获取消息
     *
     * @param msgStr 消息
     * @return
     */
    @GetMapping("/queryMsg/{msgStr}")
    public String getMsg(@PathVariable(value = "msgStr") String msgStr) {
        return msgService.getMsg(msgStr);
    }
}
