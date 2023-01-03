package Dao;

import java.io.IOException;
import java.io.InputStream;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import Factory.SpFactory;
import Factory.fact;
import Factory.implFactory;
import Model.member;
import Model.porder;

public class memberDao implements implDao {

	public static void main(String[] args) throws IOException {
		
		
		/*新增
		  member m=new member("bady","dd","666","0905","tai",false);
        new memberDao().add(m);*/
		
        /*查詢單筆
          List<Object>l=new memberDao().query(5);
        member[] m=l.toArray(new member[l.size()]);
        for(member o:m) {
        	System.out.println(o.getName());
        }*/
		
		/*查詢多筆
		 List<Object>l=new memberDao().queryAll("Model.memberMapper.select");
	        member[] m=l.toArray(new member[l.size()]);
	        for(member o:m) {
	        	System.out.println(o.getName());}*/
	        
        /*修改
		List<Object>l=new memberDao().query(1);
        member[] m=l.toArray(new member[l.size()]);
        m[0].setName("smallred");
        m[0].setPhone("0906080");
        new memberDao().update(m);*/
		
	        
		/*刪除
        List<Object>l=new memberDao().query(5);
        member[] m=l.toArray(new member[l.size()]);
        new memberDao().delete(m[0]);*/
	        
	       
	}

	//判斷帳密
	public static  List<Object> queryuser(String username,String password)throws Exception{
		SqlSession session=implDao.getDB();
		Map<String,String>m=new HashMap();
		m.put("username", username);
		m.put("password", password);
		List<Object> l=session.selectList("Model.memberMapper.loginuser", m);
		return l;
		
		
	}
	
	
	//判斷帳號是否重複
	public static  List<Object> queryuser2(String username)throws Exception{
		SqlSession session=implDao.getDB();
		Map<String,String>m=new HashMap();
		m.put("username", username);
		List<Object> l=session.selectList("Model.memberMapper.loginuser2", m);
		return l;
		
		
	}
	
	
	
	@Override
	public void add(Object o) throws IOException {
		SqlSession session=implDao.getDB();
		session.insert("Model.memberMapper.add", o);
		session.commit();
		
	}

	@Override
	public List<Object> queryAll(String msg) throws IOException {
		SqlSession session=implDao.getDB();
		List<Object> l=session.selectList(msg);
		return l;
	}
	@Override
	public List<Object> queryAll() throws IOException {
		SqlSession session=implDao.getDB();
		List<Object> l=session.selectList("Model.memberMapper.select");
		return l;
	}
	@Override
	public List<Object> query(Integer id) throws IOException {
		SqlSession session=implDao.getDB();
		List<Object> l=session.selectList("Model.memberMapper.select2",id);
		return l;
	}
	@Override
	public void update(Object o) throws IOException {
		SqlSession session=implDao.getDB();
		session.update("Model.memberMapper.update",o);
		session.commit();
	}

	@Override
	public void delete(Object o) throws IOException {
		SqlSession session=implDao.getDB();
		session.delete("Model.memberMapper.delete",o);
		session.commit();
		
	}

	

}
