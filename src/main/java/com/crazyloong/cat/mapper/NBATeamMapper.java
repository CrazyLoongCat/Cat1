package com.crazyloong.cat.mapper;

import com.crazyloong.cat.pojo.NBATeam;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

import java.util.List;

@Mapper
public interface NBATeamMapper {

    @Select("select * from NBATEAM")
    List<NBATeam> findall();
}
