package dao;

import java.util.List;
import org.hibernate.SQLQuery;
import org.hibernate.Session;
import org.hibernate.Transaction;
import model.Member;

public class MemberDao implements ImplDao {

	// 帳號密碼檢查
	public static List<Member> checkUser(String user, String password) {
		Session se = ImplDao.getse();
		SQLQuery q=se.createSQLQuery("select * from member where user='" + user + "' and password='" + password + "'");
		q.addEntity(Member.class);
		List<Member> l = q.list();
		return l;
	}

	// 帳號重複檢查
	public static List<Member> checkUserDu(String user) {
		Session se = ImplDao.getse();
		SQLQuery q=se.createSQLQuery("select * from member where user='" + user + "'");
		q.addEntity(Member.class);
		List<Member> l = q.list();
		return l;
	}

	// 查詢所有會員資料
	public static List<Member> findallmember() {
		Session se = ImplDao.getse();
		SQLQuery q=se.createSQLQuery("select * from member");
		q.addEntity(Member.class);
		List<Member> l = q.list();
		return l;
	}
	
	// 查詢會員資料
	public static List<Member> findmember(Integer id) {
		Session se = ImplDao.getse();
		SQLQuery q=se.createSQLQuery("select * from member where id='" + id + "'");
		q.addEntity(Member.class);
		List<Member> l = q.list();
		return l;
	}
	
	//查詢Id
	public static List<Member> checkId(Integer id) {
		Session se = ImplDao.getse();
		SQLQuery q=se.createSQLQuery("select * from member where id='" + id + "'");
		q.addEntity(Member.class);
		List<Member> l = q.list();
		return l;
	}

	@Override
	public void add(Object o) {
		Session se = ImplDao.getse();
		Transaction tx = se.beginTransaction();
		se.save(o);
		tx.commit();
		se.close();
	}

	@Override
	public Object get(int id) {
		Session se = ImplDao.getse();
		Member m = se.get(Member.class, id);
		return m;
	}

	@Override
	public void update(int id, Object o) {
		Session se = ImplDao.getse();
		Transaction tx = se.beginTransaction();
		Member m = (Member) o;
		Member m1 = se.get(Member.class, id);
		m1.setName(m.getName());
		m1.setUser(m.getUser());
		m1.setPassword(m.getPassword());
		m1.setPhone(m.getPhone());
		m1.setAddress(m.getAddress());
		se.update(m1);
		tx.commit();
		se.close();
	}

	public void update(Object o) {
		Session se = ImplDao.getse();
		Transaction tx = se.beginTransaction();
		se.update(o);
		tx.commit();
		se.close();
	}

	@Override
	public void delete(Object o) {
		Session se = ImplDao.getse();
		Transaction tx = se.beginTransaction();
		se.delete(o);
		tx.commit();
		se.close();
	}

}

