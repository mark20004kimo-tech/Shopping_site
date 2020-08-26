package mrcontroller;

import java.util.List;
import java.util.Map;

import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.ActionSupport;
import dao.ImplDao;
import fact.DaoFact;

public class MrFindManagerAction extends ActionSupport{
	private Integer id;
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String execute() throws Exception {
		DaoFact df=ImplDao.a2.getBean("daofact",DaoFact.class);
		List l = df.getMrd().findallmanager();
			
			Map session = ActionContext.getContext().getSession();	
			session.put("Mr2",l);
        	return "ok";
	}
	
}