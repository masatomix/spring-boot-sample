package nu.mine.kino.web;

import java.util.Map;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/hello")
public class Example {

    @RequestMapping(method = RequestMethod.GET)
    String home() {
        return "Hello World!";
    }

    public Object find(Map<String, String> params) {
        return params;
    }

}