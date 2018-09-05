package com.jym.dao;


import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

import com.jym.bean.DatabaseInfo;

@Mapper
@Repository
public interface DatabaseInfoDao {
	DatabaseInfo getDatabaseInfoById(@Param("id") long id);
	int updateDatabaseInfo(@Param("di") DatabaseInfo di);
	int insertDatabaseInfo(@Param("di") DatabaseInfo di);
	int deleteDatabaseInfo(@Param("di") long id);
}
