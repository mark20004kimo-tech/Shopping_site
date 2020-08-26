package mrcontroller;

import com.opensymphony.xwork2.ActionSupport;

import dao.ImplDao;
import fact.DaoFact;
import fact.ModelFact;

public class MrDeleteManagerAction extends ActionSupport {
	private int id;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String execute() throws Exception {
		ModelFact mf=ImplDao.a1.getBean("modelfact",ModelFact.class);
		DaoFact df=ImplDao.a2.getBean("daofact",DaoFact.class);
		int x = df.getMrd().checkId(getId()).size();
		if(x != 0) {
			mf.getMr().setId(getId());

			df.getMrd().delete(mf.getMr());
		    return "ok";
		}else {
			return "error";
		}
	}
}

