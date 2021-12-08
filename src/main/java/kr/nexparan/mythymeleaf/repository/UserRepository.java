package kr.nexparan.mythymeleaf.repository;

import kr.nexparan.mythymeleaf.model.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Long> {
}
