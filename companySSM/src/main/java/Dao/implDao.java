package Dao;

import java.io.IOException;
import java.io.InputStream;
import java.util.List;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.springframework.core.io.Resource;

public interface implDao {
  //連線
	public static SqlSession getDB() throws IOException {
		InputStream res=Resources.getResourceAsStream("mybatis-config.xml");
		SqlSessionFactory sf=new SqlSessionFactoryBuilder().build(res);
		SqlSession se=sf.openSession();
		return se;
	}
	
	
	//新增
	void add(Object o)throws IOException;
	
	//查詢
	List<Object> queryAll()throws IOException;
	List<Object> queryAll(String msg)throws IOException;
	List<Object> query(Integer id)throws IOException;
	
	//修改
	void update(Object o)throws IOException;
	//刪除
	void delete(Object o)throws IOException;
}
