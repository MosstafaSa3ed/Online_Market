package onlineMarket.repositories;

import org.springframework.data.repository.CrudRepository;

import onlineMarket.entities.BrandEntity;
import onlineMarket.entities.UserEntity;

public interface BrandRepository extends CrudRepository<BrandEntity, Integer> {

}
