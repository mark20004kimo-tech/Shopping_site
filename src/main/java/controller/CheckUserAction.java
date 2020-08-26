package controller;

import com.opensymphony.xwork2.ActionSupport;

import dao.ImplDao;
import fact.DaoFact;
import fact.ModelFact;

public class CheckUserAction extends ActionSupport{
	private String user;
	private String password;
	private String name;
	private String phone;
	private String address;

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
		ModelFact mf=ImplDao.a1.getBean("modelfact",ModelFact.class);
		DaoFact df=ImplDao.a2.getBean("daofact",DaoFact.class);
		int x = df.getMd().checkUserDu(getUser()).size();

		if (x != 0) {
			return "userduplicate";// 重複
		} else {			
			mf.getM().setUser(getUser());
			mf.getM().setPassword(getPassword());
			mf.getM().setName(getName());
			mf.getM().setPhone(getPhone());
			mf.getM().setAddress(getAddress());

			df.getMd().add(mf.getM());
			return "addmemberok";// 建立成功
		}
	}



}
