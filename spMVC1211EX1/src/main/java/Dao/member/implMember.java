package Dao.member;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.apache.ibatis.session.SqlSession;

import Dao.DbConnection;
import Model.member;

public class implMember implements MemberDao {
	public static void main(String[] args) {
//		System.out.println(DbConnection.getDb_Mybatis());	
		/*
		//新增
		  member m=new member("mary", "mary@Gmail.com", "mary123");
		  new implMember().add(m);
		  */
		
//		System.out.println(new implMember().queryAll());//查詢全部
		

//		System.out.println(new implMember().queryId(1));//查詢ID
		
		/*
		 //更新
		member m=new implMember().queryId(1);
		m.setName("tea");
		m.setUsername("tea@gmail.com");
		m.setPassword("tea123");
	
		new implMember().update(m);
*/
 
		
//		new implMember().delete(3);//刪除
		
		
	
		
	
	}

	@Override
	public void add(member m) {
		SqlSession session = DbConnection.getDb_Mybatis();
		session.insert("memberMapper.add", m);
		session.commit();
		session.close();
	}

	@Override
	public List<member> queryAll() {
		SqlSession session = DbConnection.getDb_Mybatis();
		List<member> l = session.selectList("memberMapper.queryAll");
		return l;
	}

	@Override
	public member queryId(int id) {

		SqlSession session=DbConnection.getDb_Mybatis();
		List<member> l=session.selectList("memberMapper.queryId",id);
		member[] m=l.toArray(new member[l.size()]);
		return m[0];
	}

	@Override
	public void update(member m) {
		SqlSession session = DbConnection.getDb_Mybatis();
		session.update("memberMapper.update", m);
		session.commit();
	}

	@Override
	public void delete(int id) {
		SqlSession session = DbConnection.getDb_Mybatis();
		session.delete("memberMapper.delete", id);
		session.commit();
	}

	@Override
	public List<member> loginUser(String username,String password) {
		SqlSession session = DbConnection.getDb_Mybatis();
		Map<String, String> m=new HashMap();
		m.put("username", username);
		m.put("password", password);
		List<member> l=session.selectList("memberMapper.loginuser",m);
		return l;
	}

}
