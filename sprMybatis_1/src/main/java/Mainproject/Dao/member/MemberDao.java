package Mainproject.Dao.member;

import java.util.List;

import Mainproject.Model.member;

public interface MemberDao {
	//Create
	void add(member m);
	
	
	//Reade
	List<member> queryAll();
	member queryId(int id);
	member queryMember(String username,String password);
	
	
	//update
	void update(member m);
	
	
	//delete
	void delete(int id);

}
