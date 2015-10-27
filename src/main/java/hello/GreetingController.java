
package hello;

import java.util.concurrent.atomic.AtomicLong;

import org.springframework.web.bind.annotation.PathVariable;
//import org.springframework.stereotype.controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/greeting")
public class GreetingController {

    private static final String template = "Hello + %s!";
   // private static final Integer template1 = 2;
   // private static final Integer template12 = 2;
    private final AtomicLong counter = new AtomicLong();

    @RequestMapping(value = "/{name}/{name1}",method =RequestMethod.GET)
    public Greeting greeting(@PathVariable String name,@PathVariable String name1) {
        return new Greeting(counter.incrementAndGet(),
                            (Integer.parseInt(name)+Integer.parseInt(name1)));
    }
    
   
    
}
