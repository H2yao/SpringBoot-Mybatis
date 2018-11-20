package com.example.mapper;

import com.example.entity.User;
import org.apache.ibatis.annotations.Mapper;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.stereotype.Repository;


import java.util.List;

@Mapper
public interface UserMapper {
	
    List<User> findAll();
}
