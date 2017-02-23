package gae.colors.deck.cards.logger;

import java.io.IOException;

import org.apache.log4j.Appender;
import org.apache.log4j.FileAppender;
import org.apache.log4j.Logger;
import org.apache.log4j.Priority;
import org.apache.log4j.SimpleLayout;

public class CardLogger {

	private final static Logger logger = Logger.getLogger(CardLogger.class);

	public void info(final Object message) {
		org.apache.log4j.BasicConfigurator.configure();
		logger.setPriority(Priority.INFO);
		storeLogs(message);
	}

	public void warn(final Object message) {
		org.apache.log4j.BasicConfigurator.configure();
		logger.setPriority(Priority.WARN);
		storeLogs(message);
	}

	public void error(final Object message, Exception e) {
		
		logger.setPriority(Priority.ERROR);
		storeLogs(message,e);
	}

	public static void storeLogs(final Object message) {
		Appender fh = null;
		try {
			fh = new FileAppender(new SimpleLayout(), "C:/Data/log/card-colors.log");
			logger.addAppender(fh);
			fh.setLayout(new SimpleLayout());
		} catch (SecurityException e) {
			logger.error(e.getMessage(),e);
		} catch (IOException e) {
			logger.error(e.getMessage(),e);
		}
		
		if(logger.getPriority() == Priority.INFO){
			logger.info(message);
		} else if (logger.getPriority() == Priority.WARN) {
			logger.warn(message);
		}
	}
	
	public static void storeLogs(final Object message,Exception e) {
		Appender fh = null;
		try {
			fh = new FileAppender(new SimpleLayout(), "C:/Data/log/card-colors.log");
			logger.addAppender(fh);
			fh.setLayout(new SimpleLayout());
		} catch (SecurityException ex) {
			logger.error(e.getMessage(),e);
		} catch (IOException ex) {
			logger.error(e.getMessage(),e);
		}
		
		if(logger.getPriority() == Priority.ERROR){
			logger.error(message,e);
		}
	}
}
