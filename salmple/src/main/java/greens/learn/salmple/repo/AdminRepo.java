package greens.learn.salmple.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import greens.learn.salmple.entity.AdminTable;

public interface AdminRepo extends JpaRepository<AdminTable, Integer> {

}
