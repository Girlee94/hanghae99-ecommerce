package kr.hhplus.be.server.layered.domain.product;

import jakarta.persistence.*;
import kr.hhplus.be.server.layered.domain.product.Product;
import lombok.AccessLevel;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;

import java.math.BigDecimal;
import java.time.LocalDateTime;

@Entity
@Getter
@AllArgsConstructor
@NoArgsConstructor(access = AccessLevel.PROTECTED)
@Table(name = "PRODUCT_HISTORY")
public class ProductHistory {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "product_id")
    private Product product;

    private String name;

    private BigDecimal price;

    private String updatedBy;

    private String productType;

    private String productCategory;

    private LocalDateTime createdDate;
}