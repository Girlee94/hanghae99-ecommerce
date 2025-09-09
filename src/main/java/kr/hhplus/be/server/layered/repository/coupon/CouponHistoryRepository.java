package kr.hhplus.be.server.layered.repository.coupon;

import kr.hhplus.be.server.layered.domain.coupon.CouponHistory;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CouponHistoryRepository extends JpaRepository<CouponHistory, Long> {
}
