package kr.hhplus.be.server.layered.repository.coupon;

import kr.hhplus.be.server.layered.domain.coupon.UserCoupon;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserCouponRepository extends JpaRepository<UserCoupon, Long> {
}
