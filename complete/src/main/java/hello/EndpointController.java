package hello;


import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.concurrent.atomic.AtomicLong;

@RestController
public class EndpointController {

    private final AtomicLong counter = new AtomicLong();

    private static final Logger logger = LoggerFactory.getLogger(EndpointController.class);

    @RequestMapping("/endpoint")
    public Endpoint endpoint(@RequestParam(value="name", defaultValue="World") String name) {

        logger.error("Endpoint Error!");
        return new Endpoint(counter.incrementAndGet(), "http://dev.to", name );
    }
}
