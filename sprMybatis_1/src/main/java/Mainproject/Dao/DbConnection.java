package Mainproject.Dao;

import java.io.IOException;
import java.io.InputStream;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;


public class DbConnection {

	public static void main(String[] args) {
		System.out.println(DbConnection.getDb_Mybatis());
		//System.out.println(DbConnection.getDb_Jdbc());

	}
	
	public static SqlSession getDb_Mybatis()
	{
		SqlSession session=null;
		try {
			InputStream ism=Resources.getResourceAsStream("mybatis-config.xml");
			SqlSessionFactory sf=new SqlSessionFactoryBuilder().build(ism);
			session=sf.openSession();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return session;
		
	}
	
	public static Connection getDb_Jdbc()
	{
		String url="jdbc:mysql://localhost:3306/gjcompany";
		String user="root";
		String password="1234";
		Connection conn=null;
		
		try {
			Class.forName("com.mysql.jdbc.Driver");
			conn=DriverManager.getConnection(url,user,password);
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return conn;
	}
	

}
