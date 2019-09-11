package core.utils;

import org.apache.log4j.Level;
import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;

public final class Log {
    private static final String LOG4J_PROPERTIES = "log4j.properties";
    private static Log log;
    private static Logger logger = Logger.getLogger(Log.class);

    private Log() {
        super();
    }

    public static Log getInstance() {
        if (log == null) {
            log = new Log();
            PropertyConfigurator.configure(LOG4J_PROPERTIES);
            logger.setLevel(Level.ALL);
        }
        return log;
    }

    public Logger getLogger() {
        return logger;
    }
}
