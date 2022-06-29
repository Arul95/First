package UsingLog4j;

import org.apache.log4j.BasicConfigurator;
import org.apache.log4j.Logger;

public class Usinglog4j {
	static Logger log=Logger.getLogger(Usinglog4j.class);
	public static void main(String[] args) {
		BasicConfigurator.configure();
		log.info("Hi");
		log.error("SyntaxError");
		log.debug("debugging");
		log.warn("UseCapitalLetter");
		log.fatal("Cant avoid");
	}

}
