package UsingLog4j;

import org.apache.log4j.BasicConfigurator;

public class UseCalculations {
	public static void main(String[] args) {
		Calculations c1=new Calculations();
		BasicConfigurator.configure();
		
		int num1=10;
		int num2=20;
		
		c1.add(num1,num2);
		
		
		
	}
		
	}


