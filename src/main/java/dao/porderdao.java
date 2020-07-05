package dao;

import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.Transaction;

import model.member;
import model.porder;

public class porderdao implements impldao {
	
	public static List<porder> checkUser(String user) {
		Session se = impldao.getse();
		Query q = se.createQuery("from porder where user='" + user + "'");
		List<porder> l = q.list();
		return l;
	}
	
	public static List<porder> checkId(Integer id) {
		Session se = impldao.getse();
		Query q = se.createQuery("from porder where id='" + id + "'");
		List<porder> l = q.list();
		return l;
	}
	
	//查詢所有訂單資料	
	public static List<porder> findallporder() {
		Session se = impldao.getse();
		Query q = se.createQuery("from porder ");
		List<porder> l = q.list();
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
		porder p = se.get(porder.class, id);
		return p;
	}

	@Override
	public void update(int id, Object o) {
		Session se = impldao.getse();
		Transaction tx = se.beginTransaction();
		porder p = (porder) o;
		porder p1 = se.get(porder.class, id);
		p1.setProduct1(p.getProduct1());
		p1.setProduct2(p.getProduct2());
		p1.setProduct3(p.getProduct3());
		p1.setName(p.getName());
		p1.setPhone(p.getPhone());
		p1.setAddress(p.getAddress());
		se.update(p1);
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
