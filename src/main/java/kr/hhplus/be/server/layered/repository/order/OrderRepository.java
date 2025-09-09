package kr.hhplus.be.server.layered.repository.order;

import kr.hhplus.be.server.layered.domain.order.Order;
import org.springframework.data.jpa.repository.JpaRepository;

public interface OrderRepository extends JpaRepository<Order, Long> {
}
