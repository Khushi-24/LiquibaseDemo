package com.example.JpaBuddy.Controller;

import com.example.JpaBuddy.dto.ProductDto;
import com.example.JpaBuddy.entity.Product;
import com.example.JpaBuddy.repository.ProductRepository;
import lombok.RequiredArgsConstructor;
import org.modelmapper.ModelMapper;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor
public class ProductController {

    private final ProductRepository productRepository;
    private final ModelMapper modelMapper = new ModelMapper();

    @PostMapping("/addProduct")
    public ResponseEntity<?> addProduct(@RequestBody ProductDto productDto){
        productRepository.save(modelMapper.map(productDto, Product.class));
        return new ResponseEntity<>(productDto, HttpStatus.CREATED);
    }
}
