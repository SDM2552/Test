//package com.izo.test.service;
//
//import com.izo.test.entity.Product;
//import com.izo.test.repository.ProductRepository;
//import jakarta.annotation.PostConstruct;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.stereotype.Service;
//
//import java.util.List;
//
//@Service
//public class ProductService {
//
//    @Autowired
//    private ProductRepository productRepository;
//
//    @PostConstruct
//    public void init() {
//        try {
//            Product product = new Product();
//            product.setName("Sample Product");
//            product.setPrice(100.0);
//            productRepository.save(product);
//        } catch (Exception e) {
//            e.printStackTrace();
//        }
//    }
//
//    public List<Product> findAll() {
//        return productRepository.findAll();
//    }
//}
