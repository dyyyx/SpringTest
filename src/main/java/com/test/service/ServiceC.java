package com.test.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ServiceC {

    @Autowired
    private ServiceB serviceB;

}

