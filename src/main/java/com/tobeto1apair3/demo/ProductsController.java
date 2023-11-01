package com.tobeto1apair3.demo;

import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("api/products")
public class ProductsController {

    List<Product> productList = new ArrayList<>();

    @GetMapping()
    public List<Product> getAll() {
        return productList;
    }

    @PostMapping("add")
    public String add(@RequestBody Product product) {
        productList.add(product);
        return "Ürün Eklendi.";
    }
}
