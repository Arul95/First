package UsingLog4j;

import org.apache.log4j.BasicConfigurator;
import org.apache.log4j.Logger;

public class Calculations {
	static Logger log=Logger.getLogger(Calculations.class);
	
	
	
	public void add(int num1,int num2) {
		log.info(num1+num2);
		
	}
	
	
}
