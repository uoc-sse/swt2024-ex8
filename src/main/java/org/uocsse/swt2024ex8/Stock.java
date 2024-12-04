package org.uocsse.swt2024ex8;

import jakarta.persistence.*;

@Entity
public class Stock {
    // TODO add ID

    private int quantity;

    // TODO add relation
    @MapsId("productId")
    private Product product;

    // TODO add relation
    @MapsId("storeId")
    private Store store;

    // TODO ...
}
