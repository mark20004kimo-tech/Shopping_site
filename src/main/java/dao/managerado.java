package dao;

import java.util.List;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.Transaction;
import model.manager;
import model.porder;


public class managerado implements impldao{
	// 帳號密碼檢查
		public static List<manager> checkUser(String user, String password) {
			Session se = impldao.getse();
			Query q = se.createQuery("from manager where user='" + user + "' and password='" + password + "'");
			List<manager> l = q.list();
			return l;
		}

		// 帳號重複檢查
		public static List<manager> checkUserDu(String user) {
			Session se = impldao.getse();
			Query q = se.createQuery("from manager where user='" + user + "'");
			List<manager> l = q.list();
			return l;
		}
		
		//查詢Id
		public static List<manager> checkId(Integer id) {
			Session se = impldao.getse();
			Query q = se.createQuery("from manager where id='" + id + "'");
			List<manager> l = q.list();
			return l;
		}
		
		//查詢所有管理員資料
		public static List<manager> findallmanager() {
			Session se = impldao.getse();
			Query q = se.createQuery("from manager");
			List<manager> l = q.list();
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
		manager mr = se.get(manager.class, id);
		return mr;
	}

	@Override
	public void update(int id, Object o) {
		Session se = impldao.getse();
		Transaction tx = se.beginTransaction();
		manager mr = (manager) o;
		manager mr1 = se.get(manager.class, id);
		mr1.setName(mr.getName());
		mr1.setUser(mr.getUser());
		mr1.setPassword(mr.getPassword());
		mr1.setPhone(mr.getPhone());
		mr1.setAddress(mr.getAddress());
		se.update(mr1);
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
