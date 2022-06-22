package com.li.VipSystem.service.impl;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.li.VipSystem.mapper.PointinfoMapper;
import com.li.VipSystem.pojo.Pointinfo;
import com.li.VipSystem.service.PointinfoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
* @author li
* @description 针对表【PointInfo】的数据库操作Service实现
* @createDate 2022-05-31 16:36:25
*/
@Service
public class PointinfoServiceImpl implements PointinfoService {
    @Autowired
    private PointinfoMapper pointinfoMapper;


    @Override
    public Pointinfo selectById(int id) {
        Pointinfo pointinfo = pointinfoMapper.selectById(id);
        return pointinfo;
    }

    @Override
    public List<Pointinfo> selectPointById(int id) {
        QueryWrapper<Pointinfo> pointinfoQueryWrapper = new QueryWrapper<>();
        pointinfoQueryWrapper.eq("memberId",id);
        List<Pointinfo> pointinfos = pointinfoMapper.selectList(pointinfoQueryWrapper);
        return pointinfos;
    }
}




