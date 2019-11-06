package com.ghh.datasourcedemo;

import com.ghh.datasourcedemo.pojo.User;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.data.redis.core.RedisTemplate;

@SpringBootTest
class DatasourcedemoApplicationTests {
    @Autowired
    private RedisTemplate redisTemplate;



    @Test
    public void Test(){
        redisTemplate.opsForValue().set("Hello","0708");
        String str = (String)redisTemplate.opsForValue().get("Hello");
        System.out.println(str);
    }
    @Test
    public void test01(){
        User user = new User(1,"zhangsan","123");
        redisTemplate.opsForValue().set("user",user);
        User o = (User)redisTemplate.opsForValue().get("user");
        System.out.println(o);
    }
}



