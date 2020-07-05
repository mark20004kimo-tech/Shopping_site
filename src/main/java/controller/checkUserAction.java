package controller;

import dao.impldao;
import dao.memberdao;
import fact.daofact;
import fact.modelfact;
import model.member;

public class checkUserAction {
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
		modelfact mf=impldao.a1.getBean("modelfact",modelfact.class);
		daofact df=impldao.a2.getBean("daofact",daofact.class);
		int x = df.getMd().checkUserDu(getUser()).size();

		if (x != 0) {
			return "userduplicate";// 重複
		} else {			
			mf.getM().setUser(getUser());
			mf.getM().setPassword(getPassword());
			mf.getM().setName(getName());
			mf.getM().setPhone(getPhone());
			mf.getM().setAddress(getAddress());
			
			/*member m = new member();
			m.setUser(getUser());
			m.setPassword(getPassword());
			m.setName(getName());
            m.setPhone(getPhone());
            m.setAddress(getAddress());*/
			df.getMd().add(mf.getM());
			return "addmemberok";// 建立成功
		}
	}

}