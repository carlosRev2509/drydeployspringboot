package com.dry.backend.domain.products;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;

/**
 * @author Bruno Ramirez
 **/
@Getter
@Setter
@Entity
@Table(name = "product")
public class Product {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "product_id")
    private Long id;

    @Column(name = "name", nullable = false)
    private String name;

    @Lob
    @Column(name = "description", length = 10000000)
    private String description;

    @Lob
    @Column(name = "image", length = 10000000)
    private String image;

    @Column(name = "purchase_price", nullable = false)
    private Double purchasePrice;

    @Column(name = "sale_price", nullable = false)
    private Double salePrice;

    @Column(name = "stock")
    private Double stock;

//    @Temporal(TemporalType.DATE)
//    @Column(name = "date", nullable = false)
//    private Date dateCreated;
}
