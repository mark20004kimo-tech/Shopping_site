package mrcontroller;

import java.util.List;
import java.util.Map;

import javax.servlet.http.HttpSession;

import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.ActionSupport;
import dao.impldao;
import fact.daofact;
import model.manager;
import model.member;


public class mrfindmanagerAction extends ActionSupport{
	private Integer id;
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String execute() throws Exception {
		daofact df=impldao.a2.getBean("daofact",daofact.class);
		List l = df.getMrd().findallmanager();
			
			Map session = ActionContext.getContext().getSession();	
			session.put("Mr2",l);
        	return "ok";
	}
	
}
