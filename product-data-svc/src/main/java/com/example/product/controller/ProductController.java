package com.example.product.controller;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.example.product.exception.ProductNotFoundException;
import com.example.product.models.Product;
import com.example.product.repository.MyDomainReactiveRepository;
import com.example.product.repository.MydomainRespository;

import reactor.core.publisher.Mono;

@RestController
@RequestMapping("/product")
@ComponentScan

public class ProductController {
	
	@Autowired
    MydomainRespository mydomainRepository;
	@Autowired
    MyDomainReactiveRepository mydomainReactiveRepository;
	
	private static final Logger LOGGER = LoggerFactory.getLogger(ProductController.class);

	@RequestMapping("/index")
	public String index() {
		return "Greetings from Spring Boot!";
	}
   @GetMapping("/{id}")
    public Optional<Object> getBlog(@PathVariable String id) {
	   System.out.println("Inside get");
        if (mydomainRepository.existsById(id)) {
        	System.out.println("JSON :::"+mydomainRepository.findById(id));
			return mydomainRepository.findById(id).map(jsonArray -> jsonArray.toString());
        } else 
        	System.out.println("JSON ::: is empty");
            return null;
	    }	
  
	
	@PostMapping("/")
    public Product addBlogPost(@RequestBody Product myDomainDocument) {
		
        return mydomainRepository.save(myDomainDocument);
    }
	
 @GetMapping("/reactive/{id}")
	public Mono<Product> reactiveGet(@PathVariable String id) {
	 	 System.out.println("inside reactiveGet");
	 	 LOGGER.debug("This is a info log message");
	     return mydomainReactiveRepository.findById(id);
	}
 
 @RequestMapping(value = "/exception/{id}", method = RequestMethod.GET)
 public ResponseEntity<Object> getProduct(@PathVariable("id") String id) { 
	 LOGGER.info("response:::::"+mydomainRepository.findById(id));
    if((mydomainRepository.findById(id).isEmpty()))throw new ProductNotFoundException();
    return new ResponseEntity<>(mydomainRepository.findById(id), HttpStatus.OK);
 }
	
 @RequestMapping(value = "/exception/{id}", method = RequestMethod.PUT)
 public ResponseEntity<Object> updateProduct(@PathVariable("id") String id, @RequestBody Product product) { 
	 LOGGER.info("response:::::"+mydomainRepository.findById(id)+"request::::::"+product);
	 
	 List<String> prices = Arrays.asList("Al", "Ankit", "Brent", "Sarika", "amanda", "Hans", "Shivika", "Sarah");
	 product.builder()
	 .prices(prices);
	 .id(product.getId())
	 .name(product.getName()
			 .
			 )
	 mydomainRepository.save(product);
    if((mydomainRepository.findById(id).isEmpty()))throw new ProductNotFoundException();
    return new ResponseEntity<>(mydomainRepository.findById(id), HttpStatus.OK);
 }

 }
