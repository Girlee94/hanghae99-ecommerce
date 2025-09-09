package kr.hhplus.be.server.layered.repository.order;

import kr.hhplus.be.server.layered.domain.order.OrderItem;
import org.springframework.data.jpa.repository.JpaRepository;

public interface OrderItemRepository extends JpaRepository<OrderItem, Long> {
}
