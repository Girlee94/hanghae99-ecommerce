package kr.hhplus.be.server.layered.domain.usercoupon;

import jakarta.persistence.*;
import kr.hhplus.be.server.layered.domain.coupon.Coupon;
import kr.hhplus.be.server.layered.domain.user.User;
import lombok.AccessLevel;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;

@Entity
@Getter
@AllArgsConstructor
@NoArgsConstructor(access = AccessLevel.PROTECTED)
@Table(name = "USER_COUPONS")
public class UserCoupon {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "user_id")
    private User user;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "coupon_id")
    private Coupon coupon;

    private String usedAt;

    private LocalDateTime usedDate;

    private LocalDateTime issueDate;
}