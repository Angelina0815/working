package com.example.demo.dao;
import com.example.demo.entity.customer;
import org.springframework.stereotype.Repository;

import java.util.List;
public interface customerDao {
    @Repository
    List<customer> listcustomerInfo();
    }

