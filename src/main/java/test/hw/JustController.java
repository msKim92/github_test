package test.hw;


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/")
public class JustController {

    @GetMapping
    public String hello() {
        return "To-do-Application";
    }
}
