package greens.learn.salmple.repo;

import java.util.List;
import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import greens.learn.salmple.entity.AdminTable;

public interface AdminRepo extends JpaRepository<AdminTable, Integer> {

	List<AdminTable> findByAdminFlag(Character adminFlag);

}
