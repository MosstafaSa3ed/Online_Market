package onlineMarket.repositories;

import org.springframework.data.repository.CrudRepository;

import onlineMarket.entities.ProductEntity;

public interface ProductRepository extends CrudRepository<ProductEntity,Integer> {

}
