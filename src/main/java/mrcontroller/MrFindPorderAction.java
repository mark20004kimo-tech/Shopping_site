package mrcontroller;

import java.util.List;
import java.util.Map;

import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.ActionSupport;

import dao.ImplDao;
import fact.DaoFact;

public class MrFindPorderAction extends ActionSupport{
	
	public String execute() throws Exception {
		DaoFact df=ImplDao.a2.getBean("daofact",DaoFact.class);
		List l = df.getPd().findallporder();
			
			Map session = ActionContext.getContext().getSession();	
			session.put("P2",l);
        	return "ok";
	}
	
}
