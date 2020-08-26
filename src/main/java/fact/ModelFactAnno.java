package fact;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import model.Manager;
import model.Member;
import model.Porder;

@Configuration
public class ModelFactAnno {
	private Member m;
	private Porder p;
    
	@Configuration
	public class appConfig {		
		@Bean(name="m")
		public Member getM() {			
			return new Member();
		}
		
		@Bean(name="p")
		public Porder getP() {
			return new Porder();
		}
		
		@Bean(name="mr")
		public Manager getMr() {			
			return new Manager();
		}
		
				
		@Bean(name="modelfact")
		public ModelFact getF()
		{
			ModelFact f=new ModelFact();			
			f.setM(getM());
			f.setP(getP());	
			f.setMr(getMr());
			return f;
		}
	}
	}	


