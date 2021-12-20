package mintic.reto1.Repository;

import java.util.List;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import mintic.reto1.Model.Supplements;
import mintic.reto1.Repository.Crud.SupplementsCrudRepository;

@Repository
public class SupplementsRepository {
    @Autowired
    private SupplementsCrudRepository repository;

    public List<Supplements> getAll() {
        return repository.findAll();
    }

    public Optional<Supplements> getSupplements(String reference) {
        return repository.findById(reference);
    }
    public Supplements create(Supplements Footwears) {
        return repository.save(Footwears);
    }

    public void update(Supplements Footwears) {
        repository.save(Footwears);
    }
    
    public void delete(Supplements Footwears) {
        repository.delete(Footwears);
    }
}
