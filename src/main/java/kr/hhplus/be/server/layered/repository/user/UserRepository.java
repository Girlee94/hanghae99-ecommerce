package kr.hhplus.be.server.layered.repository.user;

import kr.hhplus.be.server.layered.domain.user.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Long> {
}
