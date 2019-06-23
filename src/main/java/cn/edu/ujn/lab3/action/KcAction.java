package cn.edu.ujn.lab3.action;

import java.util.List;
import java.util.Map;

import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.ActionSupport;

import cn.edu.ujn.lab3.model.Kcb;
import cn.edu.ujn.lab3.service.IKcService;

public class KcAction extends ActionSupport{
private IKcService kcService;
private Kcb kcb;


	
	public Kcb getKcb() {
	return kcb;
}

public void setKcb(Kcb kcb) {
	this.kcb = kcb;
}

	public void setKcService(IKcService kcService) {
		this.kcService = kcService;
	}
	
	public String getAllKc() {
		List<Kcb> allKcb = kcService.getAllKcb();
		Map<String, Object> request = (Map<String, Object>) ActionContext.getContext().get("request");
		request.put("list", allKcb);
		return "success";
		
		
	}
	
	public String deleteKc() {
		kcService.delete(kcb.getKch());
		return "success";
	}
	
	public String addKc() {
		boolean isHad=false;
		List<Kcb> allKcb = kcService.getAllKcb();
		for(int i=0;i<allKcb.size();i++) {
			if(kcb.getKch().equals(allKcb.get(i).getKch())) {
				isHad=true;
				break;
			}
		}
		if(isHad) {
			return "error";
		}else {
			kcService.save(kcb);
			return "ok";
		}
	}
	public String toUpdate() {
		Kcb find = kcService.find(kcb.getKch());
		if(find!=null) {
			Map<String, Object> request = (Map<String, Object>) ActionContext.getContext().get("request");
			request.put("kcInfo", find);
			return "success";
		}else {
			return "error";
		}
	}
	
	public String updateKc() {
		if (kcb!=null) {
			kcService.update(kcb);
			return "success";
		}else {
			return "error";
		}
		
	}

}
