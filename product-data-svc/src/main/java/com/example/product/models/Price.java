package com.example.product.models;

import java.util.List;

import lombok.Builder;
import lombok.Getter;
import lombok.Setter;

//@EqualsAndHashCode
//@AllArgsConstructor
//@NoArgsConstructor
//@Data

@Builder
@Getter
@Setter
public class Price {

	
	    private String value;
    	private  String currency_code;
    	
}
