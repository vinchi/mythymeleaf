package kr.nexparan.mythymeleaf.repository;

import kr.nexparan.mythymeleaf.model.User;
import org.springframework.data.domain.Example;
import org.springframework.data.jpa.repository.EntityGraph;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface UserRepository extends JpaRepository<User, Long> {

    @EntityGraph(attributePaths = { "boards" })
    List<User> findAll();

    User findByUsername(String username);

    @Query("select u from User u where u.username like %?1%")
    List<User> findByUsernameQuery(String username);

    @Query(value = "select * from User u where u.username like %?1%", nativeQuery = true)
    List<User> findByUsernameNativeQuery(String username);
}
