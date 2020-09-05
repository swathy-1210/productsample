package com.example.product.exception;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

@ControllerAdvice
public class ProductExceptionController extends RuntimeException {
	
	@ExceptionHandler(value = ProductException.class)
	public ResponseEntity<Object> exception(ProductException productException) {
		 return new ResponseEntity<>("Product fetch errors", HttpStatus.EXPECTATION_FAILED);
	}
	
	@ExceptionHandler(value = ProductNotFoundException.class)
	public ResponseEntity<Object> exception(ProductNotFoundException productNotFoundException) {
		 return new ResponseEntity<>("Product Not found, document missing", HttpStatus.NOT_FOUND);
	}
}
