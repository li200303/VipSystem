package com.li.VipSystem.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.li.VipSystem.pojo.Memberinfo;
import jdk.nashorn.internal.runtime.ListAdapter;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

import java.util.List;

@Mapper
public interface  MemberinfoMapper extends BaseMapper<Memberinfo> {
    @Select("SELECT a.*,b.point FROM MemberInfo a INNER JOIN PointInfo b ON a.memberid=b.memberid where b.Point >=#{point}")
    List<Memberinfo> selectByPoint(Float point);
}




