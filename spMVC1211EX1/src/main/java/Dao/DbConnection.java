package Dao;

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
//		 System.out.println(DbConnection.getDb_Mybatis());
		System.out.println(DbConnection.getDb_Jdbc());

	}

	public static SqlSession getDb_Mybatis() {

		SqlSession session = null;
		try {
			InputStream ism = Resources.getResourceAsStream("mybaits-config.xml");
			SqlSessionFactory sf = new SqlSessionFactoryBuilder().build(ism);
			session = sf.openSession();
		} catch (IOException e) {
			e.printStackTrace();
		}
		return session;
	}

	public static Connection getDb_Jdbc() {
		String url = "jdbc:mysql://localhost:3306/spmvc1211ex1?useSSL=false&characterEncoding=utf-8";
		String user = "root";
		String password = "Password123";
		Connection conn = null;

		try {
			Class.forName("com.mysql.jdbc.Driver");
			conn = DriverManager.getConnection(url, user, password);
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} catch (SQLException e) {
			e.printStackTrace();
		}

		return conn;
	}
}
