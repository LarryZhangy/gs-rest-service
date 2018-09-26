package hello;


import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.concurrent.atomic.AtomicLong;

@RestController
public class DeploygroupController {

    private final AtomicLong counter = new AtomicLong();

    private static final Logger logger = LoggerFactory.getLogger(DeploygroupController.class);

    @RequestMapping("/deploygroup")
    public DeployGroup deploygroup(@RequestParam(value="name", defaultValue="World") String name) {

        logger.error("Deploy Group Error!");
        return new DeployGroup(counter.incrementAndGet(), "wukong", name );
    }
}
