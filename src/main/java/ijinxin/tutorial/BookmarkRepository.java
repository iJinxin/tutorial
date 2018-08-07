package ijinxin.tutorial;

import org.springframework.data.jpa.repository.JpaRepository;
import java.util.Collection;

// SELECT b from Bookmark b where b.account.username = :username
public interface BookmarkRepository extends JpaRepository<Bookmark, Long>{
    Collection<Bookmark> findByAccountUsername(String username);
}
