package com.ai.first_ai_project;


import org.springframework.ai.ollama.OllamaChatModel;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import reactor.core.publisher.Flux;

@RestController
@RequestMapping("/ai")
public class AiController {

//    private static final String PROMPT = "What is Java Language";

    private OllamaChatModel client;

    public AiController(OllamaChatModel client) {
        this.client = client;
    }


    @GetMapping("/prompt")
    public Flux<String> promptResponse(@RequestParam("prompt") String prompt){
        return client.stream(prompt);
    }

}
