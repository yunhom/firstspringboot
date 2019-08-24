package com.yun.firstspringboot;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.math.BigDecimal;

/**
 * @author wangxiaofeng
 * @date 2019-08-24 18:08
 */
@Service
public class LuckymoneyService {

    @Autowired
    private LuckymoneyRepository luckymoneyRepository;

    @Transactional
    public void createTwo(){
        Luckymoney luckymoney1 = new Luckymoney();
        luckymoney1.setProducer("小王");
        luckymoney1.setMoney(new BigDecimal("520"));
        luckymoneyRepository.save(luckymoney1);

        Luckymoney luckymoney2 = new Luckymoney();
        luckymoney2.setProducer("小王");
        luckymoney2.setMoney(new BigDecimal("1314"));
        luckymoneyRepository.save(luckymoney2);
    }
}
