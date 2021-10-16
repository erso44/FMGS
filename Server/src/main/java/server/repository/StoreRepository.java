package server.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import server.entity.StoreEntity;

@Repository
public interface StoreRepository extends JpaRepository<StoreEntity, String> {

}
