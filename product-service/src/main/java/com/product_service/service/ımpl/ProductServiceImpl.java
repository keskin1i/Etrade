package com.product_service.service.ımpl;


import com.product_service.dto.Product;

import java.util.List;

public interface ProductServiceImpl {

    void save(Product product) throws Exception;

    public List<Product> findAll() throws Exception;

    public Product findById(int id) throws Exception;

    public void delete(int id) throws Exception;

    public List<Product> findByName(String name) throws Exception;




}
