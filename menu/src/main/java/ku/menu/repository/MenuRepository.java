package ku.menu.repository;

import ku.menu.entity.Menu;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.UUID;

@Repository // Auto new
public interface MenuRepository extends JpaRepository<Menu, UUID> {
}
