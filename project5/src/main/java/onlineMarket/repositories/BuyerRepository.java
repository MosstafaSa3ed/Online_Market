package onlineMarket.repositories;

import org.springframework.data.repository.CrudRepository;

import onlineMarket.entities.BuyerEntity;
import onlineMarket.entities.UserEntity;

public interface  BuyerRepository extends CrudRepository<UserEntity, Integer>{

}
