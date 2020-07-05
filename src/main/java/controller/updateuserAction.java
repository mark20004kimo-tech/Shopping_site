package controller;

import java.util.Map;

import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.ActionSupport;

import dao.impldao;
import dao.memberdao;
import dao.porderdao;
import fact.daofact;
import fact.modelfact;
import model.member;
import model.porder;

public class updateuserAction extends ActionSupport{
	private Integer id;
	private String user;
	private String password;
	private String name;
	private String phone;
	private String address;

	
	public Integer getId() {
		return id;
	}


	public void setId(Integer id) {
		this.id = id;
	}


	public String getUser() {
		return user;
	}


	public void setUser(String user) {
		this.user = user;
	}


	public String getPassword() {
		return password;
	}


	public void setPassword(String password) {
		this.password = password;
	}


	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	public String getPhone() {
		return phone;
	}


	public void setPhone(String phone) {
		this.phone = phone;
	}


	public String getAddress() {
		return address;
	}


	public void setAddress(String address) {
		this.address = address;
	}


	public String execute() throws Exception {
		Map session = ActionContext.getContext().getSession();
		member m = (member) session.get("M");	
		modelfact mf=impldao.a1.getBean("modelfact",modelfact.class);
		daofact df=impldao.a2.getBean("daofact",daofact.class);
		
		mf.getM().setId(m.getId());
		mf.getM().setUser(m.getUser());
		mf.getM().setPassword(getPassword());
		mf.getM().setName(getName());
		mf.getM().setPhone(getPhone());
		mf.getM().setAddress(getAddress());
		
		df.getMd().update(mf.getM());
			
		/*member m1 = new member();
		    m1.setId(m.getId());
		    m1.setUser(m.getUser());
		    m1.setPassword(getPassword());
		    m1.setName(getName());
		    m1.setPhone(getPhone());
		    m1.setAddress(getAddress());
			new memberdao().update(m1);*/
		
			return "ok";
		
		}
	}


