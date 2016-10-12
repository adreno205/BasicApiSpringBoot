package hello.controller;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;


@RestController
public class HelloController {

    @RequestMapping("/")
    public String index() {
        return "Hail Hydra!";
    }

    @RequestMapping(value="/{name}/{last}", method = RequestMethod.GET)
    public String testPath(@PathVariable String name, @PathVariable("last") String last){
        return "Hello, " + name + " " + last;
    }


}
