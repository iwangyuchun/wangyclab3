package cn.edu.ujn.lab3.dao;

import java.util.List;

import org.springframework.orm.hibernate5.support.HibernateDaoSupport;

import cn.edu.ujn.lab3.model.Kcb;

public class KcDaoImp extends HibernateDaoSupport implements IKcDao {

	@Override
	public void save(Kcb kc) {
		// TODO Auto-generated method stub

	}

	@Override
	public void delete(String kch) {
		// TODO Auto-generated method stub

	}

	@Override
	public void update(Kcb kc) {
		// TODO Auto-generated method stub

	}

	@Override
	public Kcb find(String kch) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List findAll(int pageNow, int pageSize) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public int findKcSize() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public List<Kcb> getAllKc() {
		// TODO Auto-generated method stub
		List<Kcb> list = (List<Kcb>)getHibernateTemplate().find("from Kcb");
		return list;
		
	}

}
