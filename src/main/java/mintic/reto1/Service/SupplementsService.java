package mintic.reto1.Service;


import java.util.List;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import mintic.reto1.Model.Supplements;
import mintic.reto1.Repository.SupplementsRepository;


@Service
public class SupplementsService {
    @Autowired
    private SupplementsRepository supplementsRepository;

    public List<Supplements> getAll() {
        return supplementsRepository.getAll();
    }

   public Optional<Supplements> getSupplements(String reference) {
        return supplementsRepository.getSupplements(reference);
    }

    public Supplements create(Supplements Supplements) {
        if (Supplements.getReference() == null) {
            return Supplements;
        } else {
            return supplementsRepository.create(Supplements);
        }
    }

    public Supplements update(Supplements Supplements) {

        if (Supplements.getReference() != null) {
            Optional<Supplements> FootwearsDb = supplementsRepository.getSupplements(Supplements.getReference());
            if (FootwearsDb.isPresent()) {
                
                if (Supplements.getBrand()!= null) {
                    FootwearsDb.get().setBrand(Supplements.getBrand());
                }
                
                if (Supplements.getCategory() != null) {
                    FootwearsDb.get().setCategory(Supplements.getCategory());
                }
                if (Supplements.getObjetivo() != null) {
                    FootwearsDb.get().setDescription(Supplements.getObjetivo());
                }
               
                
                if (Supplements.getDescription() != null) {
                    FootwearsDb.get().setDescription(Supplements.getDescription());
                }
                if (Supplements.getPrice() != 0.0) {
                    FootwearsDb.get().setPrice(Supplements.getPrice());
                }
                if (Supplements.getQuantity() != 0) {
                    FootwearsDb.get().setQuantity(Supplements.getQuantity());
                }
                if (Supplements.getPhotography() != null) {
                    FootwearsDb.get().setPhotography(Supplements.getPhotography());
                }
                
                FootwearsDb.get().setAvailability(Supplements.isAvailability());
                supplementsRepository.update(FootwearsDb.get());
                return FootwearsDb.get();
            } else {
                return Supplements;
            }
        } else {
            return Supplements;
        }
    }

    public boolean delete(String reference) {
        Boolean aBoolean = getSupplements(reference).map(Footwears -> {
            supplementsRepository.delete(Footwears);
            return true;
        }).orElse(false);
        return aBoolean;
    }
    
}
