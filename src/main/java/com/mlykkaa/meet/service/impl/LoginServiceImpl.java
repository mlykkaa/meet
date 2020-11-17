package com.mlykkaa.meet.service.impl;

import com.mlykkaa.meet.mapper.WeMapper;
import com.mlykkaa.meet.service.LoginService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * Created with IntelliJ IDEA.
 *
 * @author: ligaojie
 * @create: 2020-11-17 21:33
 * @description:
 **/
@Service("loginService")
public class LoginServiceImpl implements LoginService {

    @Autowired
    private WeMapper weMapper;

}
