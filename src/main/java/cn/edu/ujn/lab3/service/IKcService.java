package cn.edu.ujn.lab3.service;

import java.util.List;

import cn.edu.ujn.lab3.model.Kcb;

public interface IKcService {
	
		public void save(Kcb kc);
		
		public void delete(String kch);
		
		public void update(Kcb kc);
		
		public Kcb find(String kch);
		
		public List findAll(int pageNow,int pageSize);
		
		public int findKcSize();
		public List<Kcb> getAllKcb();}
