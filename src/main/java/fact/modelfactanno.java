package fact;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import dao.managerado;
import model.manager;
import model.member;
import model.porder;

@Configuration
public class modelfactanno {
	private member m;
	private porder p;
    
	@Configuration
	public class appConfig {		
		@Bean(name="m")
		public member getM() {			
			return new member();
		}
		
		@Bean(name="p")
		public porder getP() {
			return new porder();
		}
		
		@Bean(name="mr")
		public manager getMr() {			
			return new manager();
		}
		
				
		@Bean(name="modelfact")
		public modelfact getF()
		{
			modelfact f=new modelfact();			
			f.setM(getM());
			f.setP(getP());	
			f.setMr(getMr());
			return f;
		}
	}
	}	

