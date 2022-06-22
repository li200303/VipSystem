package com.li.VipSystem;

import com.li.VipSystem.pojo.Memberinfo;
import com.li.VipSystem.service.MemberinfoService;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;

@SpringBootTest
class VipSystemApplicationTests {
    @Autowired
    private MemberinfoService memberinfoService;

    @Test
    void contextLoads() {
    }


    @Test
    void aaa(){
        List<Memberinfo> memberinfos = memberinfoService.selectByName("张三");
        memberinfos.forEach(System.out::println);
    }

}
