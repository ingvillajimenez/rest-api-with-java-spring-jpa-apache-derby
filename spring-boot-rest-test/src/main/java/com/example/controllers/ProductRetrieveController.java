package com.example.controllers;

import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.example.beans.Product;
import com.example.beans.ProductRepository;


@Controller
public class ProductRetrieveController {

	@RequestMapping(method = RequestMethod.GET, value="/product/allproduct")
	public @ResponseBody List<Product> getAllProducts() {
		return ProductRepository.getInstance().getProductRecords();
	}

}
