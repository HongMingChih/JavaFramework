package Dao.porder;

import java.util.List;

import Model.porder;

public interface PorderDao {
		//create
		void add(porder p);
		
		//Read
		List<porder> queryAll();
		porder queryId(int id);
		List<porder> querySum(int start,int end);
		
		
		//update
		void update(porder p);
		
		
		//delete
		
		void delete(int id);

}
