package mrcontroller;

import com.opensymphony.xwork2.ActionSupport;

import dao.ImplDao;
import fact.DaoFact;
import fact.ModelFact;

public class MrCheckManagerAction extends ActionSupport{
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
		int x = df.getMrd().checkUserDu(getUser()).size();

		if (x != 0) {
			return "userduplicate";// 重複
		} else {
			mf.getMr().setUser(getUser());
			mf.getMr().setPassword(getPassword());
			mf.getMr().setName(getName());
			mf.getMr().setPhone(getPhone());
			mf.getMr().setAddress(getAddress());

			df.getMrd().add(mf.getMr());
			return "addmanagerok";// 建立成功
		}
	}
}


