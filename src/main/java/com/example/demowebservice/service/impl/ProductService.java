package com.example.demowebservice.service.impl;

import com.example.demowebservice.model.Product;
import com.example.demowebservice.model.Product;
import com.example.demowebservice.repository.IProductRepository;
import com.example.demowebservice.service.IProductService;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;
import java.util.Optional;


public class ProductService implements IProductService {
    @Autowired
    public IProductRepository iProductRepository;

    @Override
    public Product save(Product product) {
        return iProductRepository.save(product);
    }

    @Override
    public void delete(Long id) {
        iProductRepository.deleteById(id);
    }

    @Override
    public Optional<Product> findById(Long id) {
        return iProductRepository.findById(id);
    }

    @Override
    public List<Product> findAll() {
        return iProductRepository.findAll();
    }
}
