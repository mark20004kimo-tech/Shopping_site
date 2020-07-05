package controller;

import java.util.Map;
import com.opensymphony.xwork2.ActionContext;

import dao.impldao;
import dao.porderdao;
import fact.daofact;
import model.member;
import model.porder;

public class updateporderAction {
	public String execute() throws Exception {
    Map session=ActionContext.getContext().getSession();
		
		porder p=(porder) session.get("PP");
		daofact df=impldao.a2.getBean("daofact",daofact.class);
		df.getPd().update(p);
		//new porderdao().update(p);
		
		return "finish";

	}
}
