package kr.hhplus.be.server.layered.repository.coupon;

import kr.hhplus.be.server.layered.domain.coupon.Coupon;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CouponRepository extends JpaRepository<Coupon, Long> {
}
