package controller;

import java.util.List;
import java.util.Map;
import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.ActionSupport;
import dao.ImplDao;
import fact.DaoFact;
import model.Porder;

public class FindPorderAction extends ActionSupport{
	private String user;
		    
	public String getUser() {
		return user;
	}

	public void setUser(String user) {
		this.user = user;
	}


	public String execute() throws Exception {
		DaoFact df=ImplDao.a2.getBean("daofact",DaoFact.class);
		List<Porder> l = df.getPd().checkUser(getUser());
        
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

