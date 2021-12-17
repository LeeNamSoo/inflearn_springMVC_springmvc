package hello.springmvc.basic;

import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@Slf4j //private final Logger log = LoggerFactory.getLogger(getClass()); 이걸 대신하는 Annotation
@RestController
public class LogTestController {
//    private final Logger log = LoggerFactory.getLogger(getClass());

    @RequestMapping("/log-test")
    public String logtest(){
        String name = "spring";
//        System.out.println("name = " + name);
        log.trace("trace log={}",name);
        log.debug("debug log={}",name);
        log.info("info log = {}",name);
        log.warn("warn log={}",name);
        log.error("error log={}",name);
        return "ok";
    }
}
