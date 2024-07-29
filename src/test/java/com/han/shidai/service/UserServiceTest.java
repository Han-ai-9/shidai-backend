package com.han.shidai.service;


import com.han.shidai.model.domain.User;
import org.junit.Assert;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import javax.annotation.Resource;
import java.util.Arrays;
import java.util.List;

/**
 * 用户服务测试
 */
@SpringBootTest
public class UserServiceTest {
    @Resource
    private UserService userService;
    @Test
    public void testSearchUsersByTags(){
        List<String> tagNameList= Arrays.asList("java","python");
        List<User> userList=userService.searchUsersByTags(tagNameList);
        Assert.assertNotNull(userList);
    }

}
