package com.example.demo.controller;

import com.example.demo.Enum.Category;
import com.example.demo.entity.Product;
import com.example.demo.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/product")
public class ProductController {
    @Autowired
    ProductService productService;
@PostMapping("/add")
@ResponseStatus(HttpStatus.CREATED)
    public Product createProduct(@RequestBody Product product){
    return productService.saveProduct(product);
    }

    @GetMapping("/Category/{Category}")
    public List<Product> getProduct(@PathVariable("Category") Category category){
  return productService.getProductByCategory(category);
    }
}
