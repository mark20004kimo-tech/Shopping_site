package mrcontroller;

import java.util.List;

import com.opensymphony.xwork2.ActionSupport;

import dao.impldao;
import dao.memberdao;
import dao.porderdao;
import fact.daofact;
import fact.modelfact;
import model.manager;
import model.member;
import model.porder;

public class mrdeletememberAction extends ActionSupport {
	private int id;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String execute() throws Exception {
		modelfact mf=impldao.a1.getBean("modelfact",modelfact.class);
		daofact df=impldao.a2.getBean("daofact",daofact.class);
		int x = df.getMd().checkId(getId()).size();
		if(x != 0) {
			mf.getM().setId(getId());
			/*member m = new member();
			m.setId(getId());*/
			df.getMd().delete(mf.getM());
		    return "ok";
		}else {
			return "error";
		}
	}
}
