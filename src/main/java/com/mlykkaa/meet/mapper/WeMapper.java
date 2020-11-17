package com.mlykkaa.meet.mapper;

import com.mlykkaa.meet.entity.We;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

/**
 * Created with IntelliJ IDEA.
 *
 * @author: ligaojie
 * @create: 2020-11-17 21:31
 * @description:
 **/
@Mapper
@Repository
public interface WeMapper {

    We queryOneByAccount(@Param(value = "account") String account);

}
