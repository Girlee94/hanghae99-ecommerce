package kr.hhplus.be.server.layered.domain.order;

import jakarta.persistence.*;
import kr.hhplus.be.server.layered.domain.BaseEntity;
import kr.hhplus.be.server.layered.domain.user.User;
import kr.hhplus.be.server.layered.domain.usercoupon.UserCoupon;
import lombok.AccessLevel;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;

import java.math.BigDecimal;

@Entity
@Getter
@AllArgsConstructor
@NoArgsConstructor(access = AccessLevel.PROTECTED)
@Table(name = "ORDERS")
public class Order extends BaseEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "user_id")
    private User user;

    private BigDecimal originalPrice;

    private BigDecimal discountAmount;

    private BigDecimal totalPrice;

    @OneToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "user_coupon_id")
    private UserCoupon userCoupon;

    @Enumerated(EnumType.STRING)
    private OrderStatus status;
}