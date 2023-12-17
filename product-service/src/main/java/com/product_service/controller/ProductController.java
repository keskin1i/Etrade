package com.product_service.controller;

import com.product_service.dto.Product;
import com.product_service.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api")
public class ProductController {

private final ProductService productService;

@Autowired
    public ProductController(ProductService productService) {
        this.productService = productService;
    }

    @GetMapping("/products")
    public  Iterable<Product> findAll() throws Exception {
        return productService.findAll();
    }

    @PostMapping("/products")
    public void save(@RequestBody Product product) throws Exception {
        productService.save(product);
    }

    @PutMapping("/products")
    public void update(@RequestBody Product product) throws Exception {
        productService.save(product);
    }

    @DeleteMapping("/products/{id}")
    public void delete(@PathVariable int id) throws Exception {
        productService.delete(id);
    }

    @GetMapping("/products/{id}")
    public Product get(@PathVariable int id) throws Exception {
        Product product = productService.findById(id);
        return product;

    }
    @GetMapping("/products/name/{name}")
    public List<Product> getByName(@PathVariable String name) throws Exception {
        List<Product> product = productService.findByName(name); //
        return product;// <1>

    }


}
