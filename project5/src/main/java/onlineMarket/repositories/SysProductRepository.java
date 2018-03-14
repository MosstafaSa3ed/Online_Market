package onlineMarket.repositories;

import org.springframework.data.repository.CrudRepository;

import onlineMarket.entities.ProductEntity;
import onlineMarket.entities.SysProductEntity;

public interface SysProductRepository extends CrudRepository<SysProductEntity,Integer>{

}
