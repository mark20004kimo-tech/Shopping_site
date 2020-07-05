package mrcontroller;

import java.util.List;
import java.util.Map;
import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.ActionSupport;
import dao.impldao;
import dao.memberdao;
import fact.daofact;
import model.manager;
import model.member;

//此頁為接收login之資訊
public class mrloginAction extends ActionSupport{
	private String user;
	private String password;

	
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
	
	
	public String execute() throws Exception
	{
		
		
		daofact df=impldao.a2.getBean("daofact",daofact.class);
		 //將資料庫資料轉session供後續購物車資料使用
         List l=df.getMrd().checkUser(user, password);
		
		
		if(l.size()!=0)
		{
			Object[] o=l.toArray();
			manager mr=(manager)o[0];
			System.out.println(mr);
			Map session = ActionContext.getContext().getSession();	
			session.put("Mr",mr);
			
			return "loginok";
		}else{
			return "addmember";
		}
	}		
}
