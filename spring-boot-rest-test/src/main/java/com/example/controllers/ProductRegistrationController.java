package com.example.controllers;

import java.util.List;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.example.beans.*;

@Controller
public class ProductRegistrationController {

	@RequestMapping(method = RequestMethod.POST, value="/add/product")
	@ResponseBody
	public ProductRepositoryRelay registerProduct(@RequestBody Product product) {
		
		ProductRepositoryRelay productrelay = new ProductRepositoryRelay();
		ProductRepository.getInstance().add(product);
		//Set and relay back to caller
		productrelay.setName(product.getName());
		productrelay.setSku(product.getSku());
		
		return productrelay;
	}
}
