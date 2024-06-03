package htwberlin.webtechbackend.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestParam;
@RestController
public class UserController {
    @GetMapping("/hello")
    public ResponseEntity<String> helloworld(@RequestParam("text") String text) {
        return ResponseEntity.ok("Hello World" + text);
    }
}
