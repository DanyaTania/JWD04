import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
public class LoggerTest {




        public static final Logger LOGGER = LoggerFactory.getLogger(LoggerTest.class);

        public static void main(String[] args) {
            ProceraServer proceraServer=new ProceraServer();
            LOGGER.info("Test log record!!!");
            LOGGER.error("В программе возникла ошибка!");

        }
    }

