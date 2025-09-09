package kr.hhplus.be.server.layered.repository.product;

import kr.hhplus.be.server.layered.domain.product.Product;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductRepository extends JpaRepository<Product, Long> {
}
