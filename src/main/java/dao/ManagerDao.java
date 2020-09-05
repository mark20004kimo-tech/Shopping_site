package dao;

import java.util.List;

import org.hibernate.Query;
import org.hibernate.SQLQuery;
import org.hibernate.Session;
import org.hibernate.Transaction;
import model.Manager;


public class ManagerDao implements ImplDao{
	// 帳號密碼檢查
		public static List<Manager> checkUser(String user, String password) {
			Session se = ImplDao.getSe();
			SQLQuery q=se.createSQLQuery("select * from manager where user='" + user + "' and password='" + password + "'");
			q.addEntity(Manager.class);
			List<Manager> l = q.list();
			return l;
		}

		// 帳號重複檢查
		public static List<Manager> checkUserDu(String user) {
			Session se = ImplDao.getSe();
			SQLQuery q=se.createSQLQuery("select * from manager where user='" + user + "'");
			q.addEntity(Manager.class);
			List<Manager> l = q.list();
			return l;
		}
		
		//查詢Id
		public static List<Manager> checkId(Integer id) {
			Session se = ImplDao.getSe();
			SQLQuery q=se.createSQLQuery("select * from manager where id='" + id + "'");
			q.addEntity(Manager.class);
			List<Manager> l = q.list();
			return l;
		}
		
		//查詢所有管理員資料
		public static List<Manager> findallmanager() {
			Session se = ImplDao.getSe();
			SQLQuery q=se.createSQLQuery("select * from manager");
			q.addEntity(Manager.class);
			List<Manager> l = q.list();
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
		Manager mr = se.get(Manager.class, id);
		return mr;
	}

	@Override
	public void update(int id, Object o) {
		Session se = ImplDao.getSe();
		Transaction tx = se.beginTransaction();
		Manager mr = (Manager) o;
		Manager mr1 = se.get(Manager.class, id);
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

