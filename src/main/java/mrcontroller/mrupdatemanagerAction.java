package mrcontroller;

import java.util.Map;

import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.ActionSupport;

import dao.impldao;
import dao.memberdao;
import dao.porderdao;
import fact.daofact;
import fact.modelfact;
import model.manager;
import model.member;
import model.porder;

public class mrupdatemanagerAction extends ActionSupport{
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
		manager mr = (manager) session.get("Mr");	
		modelfact mf=impldao.a1.getBean("modelfact",modelfact.class);
		daofact df=impldao.a2.getBean("daofact",daofact.class);
		
		mf.getMr().setId(mr.getId());
		mf.getMr().setUser(mr.getUser());
		mf.getMr().setPassword(getPassword());
		mf.getMr().setName(getName());
		mf.getMr().setPhone(getPhone());
		mf.getMr().setAddress(getAddress());
		    
		/*manager mr1 = new manager();
		    mr1.setId(mr.getId());
		    mr1.setUser(mr.getUser());
		    mr1.setPassword(getPassword());
		    mr1.setName(getName());
		    mr1.setPhone(getPhone());
		    mr1.setAddress(getAddress());
			new managerdao().update(mr1);*/
		
		df.getMrd().update(mf.getMr());
		
			return "ok";
		
		}
}

