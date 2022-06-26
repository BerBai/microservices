package com.ber.nacos.feign.service.fallback;

import com.ber.nacos.feign.service.MsgService;
import org.springframework.stereotype.Component;

/**
 * @author: ber
 * @date: 2022/6/25 0025 22:58
 * -------------------------------
 * Github：https://github.com/berbai
 * Blog：https://blog.csdn.net/Ber_Bai
 */
@Component
public class MsgServiceFallback implements MsgService {
    @Override
    public String getMsg(String msgStr) {
        return "请求失败";
    }
}
