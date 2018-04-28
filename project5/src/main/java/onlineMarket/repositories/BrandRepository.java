package onlineMarket.repositories;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import onlineMarket.entities.BrandEntity;
@Repository
public interface BrandRepository extends CrudRepository<BrandEntity, String> {

}
