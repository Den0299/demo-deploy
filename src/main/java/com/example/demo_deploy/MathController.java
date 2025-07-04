package com.example.demo_deploy;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/math")
public class MathController {

    @GetMapping("/sum")
    public ResponseEntity<Integer> sum(Integer a, Integer b) {
        Integer somma = a+b;

        return ResponseEntity.ok(somma);
    }
}
