package com.zxs.user.test;

import com.zxs.user.UserProviderApplication;
import com.zxs.user.facade.UserFacade;
import com.zxs.user.model.AdminUser;
import lombok.extern.slf4j.Slf4j;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.test.context.web.WebAppConfiguration;

@Slf4j
@RunWith(SpringJUnit4ClassRunner.class)
@SpringBootTest(classes = UserProviderApplication.class)
@WebAppConfiguration
public class UserFacadeTest {

    @Autowired
    private UserFacade userFacade;

    @Test
    public void getUser(){
        AdminUser adminUser = userFacade.findUserByUsername("zhangsan");
        log.info("adminUser:{}",adminUser);
    }
}
