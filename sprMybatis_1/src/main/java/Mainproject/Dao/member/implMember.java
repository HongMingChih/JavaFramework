package Mainproject.Dao.member;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.apache.ibatis.session.SqlSession;

import Mainproject.Dao.DbConnection;
import Mainproject.Model.member;

public class implMember implements MemberDao{

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//new implMember().add(new member("a","b","111"));
		
		System.out.println(new implMember().queryMember("b", "111"));

	}

	@Override
	public void add(member m) {
		SqlSession session=DbConnection.getDb_Mybatis();
		session.insert("memberMapper.add", m);
		session.commit();
		session.close();
		
	}

	@Override
	public List<member> queryAll() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public member queryId(int id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void update(member m) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void delete(int id) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public member queryMember(String username, String password) {
		SqlSession session=DbConnection.getDb_Mybatis();
		Map<String,Object> map=new HashMap();
		map.put("username", username);
		map.put("password",password);
		
		List<member> l=session.selectList("memberMapper.queryMember", map);
		member m=null;
		if(l.size()!=0) {
			member[] m2=l.toArray(new member[l.size()]);
			m=m2[0];
		}
		
		return m;
	}

}
