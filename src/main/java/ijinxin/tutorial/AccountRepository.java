package ijinxin.tutorial;

import java.util.Optional;
import org.springframework.data.jpa.repository.JpaRepository;

/*
* a jpa query finder method
* select a from Account a where a.username = :username
* */
public interface AccountRepository extends JpaRepository<Account, Long>{
    Optional<Account> findByUsername(String username);
}
