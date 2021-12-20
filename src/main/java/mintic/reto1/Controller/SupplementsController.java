package mintic.reto1.Controller;



import mintic.reto1.Model.Supplements;
import mintic.reto1.Service.SupplementsService;

import java.util.List;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/supplements")
@CrossOrigin("*")
public class SupplementsController {
    @Autowired
    private SupplementsService footwearsService;
       
     @GetMapping("/all")
    public List<Supplements> getAll() {
        return footwearsService.getAll();
    }
    
    @GetMapping("/{reference}")
    public Optional<Supplements> getSupplements(@PathVariable("reference") String reference) {
        return footwearsService.getSupplements(reference);
    }

    @PostMapping("/new")
    @ResponseStatus(HttpStatus.CREATED)
    public Supplements create(@RequestBody Supplements gadget) {
        return footwearsService.create(gadget);
    }
    
    @PutMapping("/update")
    @ResponseStatus(HttpStatus.CREATED)
    public Supplements update(@RequestBody Supplements gadget) {
        return footwearsService.update(gadget);
    }

    @DeleteMapping("/{reference}")
    @ResponseStatus(HttpStatus.NO_CONTENT)
    public boolean delete(@PathVariable("reference") String reference) {
        return footwearsService.delete(reference);
    } 
    
}

