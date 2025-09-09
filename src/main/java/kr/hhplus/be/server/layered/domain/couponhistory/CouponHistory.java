package kr.hhplus.be.server.layered.domain.couponhistory;

import jakarta.persistence.*;
import kr.hhplus.be.server.layered.domain.coupon.Coupon;
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
@Table(name = "COUPON_HISTORY")
public class CouponHistory {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "coupon_id")
    private Coupon coupon;

    private String name;

    private BigDecimal discountRate;

    private Long quantity;

    private LocalDateTime expireDate;

    private String updatedBy;

    private LocalDateTime createdDate;
}