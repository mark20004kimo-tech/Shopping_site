package controller;

import java.util.Map;
import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.ActionSupport;
import dao.ImplDao;
import fact.DaoFact;
import fact.ModelFact;
import model.Member;

public class UpdateUserAction extends ActionSupport{
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
		Member m = (Member) session.get("M");	
		ModelFact mf=ImplDao.a1.getBean("modelfact",ModelFact.class);
		DaoFact df=ImplDao.a2.getBean("daofact",DaoFact.class);
		
		mf.getM().setId(m.getId());
		mf.getM().setUser(m.getUser());
		mf.getM().setPassword(getPassword());
		mf.getM().setName(getName());
		mf.getM().setPhone(getPhone());
		mf.getM().setAddress(getAddress());
		
		df.getMd().update(mf.getM());

			return "ok";
		
		}
	}



