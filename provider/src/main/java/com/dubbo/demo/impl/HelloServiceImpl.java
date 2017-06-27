package com.dubbo.demo.impl;

import com.HelloService;
import com.alibaba.dubbo.common.logger.Logger;
import com.alibaba.dubbo.common.logger.LoggerFactory;
import com.alibaba.dubbo.config.annotation.Service;

/**
 * @author Jerry Lee
 */
@Service
public class HelloServiceImpl implements HelloService {

    public final static Logger logger = LoggerFactory.getLogger(HelloServiceImpl.class);

    @Override
    public String hello(String name) {
        logger.trace("received " + name);
        return "Hello, " + name + "!";
    }
}
