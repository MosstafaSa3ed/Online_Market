package onlineMarket.repositories;

import java.util.List;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import onlineMarket.entities.CollaboratorEntity;

@Repository
public interface CollaboratorRepository extends CrudRepository<CollaboratorEntity, Integer> {
	public List<CollaboratorEntity> findByNameIn(String Name);
}
