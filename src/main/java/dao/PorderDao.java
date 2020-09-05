package dao;

import java.util.List;
import org.hibernate.SQLQuery;
import org.hibernate.Session;
import org.hibernate.Transaction;
import model.Porder;

public class PorderDao implements ImplDao {
	
	public static List<Porder> checkUser(String user) {
		Session se = ImplDao.getSe();
		SQLQuery q=se.createSQLQuery("select * from porder where user='" + user + "'");
		q.addEntity(Porder.class);
		List<Porder> l = q.list();
		return l;
	}
	//管理員刪除訂單
	public static List<Porder> checkId(Integer id) {
		Session se = ImplDao.getSe();
		SQLQuery q=se.createSQLQuery("select * from porder where id='" + id + "'");
		q.addEntity(Porder.class);
		List<Porder> l = q.list();
		return l;
	}
	
	//會員員刪除訂單
		public static List<Porder> checkIdUser(Integer id,String user) {
			Session se = ImplDao.getSe();
			SQLQuery q=se.createSQLQuery("select * from porder where id='" + id + "'and user='" + user + "'");
			q.addEntity(Porder.class);
			List<Porder> l = q.list();
			return l;
		}
	
	//查詢所有訂單資料	
	public static List<Porder> findallporder() {
		Session se = ImplDao.getSe();
		SQLQuery q=se.createSQLQuery("select * from porder ");
		q.addEntity(Porder.class);
		List<Porder> l = q.list();
		return l;
	}

	@Override
	public void add(Object o) {
		Session se = ImplDao.getSe();
		Transaction tx = se.beginTransaction();
		se.save(o);
		tx.commit();
		se.close();
	}

	@Override
	public Object get(int id) {
		Session se = ImplDao.getSe();
		Porder p = se.get(Porder.class, id);
		return p;
	}

	@Override
	public void update(int id, Object o) {
		Session se = ImplDao.getSe();
		Transaction tx = se.beginTransaction();
		Porder p = (Porder) o;
		Porder p1 = se.get(Porder.class, id);
		p1.setProduct1(p.getProduct1());
		p1.setProduct2(p.getProduct2());
		p1.setProduct3(p.getProduct3());
		p1.setUser(p.getUser());
		p1.setName(p.getName());
		p1.setPhone(p.getPhone());
		p1.setAddress(p.getAddress());
		se.update(p1);
		tx.commit();
		se.close();
	}
	
	public void update(Object o) {
		Session se = ImplDao.getSe();
		Transaction tx = se.beginTransaction();
		se.update(o);
		tx.commit();
		se.close();
	}

	@Override
	public void delete(Object o) {
		Session se = ImplDao.getSe();
		Transaction tx = se.beginTransaction();
		se.delete(o);
		tx.commit();
		se.close();
	}

}

