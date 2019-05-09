package com.itennishy.yxShop.mapper;


import java.util.List;

import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Options;
import org.apache.ibatis.annotations.Result;
import org.apache.ibatis.annotations.Results;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;

import com.itennishy.yxShop.domain.User;

public interface UserMapper {
	
	/**
	 * Options获取数据库自增的id
	 * keyProperty java对象属性，keyColumn数据库字段
	 * @param user
	 * @return
	 */
	
	@Insert("INSERT INTO user(name,pwd,phone,email,brith_time,create_time) VALUES (#{name},#{pwd},#{phone},#{email},#{brithtime},#{createtime})")
	@Options(useGeneratedKeys = true ,keyProperty = "id" ,keyColumn = "id")
	int insert(User user);
	
	@Select("SELECT * FROM user")
	@Results({
		@Result(column = "create_time",property = "createtime"),
		@Result(column = "brith_time",property = "brithtime")
	})
	List<User> getAll();
	
	@Select("SELECT * FROM user WHERE id = #{id}")
	@Results({
		@Result(column = "create_time",property = "createtime"),
		@Result(column = "brith_time",property = "brithtime")
	})
	User findById(Long id);
	
	@Update("UPDATE user SET name=#{name} WHERE id = #{id}")
	void update(User user);
	
	@Delete("DELETE FROM user WHERE id = #{id}")
	void delete(Long id);
}
