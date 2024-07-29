package com.han.shidai.once;
import java.util.Date;

import com.han.shidai.mapper.UserMapper;
import com.han.shidai.model.domain.User;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;
import org.springframework.util.StopWatch;

import javax.annotation.Resource;

@Component
public class InsertUsers {
    @Resource
    private UserMapper userMapper;

    /**
     * 批量插入用户
     */
//    @Scheduled(fixedDelay = 5000)
//    @Scheduled(initialDelay = 5000,fixedRate = Long.MAX_VALUE)
    public void doInsertUsers(){
        StopWatch stopWatch=new StopWatch();
        stopWatch.start();
        final int INSERT_NUM=10;
        for (int i = 0; i < INSERT_NUM; i++) {
            User user=new User();
            user.setUsername("假火羽");
            user.setUserAccount("fake");
            user.setAvatarUrl("https://images.zsxq.com/Fss7X9DxY4SjNxaKbCOnS7Qm3u0V?e=1725119999&token=kIxbL07-8jAj8w1n4s9zv64FuZZNEATmlU_Vm6zD:NGE7smJOlXJ_Plc1-rghmm0Hdjs=");
            user.setGender(0);
            user.setUserPassword("12345678");
            user.setPhone("123");
            user.setEmail("456");
            user.setUserStatus(0);
            user.setUserRole(0);
            user.setPlanetCode("11111");
            user.setTags("[]");

            userMapper.insert(user);
        }
        stopWatch.stop();
        System.out.println(stopWatch.getTotalTimeMillis());
    }


}
