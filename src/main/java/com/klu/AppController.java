package com.klu;

import java.util.Arrays;
import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class AppController {
	@GetMapping("demo")
   public int fun1() {
	 return 10;
	}
	
	@GetMapping("demo2")
	public String fun2() {
	  return "Welcome to KL University";
	}
	 
	@GetMapping("/demo3/{a}/{b}")
    public int fun3(@PathVariable("a") int a, @PathVariable("b") int b) {
		return a+b;
	}
	
		@GetMapping("/welcome")
	    public String welcome() {
	        return "Welcome to Online Library System!";
	    }

	    
	    @GetMapping("/count")
	    public int count() {
	        return 100;
	    }


	    @GetMapping("/price")
	    public double price() {
	        return 499.99;
	    }

	    @GetMapping("/books")
	    public List<String> getBooks() {
	        return Arrays.asList("Java", "Spring Boot", "Python", "Data Structures");
	    }

	   
	    @GetMapping("/books/{id}")
	    public String getBookById(@PathVariable int id) {
	        return "Details of Book ID: " + id;
	    }

	   
	    @GetMapping("/search")
	    public String searchBook(@RequestParam String title) {
	        return "Searching for book: " + title;
	    }

	   
	    @GetMapping("/author/{name}")
	    public String getAuthor(@PathVariable String name) {
	        return "Books written by: " + name;
	    }

	 
	    
}


