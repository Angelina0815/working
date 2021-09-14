package com.example.demo;

import com.example.demo.service.customerService;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class DemoApplication {

    public static void main(String[] args) {
        SpringApplication.run(DemoApplication.class, args);
    }


    @SpringBootApplication
    @MapperScan("cn.com.springboot.dao")
    public static class SpringbootTestApplication {

        public static void main(String[] args) {
            SpringApplication.run(SpringbootTestApplication.class, args);
        }

        @Autowired
        private customerService customerService;

        @Bean
        public String starter(){
            customerService.datapush();
            return "success";
        }

    }
}
