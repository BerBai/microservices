package com.ber.nacos.provider.entity;

import org.springframework.stereotype.Component;

import java.util.concurrent.atomic.AtomicInteger;

/**
 * @author: ber
 * @date: 2022/6/25 0025 14:09
 * -------------------------------
 * Github：https://github.com/berbai
 * Blog：https://blog.csdn.net/Ber_Bai
 */
@Component
public class CountLog {
    private AtomicInteger atomicInteger;

    public CountLog(){
        this.atomicInteger = new AtomicInteger();
    }
    public AtomicInteger getAtomicInteger() {
        return atomicInteger;
    }

    public void setAtomicInteger(AtomicInteger atomicInteger) {
        this.atomicInteger = atomicInteger;
    }
}
