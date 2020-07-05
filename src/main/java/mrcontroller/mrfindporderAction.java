package mrcontroller;

import java.util.List;
import java.util.Map;

import javax.servlet.http.HttpSession;

import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.ActionSupport;
import dao.impldao;
import fact.daofact;
import model.member;
import model.porder;


public class mrfindporderAction extends ActionSupport{
	
	public String execute() throws Exception {
		daofact df=impldao.a2.getBean("daofact",daofact.class);
		List l = df.getPd().findallporder();
			
			Map session = ActionContext.getContext().getSession();	
			session.put("P2",l);
        	return "ok";
	}
	
}
