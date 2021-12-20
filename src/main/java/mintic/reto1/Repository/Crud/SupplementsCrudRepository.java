package mintic.reto1.Repository.Crud;

import org.springframework.data.mongodb.repository.MongoRepository;

import mintic.reto1.Model.Supplements;

public interface SupplementsCrudRepository extends MongoRepository<Supplements, String> {

}
