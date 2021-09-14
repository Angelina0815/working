package com.example.demo.service.Impl;

import com.example.demo.entity.customer;
import com.example.demo.service.customerService;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

    @Service
    public class customerServiceImpl implements customerService {
        private static Logger logger = LoggerFactory.getLogger(customerServiceImpl.class);
        @Autowired
        private com.example.demo.dao.customerDao customerDao;

        @Override
        public void datapush() {
            logger.info("-------------客户信息数据推送任务开始执行-------------");
            List<customer> students = customerDao.listcustomerInfo();
            ObjectMapper objectMapper = new ObjectMapper();
            String result = null;
            try {
                result = objectMapper.writerWithDefaultPrettyPrinter().writeValueAsString(students);
                logger.info("客户信息数据：\n" + result);
            } catch (JsonProcessingException e) {
                logger.error("数据转换异常[List to Json]", e);
            }

            // 模拟http post 推送数据到其它数据服务
            try {
                Thread.sleep(1000);
                logger.info("数据推送成功!");
            } catch (InterruptedException e) {
                logger.error("服务异常!", e);
            }
        }
    }

