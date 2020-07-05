package controller;

import java.util.Map;

import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.ActionSupport;

import dao.impldao;
import dao.porderdao;
import fact.daofact;
import fact.modelfact;
import model.member;
import model.porder;

public class updateconfirm extends ActionSupport {
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

		member m = (member) session.get("M");
		modelfact mf=impldao.a1.getBean("modelfact",modelfact.class);
		daofact df=impldao.a2.getBean("daofact",daofact.class);
		
		int x = df.getPd().checkId(getId()).size();
		if(x != 0) {
		mf.getP().setId(getId());
		mf.getP().setProduct1(getPro1());
		mf.getP().setProduct2(getPro2());
		mf.getP().setProduct3(getPro3());
		mf.getP().setAddress(m.getAddress());
		mf.getP().setPhone(m.getPhone());
		mf.getP().setSum(mf.getP().getProduct1()*50+mf.getP().getProduct2()*60
				+mf.getP().getProduct3()*70);
		mf.getP().setUser(m.getUser());
		mf.getP().setName(m.getName());
		
		/*porder p=new porder();
		p.setId(getId());
		p.setProduct1(getPro1());
		p.setProduct2(getPro2());
		p.setProduct3(getPro3());
		p.setAddress(m.getAddress());
		p.setPhone(m.getPhone());
		p.setSum(p.getProduct1()*50+p.getProduct2()*60+p.getProduct3()*70);
		p.setUser(m.getUser());
		p.setName(m.getName());*/
		
		session.put("PP", mf.getP());
		return "updateconfirm";
		}else {
			return "error";
		}
	}
}
