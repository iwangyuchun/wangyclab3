package cn.edu.ujn.lab3.dao;

import java.util.List;

import org.springframework.orm.hibernate5.support.HibernateDaoSupport;
import org.springframework.transaction.annotation.Transactional;

import com.sun.org.apache.bcel.internal.generic.NEW;

import cn.edu.ujn.lab3.model.Kcb;

public class KcDaoImp extends HibernateDaoSupport implements IKcDao {

	@Override
	@Transactional(readOnly=false)
	public void save(Kcb kc) {
		// TODO Auto-generated method stub
		getHibernateTemplate().save(kc);
		

	}

	@Override
	@Transactional(readOnly=false)
	public void delete(String kch) {
		// TODO Auto-generated method stub
		//String para=new String();
		
		Kcb kcb = new Kcb();
		kcb.setKch(kch);
		getHibernateTemplate().delete(kcb);

	}

	@Override
	@Transactional(readOnly=false)
	public void update(Kcb kc) {
		// TODO Auto-generated method stub
		getHibernateTemplate().update(kc);

	}

	@Override
	public Kcb find(String kch) {
		// TODO Auto-generated method stub
		Kcb kcb = getHibernateTemplate().get(Kcb.class, kch);
		return kcb;
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
