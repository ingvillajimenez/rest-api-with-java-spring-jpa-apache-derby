package com.example.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;


import com.example.beans.Product;
import com.example.beans.ProductRepository;

@Controller
public class ProductUpdateController {

	@RequestMapping(method = RequestMethod.PUT, value="/update/product")
	@ResponseBody
	public String updateProductRecord(@RequestBody Product prd) {
		
		return ProductRepository.getInstance().updateProduct(prd);
	}
}
