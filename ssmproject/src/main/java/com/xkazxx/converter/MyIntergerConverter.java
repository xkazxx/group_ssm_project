package com.xkazxx.converter;

import org.springframework.core.convert.converter.Converter;

/**
 * @author Zachary Zhao
 * @create 2019-05-19 18:55
 */
public class MyIntergerConverter implements Converter<String,Integer> {

    @Override
    public Integer convert(String s) {
        Integer parse = Integer.parseInt(s);
        return parse;
    }
}
