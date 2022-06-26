package com.ber.nacos.consumer.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.client.RestTemplate;

/**
 * @author: ber
 * @date: 2022/6/25 0025 10:58
 * -------------------------------
 * Github：https://github.com/berbai
 * Blog：https://blog.csdn.net/Ber_Bai
 */
@RestController
public class MsgController {

    private final RestTemplate restTemplate;

    @Autowired
    public MsgController(RestTemplate restTemplate) {
        this.restTemplate = restTemplate;
    }

    /**
     * 获取消息
     *
     * @param msgStr 消息
     * @return
     */
    @GetMapping("/queryMsg/{msgStr}")
    public String getMsg(@PathVariable(value = "msgStr") String msgStr) {
        return restTemplate.getForObject("http://nacos-provider/getMsg/" + msgStr, String.class);
    }
}
