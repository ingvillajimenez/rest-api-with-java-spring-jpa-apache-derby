package com.example.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;


import com.example.beans.ProductRepository;

@Controller
public class ProductDeleteController {
	@RequestMapping(method = RequestMethod.DELETE, value="/delete/product/{sku}")
	@ResponseBody
	public String deleteProductRecord(@PathVariable("sku") String sku) {
		
		return ProductRepository.getInstance().deleteProduct(sku);
	}
}
