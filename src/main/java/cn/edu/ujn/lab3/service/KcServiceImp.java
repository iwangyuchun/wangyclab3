package cn.edu.ujn.lab3.service;

import java.util.List;

import cn.edu.ujn.lab3.dao.IKcDao;
import cn.edu.ujn.lab3.model.Kcb;

public class KcServiceImp implements IKcService {
	public IKcDao kcDao;

	public void setKcDao(IKcDao kcDao) {
		this.kcDao = kcDao;
	}

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
	public List<Kcb> getAllKcb() {
		// TODO Auto-generated method stub
		return kcDao.getAllKc();
	}
	
		
	

}
