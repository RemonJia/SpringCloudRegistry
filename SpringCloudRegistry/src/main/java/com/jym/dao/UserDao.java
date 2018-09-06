package com.jym.dao;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

import com.jym.bean.User;
@Mapper
@Repository
public interface UserDao {
	User getUserById(@Param("id") long id);
	User getUserByUsername(@Param("uname") String username);
	int updateUser(@Param("di") User user);
	int insertUser(@Param("di") User user);
	int deleteUser(@Param("di") long id);
}
