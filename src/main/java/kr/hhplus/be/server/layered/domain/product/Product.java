package kr.hhplus.be.server.layered.domain.product;

import jakarta.persistence.*;
import kr.hhplus.be.server.layered.domain.BaseEntity;
import lombok.AccessLevel;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;

import java.math.BigDecimal;

@Entity
@Getter
@AllArgsConstructor
@NoArgsConstructor(access = AccessLevel.PROTECTED)
@Table(name = "PRODUCTS")
public class Product extends BaseEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String name;

    private BigDecimal price;

    private Long quantity;

    @Column(name = "product_type")
    private String productType;

    @Column(name = "product_category")
    private String productCategory;
}