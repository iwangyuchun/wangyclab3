package cn.edu.ujn.lab3.service;

import cn.edu.ujn.lab3.dao.IDlDao;
import cn.edu.ujn.lab3.model.Dlb;

public class DlServiceImpl implements IDlService {
	private IDlDao dlDao;
	

	public void setDlDao(IDlDao dlDao) {
		this.dlDao = dlDao;
	}


	@Override
	public Dlb find(Dlb dl) {
		// TODO Auto-generated method stub
		
		return dlDao.find(dl);
	}

}
