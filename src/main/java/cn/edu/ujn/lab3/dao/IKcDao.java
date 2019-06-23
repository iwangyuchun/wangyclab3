package cn.edu.ujn.lab3.dao;

import java.util.List;

import cn.edu.ujn.lab3.model.Kcb;

public interface IKcDao {
	
	public List<Kcb> getAllKc();
	
	public void save(Kcb kc);

	public void delete(String kch);

	public void update(Kcb kc);
	
	public Kcb find(String kch);
	
	public List findAll(int pageNow,int pageSize);
	
	public int findKcSize();


}
