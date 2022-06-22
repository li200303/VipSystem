package com.li.VipSystem.service.impl;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.li.VipSystem.mapper.MemberinfoMapper;
import com.li.VipSystem.pojo.Memberinfo;
import com.li.VipSystem.pojo.Pointinfo;
import com.li.VipSystem.service.MemberinfoService;
import com.li.VipSystem.service.PointinfoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;


@Service
public class MemberinfoServiceImpl implements MemberinfoService {
    @Autowired
    private MemberinfoMapper memberinfoMapper;
    @Autowired
    private PointinfoService pointinfoService;

    public List<Memberinfo> aaa(QueryWrapper<Memberinfo> queryWrapper){
        List<Memberinfo> memberinfos = memberinfoMapper.selectList(queryWrapper);
        for (Memberinfo memberinfo : memberinfos) {
            Pointinfo pointinfo = pointinfoService.selectById(memberinfo.getMemberid());
            Float point = pointinfo.getPoint();
            memberinfo.setPoint(point);
        }
        return memberinfos;
    }


    @Override
    public List<Memberinfo> selectAll() {
        List<Memberinfo> aaa = aaa(null);
        return aaa;
    }

    @Override
    public List<Memberinfo> selectByName(String name) {
        QueryWrapper<Memberinfo> pointinfoQueryWrapper = new QueryWrapper<>();
        pointinfoQueryWrapper.like("memberName",name);
        List<Memberinfo> aaa = aaa(pointinfoQueryWrapper);
        return aaa;
    }

    @Override
    public List<Memberinfo> selectByPoint(Float point) {
        List<Memberinfo> memberinfos = memberinfoMapper.selectByPoint(point);
        return memberinfos;
    }

    @Override
    public int insert(Memberinfo memberinfo) {
        int insert = memberinfoMapper.insert(memberinfo);
        return insert;
    }

    @Override
    public int delete(int id) {
        int i = memberinfoMapper.deleteById(id);
        return i;
    }

    @Override
    public int update(Memberinfo memberinfo) {
        int i = memberinfoMapper.updateById(memberinfo);
        return i;
    }
}




