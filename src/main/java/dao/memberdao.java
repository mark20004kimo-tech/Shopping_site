package dao;

import java.util.List;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.Transaction;

import model.manager;
import model.member;
import model.porder;

public class memberdao implements impldao {

	// 帳號密碼檢查
	public static List<member> checkUser(String user, String password) {
		Session se = impldao.getse();
		Query q = se.createQuery("from member where user='" + user + "' and password='" + password + "'");
		List<member> l = q.list();
		return l;
	}

	// 帳號重複檢查
	public static List<member> checkUserDu(String user) {
		Session se = impldao.getse();
		Query q = se.createQuery("from member where user='" + user + "'");
		List<member> l = q.list();
		return l;
	}

	// 查詢所有會員資料
	public static List<member> findallmember() {
		Session se = impldao.getse();
		Query q = se.createQuery("from member");
		List<member> l = q.list();
		return l;
	}
	
	// 查詢會員資料
	public static List<member> findmember(Integer id) {
		Session se = impldao.getse();
		Query q = se.createQuery("from member where id='" + id + "'");
		List<member> l = q.list();
		return l;
	}
	
	//查詢Id
	public static List<member> checkId(Integer id) {
		Session se = impldao.getse();
		Query q = se.createQuery("from member where id='" + id + "'");
		List<member> l = q.list();
		return l;
	}

	@Override
	public void add(Object o) {
		Session se = impldao.getse();
		Transaction tx = se.beginTransaction();
		se.save(o);
		tx.commit();
		se.close();
	}

	@Override
	public Object get(int id) {
		Session se = impldao.getse();
		member m = se.get(member.class, id);
		return m;
	}

	@Override
	public void update(int id, Object o) {
		Session se = impldao.getse();
		Transaction tx = se.beginTransaction();
		member m = (member) o;
		member m1 = se.get(member.class, id);
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
		Session se = impldao.getse();
		Transaction tx = se.beginTransaction();
		se.update(o);
		tx.commit();
		se.close();
	}

	@Override
	public void delete(Object o) {
		Session se = impldao.getse();
		Transaction tx = se.beginTransaction();
		se.delete(o);
		tx.commit();
		se.close();
	}

}
