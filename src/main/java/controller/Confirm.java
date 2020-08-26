package controller;

import java.util.Map;
import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.ActionSupport;
import dao.ImplDao;
import fact.ModelFact;
import model.Member;

public class Confirm extends ActionSupport {
	private Integer id;
	private Integer pro1;
	private Integer pro2;
	private Integer pro3;

	public Integer getPro1() {
		return pro1;
	}

	public void setPro1(Integer pro1) {
		this.pro1 = pro1;
	}

	public Integer getPro2() {
		return pro2;
	}

	public void setPro2(Integer pro2) {
		this.pro2 = pro2;
	}

	public Integer getPro3() {
		return pro3;
	}

	public void setPro3(Integer pro3) {
		this.pro3 = pro3;
	}
	

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String execute() throws Exception {
		Map session = ActionContext.getContext().getSession();

		Member m = (Member) session.get("M");
		
		ModelFact mf=ImplDao.a1.getBean("modelfact",ModelFact.class);
        mf.getP().setProduct1(getPro1());
        mf.getP().setProduct2(getPro2());
        mf.getP().setProduct3(getPro3());
        mf.getP().setName(m.getName());
        mf.getP().setPhone(m.getPhone());
        mf.getP().setAddress(m.getAddress());
        mf.getP().setUser(m.getUser());
        mf.getP().setSum(mf.getP().getProduct1()*50+mf.getP().getProduct2()*60
        		+mf.getP().getProduct3()*70);
        
		session.put("P",  mf.getP());
		return "confirm";

	}
}

