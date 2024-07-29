package com.han.shidai.service;
import com.han.shidai.model.domain.User;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.data.redis.core.ValueOperations;

import javax.annotation.Resource;

@SpringBootTest
public class RedisTest {
    @Resource
    private RedisTemplate redisTemplate;


    @Test
    void test(){
        ValueOperations valueOperations = redisTemplate.opsForValue();
        //增
        valueOperations.set("huoyuString","dog");
        valueOperations.set("huoyuInt",1);
        valueOperations.set("huoyuDouble",2.0);
        User user=new User();
        user.setId(1L);
        user.setUsername("huoyu");
        valueOperations.set("huoyuUser",user);
        //查
        Object huoyu = valueOperations.get("huoyuString");
        Assertions.assertTrue("dog".equals((String) huoyu));

        huoyu=valueOperations.get("huoyuInt");
        Assertions.assertTrue(1==(Integer) huoyu);

        huoyu=valueOperations.get("huoyuDouble");
        Assertions.assertTrue(2.0==(Double) huoyu);

        System.out.println(huoyu = valueOperations.get("huoyuUser"));
    }
}
