package com.ber.nacos.provider.service;

import com.ber.nacos.provider.entity.CountLog;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @author: ber
 * @date: 2022/6/25 0025 14:13
 * -------------------------------
 * Github：https://github.com/berbai
 * Blog：https://blog.csdn.net/Ber_Bai
 */
@Service
public class MsgService {

    @Autowired
    CountLog countLog;

    public Integer queryCount() {
        return countLog.getAtomicInteger().get();
    }

    public void addCount() {
        countLog.getAtomicInteger().addAndGet(1);
    }
}
