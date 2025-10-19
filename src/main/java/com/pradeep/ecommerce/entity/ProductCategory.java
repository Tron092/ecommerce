package com.pradeep.ecommerce.entity;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.util.Set;

@Getter
@Setter
@Entity
@Table(name = "product_category")
public class ProductCategory {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String CategoryName;
    @OneToMany(mappedBy = "category", cascade = CascadeType.ALL)
    private Set<Product> products;
}
