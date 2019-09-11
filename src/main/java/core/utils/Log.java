package core.utils;

import org.apache.log4j.Level;
import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;

/**
 * This class is used to generate log.
 *
 * @author Limbert Alvaro Vargas Laura
 * @version 0.0.1
 */
public final class Log {
    private static final String LOG4J_PROPERTIES = "log4j.properties";
    private static Log log;
    private static Logger logger = Logger.getLogger(Log.class);

    /**
     * Private constructor for the Singleton pattern.
     */
    private Log() {
        super();
    }

    /**
     * This method ensures that only one instance is created according
     * to the builder pattern and returns a log instance.
     *
     * @return an 'log' of Log.
     */
    public static Log getInstance() {
        if (log == null) {
            log = new Log();
            PropertyConfigurator.configure(LOG4J_PROPERTIES);
            logger.setLevel(Level.ALL);
        }
        return log;
    }

    /**
     * This method returns a 'log' with which more loggers can be added.
     *
     * @return a 'logger'.
     */
    public Logger getLogger() {
        return logger;
    }
}
