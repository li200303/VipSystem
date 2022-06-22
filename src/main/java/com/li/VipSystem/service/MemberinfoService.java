package com.li.VipSystem.service;

import com.li.VipSystem.pojo.Memberinfo;
import com.li.VipSystem.pojo.Pointinfo;

import java.util.List;

public interface MemberinfoService  {
    //查询全部
    List<Memberinfo> selectAll();

    //按照名字查询
    List<Memberinfo> selectByName(String name);

    //按照分数查询
    List<Memberinfo> selectByPoint(Float point);

    //删除会员
    int delete(int id);

    //添加会员
    int insert(Memberinfo memberinfo);

    //修改会员信息
    int update(Memberinfo memberinfo);
}
