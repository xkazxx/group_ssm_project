package com.xkazxx.converter;

import org.springframework.core.convert.converter.Converter;

import java.math.BigDecimal;

/**
 * @author Zachary Zhao
 * @create 2019-05-20 11:27
 */
public class MyBigDecimalConverter implements Converter<String, BigDecimal> {
    @Override
    public BigDecimal convert(String s) {
        BigDecimal bigDecimal = new BigDecimal(s);
        return bigDecimal;
    }
}
