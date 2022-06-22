package com.li.VipSystem.service;

import com.li.VipSystem.pojo.Pointinfo;

import java.util.List;

/**
* @author li
* @description 针对表【PointInfo】的数据库操作Service
* @createDate 2022-05-31 16:36:25
*/
public interface PointinfoService  {
    Pointinfo selectById(int id);

    List<Pointinfo> selectPointById(int id);
}
