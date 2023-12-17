package com.product_service.service;

import com.product_service.dto.Product;
import com.product_service.repository.ProductRepository;
import com.product_service.service.ımpl.ProductServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;
import java.util.Optional;

public class ProductService implements ProductServiceImpl {

    private final ProductRepository productRepository;

    @Autowired
    public ProductService(ProductRepository productRepository) {
        this.productRepository = productRepository;
    }

    @Override
    public void save(Product product) throws Exception {
        try {
            productRepository.save(product);
        } catch (Exception e) {
            throw new Exception(e.getMessage());
        }
    }

    @Override
    public List<Product> findAll() throws Exception {
        try {
            return productRepository.findAll();
        } catch (Exception e) {
            throw new Exception(e.getMessage());
        }
    }

    @Override
    public Product findById(int id) throws Exception {
        Product response;
        try {
            Optional<Product> product = productRepository.findById(id);
           if (product.isPresent()){
               response = product.get();
               return response;
           }else {
               throw new Exception("Product not found");
           }
        } catch (Exception e) {
            throw new Exception(e.getMessage());
        }

    }

    @Override
    public void delete(int id) throws Exception {
    try{
        Product product = findById(id);
        if (product != null) {
            productRepository.delete(product);
        } else {
            throw new Exception("Product not found");
        }
    }catch (Exception e){
        throw new Exception(e.getMessage());
    }
    }
    @Override
    public List<Product> findByName(String name) throws Exception {
        try {
            List<Product> products = productRepository.findByName(name);
            if (products != null) {
                return products;
            } else {
                throw new Exception("Product not found");
            }

        } catch (Exception e) {
            throw new Exception("Exception message: "+e.getMessage());
        }
    }







}
