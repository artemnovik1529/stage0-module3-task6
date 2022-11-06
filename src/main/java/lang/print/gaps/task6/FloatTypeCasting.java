package lang.print.gaps.task6;


import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.core.Logger;

public class FloatTypeCasting {
    private static final Logger logger = (Logger) LogManager.getLogger();
    public void roundNumber(float numberToBeRounded) {
        int number = (int) numberToBeRounded;
        logger.info(number);

    }
}
