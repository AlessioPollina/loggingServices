package co.develhope.loggingServices.Controllers;

import co.develhope.loggingServices.Services.MathService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HomeController {

    @Autowired
    MathService mathService;

    Logger logger = LoggerFactory.getLogger(HomeController.class);

    @GetMapping("/")
    public String welcomeMessage(){
        logger.info("This is a logging of User");
        return "Hello";
    }

    @GetMapping("/exp")
    public int mathServices(){
        return mathService.powerOfANumber();
    }

    @GetMapping("/get-errors")
    public void getError() {
        Error error = new Error("This is the error");
        logger.error("This is a ERROR logging", error);
    }
}
