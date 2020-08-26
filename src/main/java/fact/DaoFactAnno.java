package fact;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import dao.ManagerDao;
import dao.MemberDao;
import dao.PorderDao;

@Configuration
public class DaoFactAnno {
	@Bean(name="m")
	public MemberDao getM()
	{
		return new MemberDao();
	}
	
	
	@Bean(name="p")
	public PorderDao getP()
	{
		return new PorderDao();
	}
	
	@Bean(name="mr")
	public ManagerDao getMr()
	{
		return new ManagerDao();
	}
	
	@Bean(name="daofact")
	public DaoFact getF()
	{
		DaoFact f=new DaoFact();
		
		f.setMd(getM());
		f.setPd(getP());
		f.setMrd(getMr());
		return f;
	}
	

}

