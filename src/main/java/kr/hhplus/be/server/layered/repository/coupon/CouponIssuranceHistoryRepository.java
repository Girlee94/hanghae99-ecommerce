package kr.hhplus.be.server.layered.repository.coupon;

import kr.hhplus.be.server.layered.domain.coupon.CouponIssuranceHistory;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CouponIssuranceHistoryRepository extends JpaRepository<CouponIssuranceHistory, Long> {
}
