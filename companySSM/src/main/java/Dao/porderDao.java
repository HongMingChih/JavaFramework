package Dao;

import java.io.IOException;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.apache.ibatis.session.SqlSession;

import Model.porder;

public class porderDao  implements implDao{

	public static void main(String[] args) throws Exception {
		/*新增
	    porder p=new porder("apple",1,1,1,new Date());
		new porderDao().add(p);*/
		
		/*查詢單筆
		 List<Object>l=new porderDao().query(5);
	        porder[] p=l.toArray(new porder[l.size()]);
	        for(porder o:p) {
	        	System.out.println(o.getName());
	     }*/
		/*查詢多筆
		List<Object>l=new porderDao().queryAll("Model.porderMapper.select");
		porder[]p=l.toArray(new porder[l.size()]);
		for(porder o:p) {
			System.out.println(o.getName());
		}*/
		
		/*修改
		List<Object> l=new porderDao().query(3);
		porder[]p=l.toArray(new porder[l.size()]);
		p[0].setProduct1(5);
		p[0].setProduct2(5);
		p[0].setProduct3(5);
		p[0].getSum();
		new porderDao().update(p[0]);*/
	
		/*刪除
		List<Object> l=new porderDao().query(3);
		porder[]p=l.toArray(new porder[l.size()]);
		new porderDao().delete(p[0]);
		*/
		List<Object> l=new porderDao().queryrange(100, 500);
		porder[] p=l.toArray(new porder[l.size()]);
        for(porder o:p) {
        	System.out.println(o.getName());
     }
	}
	//查詢範圍
	public static List<Object> queryrange(Integer start ,Integer end)throws Exception{
		SqlSession session=implDao.getDB();
		System.out.println("Dao step1~~~~~~~~"+start+end);
		Map<String,Integer> m= new HashMap();
		m.put("start", start);
		m.put("end", end);
		System.out.println("Dao step2~~~~~~~~"+start+end);
		List<Object> l=session.selectList("Model.porderMapper.queryrange",m);
		System.out.println("Dao step3~~~~~~~~"+start+end);
		return l;
		
	}
	
	@Override
	public void add(Object o) throws IOException {
		SqlSession session=implDao.getDB();
		session.insert("Model.porderMapper.add", o);
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
		List<Object> l=session.selectList("Model.porderMapper.select");
		return l;
	}
	@Override
	public List<Object> query(Integer id) throws IOException {
		SqlSession session=implDao.getDB();
		List<Object> l=session.selectList("Model.porderMapper.select2",id);
		
		return l;
	}
     
	
	
	@Override
	public void update(Object o) throws IOException {
		SqlSession session=implDao.getDB();
		session.update("Model.porderMapper.update",o);
		session.commit();
	}

	@Override
	public void delete(Object o) throws IOException {
		SqlSession session=implDao.getDB();
		session.delete("Model.porderMapper.delete",o);
		session.commit();
		
	}
	

}
