package mrcontroller;

import java.util.List;
import java.util.Map;

import javax.servlet.http.HttpSession;

import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.ActionSupport;
import dao.impldao;
import fact.daofact;


public class mrfindmemberAction extends ActionSupport {

	public String execute() throws Exception {
		daofact df = impldao.a2.getBean("daofact", daofact.class);
		List l = df.getMd().findallmember();
		
			Map session = ActionContext.getContext().getSession();
			session.put("ll", l);
			return "ok";
		} 

	}


