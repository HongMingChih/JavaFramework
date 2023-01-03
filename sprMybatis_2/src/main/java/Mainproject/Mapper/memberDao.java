package Mainproject.Mapper;

import java.util.List;

import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;

import Mainproject.Model.member;
@Mapper
public interface memberDao {
	
	//Create
	@Insert("insert into member(name,username,password) "
			+ "values(#{name},#{username},#{password})")
	void add(member m);
	
	
	//Read
	@Select("select * from member")
	List<member> queryAll();
	
	@Select("select * from member where id=#{id}")
	member queryId(int id);
	
	
	
	//update
	@Update("update member set name=#{name},username=#{username},username=#{username} where id=#{id}")
	void update(member m);
	
	
	//delete
	@Delete("delete from member where id=#{id}")
	void delete(int id);

}
