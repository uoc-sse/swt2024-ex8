package org.uocsse.swt2024ex8;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class StockController {
    private StockRepository stockRepository;
    private ProductRepository productRepository;

    @Autowired
    public StockController(StockRepository stockRepository, ProductRepository productRepository) {
        this.stockRepository = stockRepository;
        this.productRepository = productRepository;
    }
}
