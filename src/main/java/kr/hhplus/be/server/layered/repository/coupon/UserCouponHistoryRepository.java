package kr.hhplus.be.server.layered.repository.coupon;

import kr.hhplus.be.server.layered.domain.coupon.UserCouponHistory;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserCouponHistoryRepository extends JpaRepository<UserCouponHistory, Long> {
}
