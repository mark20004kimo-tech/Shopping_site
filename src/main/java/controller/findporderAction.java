package controller;

import java.util.List;
import java.util.Map;

import javax.servlet.http.HttpSession;

import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.ActionSupport;
import dao.impldao;
import fact.daofact;
import model.porder;


public class findporderAction extends ActionSupport{
	private String user;
		    
	public String getUser() {
		return user;
	}

	public void setUser(String user) {
		this.user = user;
	}


	public String execute() throws Exception {
		daofact df=impldao.a2.getBean("daofact",daofact.class);
		List<porder> l = df.getPd().checkUser(getUser());
        
		if(l.size()!=0) {
				
			Map session = ActionContext.getContext().getSession();
			session.put("l", l);
			System.out.println(session);
			
        	return "success";
        }else {
        	return "error";
		
		
	}


	}
	
}
