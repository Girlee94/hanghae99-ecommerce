package kr.hhplus.be.server.layered.repository.product;

import kr.hhplus.be.server.layered.domain.product.ProductInventoryHistory;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductInventoryHistoryRepository extends JpaRepository<ProductInventoryHistory, Long> {
}
