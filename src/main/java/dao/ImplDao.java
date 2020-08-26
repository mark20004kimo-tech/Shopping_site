package dao;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import fact.DaoFactAnno;
import fact.ModelFactAnno;

public interface ImplDao {
	// 連線方法
	static Session getse() {
		Configuration conn = new Configuration().configure();
		SessionFactory sf = conn.buildSessionFactory();
		Session se = sf.openSession();
		return se;
	}

	// sp1xml物件
	
	ApplicationContext a1 = new AnnotationConfigApplicationContext(ModelFactAnno.class);
	ApplicationContext a2 = new AnnotationConfigApplicationContext(DaoFactAnno.class);

	// 新增物件
	void add(Object o);

	// 查詢物件
	Object get(int id);

	// 修改物件
	void update(int id, Object o);

	// 刪除物件

	void delete(Object o);
}
