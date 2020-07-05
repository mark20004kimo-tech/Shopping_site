package dao;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import fact.daofactanno;
import fact.modelfactanno;



public interface impldao {
	// 連線方法
	static Session getse() {
		Configuration conn = new Configuration().configure();
		SessionFactory sf = conn.buildSessionFactory();
		Session se = sf.openSession();
		return se;
	}

	// sp1xml物件
	
	ApplicationContext a1 = new AnnotationConfigApplicationContext(modelfactanno.class);
	ApplicationContext a2 = new AnnotationConfigApplicationContext(daofactanno.class);

	// 新增物件
	void add(Object o);

	// 查詢物件
	Object get(int id);

	// 修改物件
	void update(int id, Object o);

	// 刪除物件

	void delete(Object o);
}
