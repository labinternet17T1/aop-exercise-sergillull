package cat.tecnocampus.aop;

import org.junit.After;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;

@Aspect
@Component

public class LoggerAdvice {
    private static final Logger logger = LoggerFactory.getLogger(LoggerAdvice.class);

    @Pointcut("execution(* cat.tecnocampus.application.controller.insert*(..))")
    public void pointcutFind() {}
    @After("pointcutFinds()")
    public void afterFind() {
        logger.info("Finding classrooms");
    }

    @Pointcut("execution(* cat.tecnocampus.application.controller.find*(..))")
    public void pointcutFind() {}
    @After("pointcutFinds()")
    public void afterFind() {
        logger.info("Finding classrooms");
    }

    @Pointcut("execution(* cat.tecnocampus.application.controller.insertBatch*(..))")
    public void insertBatch() {}
    @Around("pointcutNotes()")
    public List<NoteLab> dealRequestParam(ProceedingJoinPoint jp) {
        try {
            logger.info("Before showing batch");
            List<NoteLab> res = (List<NoteLab>) jp.proceed();
            logger.info("After showing user batch");
            return res;
        } catch (Throwable throwable) {
            logger.info("Showing batch: Something went wrong");
            throwable.printStackTrace();
            return new ArrayList<NoteLab>();
        }
    }
}
