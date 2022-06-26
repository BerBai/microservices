package com.ber.nacos.feign.service;

import com.ber.nacos.feign.service.fallback.MsgServiceFallback;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

/**
 * @author: ber
 * @date: 2022/6/25 0025 22:54
 * -------------------------------
 * Github：https://github.com/berbai
 * Blog：https://blog.csdn.net/Ber_Bai
 */
@Component
@FeignClient(name = "nacos-provider", fallback = MsgServiceFallback.class)
public interface MsgService {

    @GetMapping("/getMsg/{msgStr}")
    String getMsg(@PathVariable("msgStr") String msgStr);
}
