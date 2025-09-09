package kr.hhplus.be.server.layered.domain.coupon;

import jakarta.persistence.*;
import kr.hhplus.be.server.layered.domain.BaseEntity;
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
@Table(name = "COUPONS")
public class Coupon extends BaseEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String name;

    private BigDecimal discountRate;

    private Long quantity;

    private Long issuedQuantity;

    private LocalDateTime expireDate;
}