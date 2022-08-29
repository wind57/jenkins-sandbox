package wind57.jenkins.sandbox.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import reactor.core.publisher.Mono;

@RestController
public class CommonDummy {

    @GetMapping("/common/dummy")
    public Mono<String> commonDummy() {
        return Mono.just("dummy");
    }

}
