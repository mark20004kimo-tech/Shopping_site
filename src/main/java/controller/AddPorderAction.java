package controller;

import java.util.Map;

import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.ActionSupport;

import dao.ImplDao;
import fact.DaoFact;
import model.Porder;

public class AddPorderAction extends ActionSupport{
	public String execute() throws Exception {
    Map session=ActionContext.getContext().getSession();
		
		Porder p=(Porder) session.get("P");
		
		DaoFact df=ImplDao.a2.getBean("daofact",DaoFact.class);
		df.getPd().add(p);
		
		return "finish";

	}
}