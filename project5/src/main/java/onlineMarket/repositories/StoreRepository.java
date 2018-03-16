package onlineMarket.repositories;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import onlineMarket.entities.StoreEntity;

@Repository
public interface StoreRepository extends CrudRepository<StoreEntity,String>{

}