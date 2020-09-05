package controller;

import java.util.Map;

import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.ActionSupport;

import dao.ImplDao;
import fact.DaoFact;
import fact.ModelFact;
import model.Member;

public class DeletePorderAction extends ActionSupport {
	private int id;
	private String user;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getUser() {
		return user;
	}

	public void setUser(String user) {
		this.user = user;
	}

	public String execute() throws Exception {
		ModelFact mf=ImplDao.a1.getBean("modelfact",ModelFact.class);
		DaoFact df=ImplDao.a2.getBean("daofact",DaoFact.class);
		
		Map session = ActionContext.getContext().getSession();
		Member m = (Member) session.get("M");
		
		int x = df.getPd().checkIdUser(getId(),getUser()).size();
		
		
		if(x != 0 /*&& m.getUser().equals(df.getPd().checkIdUser(id, user))*/) {
			mf.getP().setId(getId());
			mf.getP().setUser(getUser());
			df.getPd().delete(mf.getP());
		    return "ok";
		}else {
			return "error";
		}
	}
}
