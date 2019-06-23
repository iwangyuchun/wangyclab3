package cn.edu.ujn.lab3.action;

import java.util.List;
import java.util.Map;

import org.apache.tomcat.util.descriptor.web.LoginConfig;

import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.ActionSupport;

import cn.edu.ujn.lab3.model.Dlb;
import cn.edu.ujn.lab3.model.Kcb;
import cn.edu.ujn.lab3.service.IDlService;
import cn.edu.ujn.lab3.service.IKcService;

public class DlAction extends ActionSupport{
	public IDlService dlService;
	

	public Dlb dl;
	
	

	public void setDlService(IDlService dlService) {
		this.dlService = dlService;
	}

	public String login() {
		Dlb find = dlService.find(dl);
		if(find!=null) {
			Map<String, Object> session = ActionContext.getContext().getSession();
			session.put("user", dl);
			return "success";
		}else {
			return "error";
		}
		
	}
	
	

	public Dlb getDl() {
		return dl;
	}

	public void setDl(Dlb dl) {
		this.dl = dl;
	}

}
