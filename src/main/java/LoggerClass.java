import threads.Main;

import java.io.IOException;
import java.util.logging.*;

public class LoggerClass {
    public static void main(String[] args) throws IOException {
        Logger logger = Logger.getLogger(Main.class.getName());
        logger.log(Level.WARNING, "Hello " + logger.getName());
        logger.severe("Severe Log");
        logger.warning("Warning Log");
        logger.info("Info Log");

        //handler
        Handler fileHandler = new FileHandler("default.log");
        logger.addHandler(fileHandler);
        fileHandler.setFormatter(new XMLFormatter());
        logger.info("Info log message");

        //filter
        Filter filter = new FilterExample();
        logger.setFilter(filter);
        logger.severe("Severe Log");
        logger.info("Info Log");
        logger.warning("Warning Log");
    }
}

class FilterExample implements Filter {

    @Override
    public boolean isLoggable(LogRecord record) {
        return record.getLevel() == Level.INFO;
    }
}
