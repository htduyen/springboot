package springboot.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import springboot.entity.NewEntity;

@Repository
public interface NewRepository extends JpaRepository<NewEntity, Long>{
	
}
