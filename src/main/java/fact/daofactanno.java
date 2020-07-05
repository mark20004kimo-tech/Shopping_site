package fact;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import dao.managerado;
import dao.memberdao;
import dao.porderdao;



@Configuration
public class daofactanno {
	@Bean(name="m")
	public memberdao getM()
	{
		return new memberdao();
	}
	
	
	@Bean(name="p")
	public porderdao getP()
	{
		return new porderdao();
	}
	
	@Bean(name="mr")
	public managerado getMr()
	{
		return new managerado();
	}
	
	@Bean(name="daofact")
	public daofact getF()
	{
		daofact f=new daofact();
		
		f.setMd(getM());
		f.setPd(getP());
		f.setMrd(getMr());
		return f;
	}
	

}
