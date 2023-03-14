package co.develhope.loggingServices.Services;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.env.Environment;
import org.springframework.stereotype.Service;

@Service
public class MathService {
    Logger logger = LoggerFactory.getLogger(MathService.class);
    @Autowired
    Environment environment;
    public int powerOfANumber(){
        try {
            logger.info("Starting Operation");
            return (int) Math.pow(Integer.parseInt(environment.getProperty("a")), Integer.parseInt(environment.getProperty("b")));
        }finally {
            logger.info("Finish the Operation");
        }
    }
}
