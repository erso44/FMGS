package server.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import server.entity.InitPageEntity;

@Repository
public interface InitRepository extends JpaRepository<InitPageEntity, String> {

}
