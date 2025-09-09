package kr.hhplus.be.server.layered.repository.user;

import kr.hhplus.be.server.layered.domain.user.BalanceHistory;
import org.springframework.data.jpa.repository.JpaRepository;

public interface BalanceHistoryRepository extends JpaRepository<BalanceHistory, Long> {
}
