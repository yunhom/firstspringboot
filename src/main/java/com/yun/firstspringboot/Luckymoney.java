package com.yun.firstspringboot;

import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import java.math.BigDecimal;

/**
 * @author wangxiaofeng
 * @date 2019-08-24 17:05
 */
@Data
@Entity
public class Luckymoney {

    @Id
    @GeneratedValue
    private Integer id;

    private BigDecimal money;

    /**
     * 发送方
     */
    private String producer;

    /**
     * 接收方
     */
    private String consumer;
}
