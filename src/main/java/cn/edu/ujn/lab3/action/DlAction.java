package cn.edu.ujn.lab3.action;

import java.util.List;

import org.apache.tomcat.util.descriptor.web.LoginConfig;

import com.opensymphony.xwork2.ActionSupport;

import cn.edu.ujn.lab3.model.Dlb;
import cn.edu.ujn.lab3.model.Kcb;
import cn.edu.ujn.lab3.service.IDlService;
import cn.edu.ujn.lab3.service.IKcService;

public class DlAction extends ActionSupport{
	public IDlService dlService;
	public IKcService kcService;
	
	public void setKcService(IKcService kcService) {
		this.kcService = kcService;
	}

	public Dlb dl;
	
	

	public void setDlService(IDlService dlService) {
		this.dlService = dlService;
	}

	public String login() {
		Dlb find = dlService.find(dl);
		if(find!=null) {
			return "success";
		}else {
			return "error";
		}
		
	}
	
	public void getAllKc() {
		List<Kcb> allKcb = kcService.getAllKcb();
		
		
	}

	public Dlb getDl() {
		return dl;
	}

	public void setDl(Dlb dl) {
		this.dl = dl;
	}

}
