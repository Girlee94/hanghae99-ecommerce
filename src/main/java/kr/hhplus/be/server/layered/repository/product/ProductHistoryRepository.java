package kr.hhplus.be.server.layered.repository.product;

import kr.hhplus.be.server.layered.domain.product.ProductHistory;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductHistoryRepository extends JpaRepository<ProductHistory, Long> {
}
