package community.Jojal_Jojal.repository;
import community.Jojal_Jojal.entity.Post;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PostRepository extends JpaRepository<Post, Long> {
}