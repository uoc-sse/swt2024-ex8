package org.uocsse.swt2024ex8;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
public class ProductController {
    private ProductRepository productRepository;

    @Autowired
    public ProductController(ProductRepository productRepository) {
        this.productRepository = productRepository;
    }

    @GetMapping("/product")
    public Product getProduct(@RequestParam long id) {
        return productRepository.findById(id).get();
    }

    @PostMapping("/product")
    public Product addProduct(@RequestBody Product product) {
        return productRepository.save(product);
    }

    @DeleteMapping("/product")
    public void deleteProduct(@RequestParam long id) {
        productRepository.deleteById(id);
    }
}
