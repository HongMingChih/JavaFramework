package Dao.porder;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.apache.ibatis.session.SqlSession;

import Dao.DbConnection;
import Model.porder;

public class implPorder implements PorderDao {
	public static void main(String[] args) {
		
//		 new implPorder().add(new porder("sum",20,10));
		 
//		 System.out.println(new implPorder().queryAll());//查詢全部
		
		 System.out.println(new implPorder().queryId(2));
		 porder p=new implPorder().queryId(2);
		 p.setName("hele");
		 p.setLcd(20);
		 p.setRam(10);

		// new implPorder().delete(8);
//		List<porder> l = new implPorder().querySum(2000, 3000);
//		for (porder p : l) {
//			System.out.println(p.getId() + "\t" + p.getDesk());
//		}

	}

	@Override
	public void add(porder p) {
		SqlSession session = DbConnection.getDb_Mybatis();
		session.insert("porderMapper.add", p);
		session.commit();
		session.close();
	}

	@Override
	public List<porder> queryAll() {
		SqlSession session = DbConnection.getDb_Mybatis();
		List<porder> l = session.selectList("porderMapper.queryAll");
		return l;
	}

	@Override
	public porder queryId(int id) {

		SqlSession session = DbConnection.getDb_Mybatis();
		List<porder> l = session.selectList("porderMapper.queryId", id);
		porder[] p = l.toArray(new porder[l.size()]);
		return p[0];
	}

	@Override
	public List<porder> querySum(int start, int end) {
		SqlSession session = DbConnection.getDb_Mybatis();
		Map<String, Integer> map = new HashMap();
		map.put("start", start);
		map.put("end", end);

		List<porder> l = session.selectList("porderMapper.selectSum", map);
		return l;
	}

	@Override
	public void update(porder p) {
		SqlSession session = DbConnection.getDb_Mybatis();
		session.update("porderMapper.update", p);
		session.commit();
	}

	@Override
	public void delete(int id) {
		SqlSession session = DbConnection.getDb_Mybatis();
		session.delete("porderMapper.delete", id);
		session.commit();
	}

}
