package Dao.member;

import java.util.List;

import Model.member;

public interface MemberDao {
	// 新增
	void add(member m);

	// 查詢
	List<member> queryAll();
	List<member> loginUser(String username,String password);

	member queryId(int id);

	// 更新
	void update(member m);
	// 刪除

	void delete(int id);
}
