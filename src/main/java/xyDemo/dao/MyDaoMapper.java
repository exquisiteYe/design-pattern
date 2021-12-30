package xyDemo.dao;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;


@Mapper
public interface MyDaoMapper {
//    @Select("select name from dog where id = #{id}")
    String getName(int id);
}
