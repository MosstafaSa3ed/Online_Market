package onlineMarket.repositories;

import javax.transaction.Transactional;

import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import onlineMarket.entities.ProductEntity;
@Repository
public interface ProductRepository extends CrudRepository<ProductEntity,Integer> {

	/*@Transactional 
	@Modifying(clearAutomatically = true)
	@Query("UPDATE product_entity p SET p.counter = p.counter+1 WHERE p.store_name = :sname and name= :name")
	public void UpdateCounter(@Param("sname") String sname, @Param("name") String name);
		*/
}
