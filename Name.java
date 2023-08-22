package com.example.demo.Controllers;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
@RestController

public class Name {
	@Value("${studentName}")
    private String Name;
    @GetMapping("Name")
    public String getName() {
    	
		return "Welcome "+Name+"!";
    }
}
