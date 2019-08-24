package com.yun.firstspringboot;

import lombok.Data;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

import java.math.BigDecimal;

/**
 * @author wangxiaofeng
 * @date 2019-08-24 15:59
 */
@ConfigurationProperties(prefix="limit")
@Data
@Component
public class LimitConfig {

    private BigDecimal minMoney;

    private BigDecimal maxMoney;

    private String description;


}
