package mintic.reto1;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.stereotype.Component;

import mintic.reto1.Model.Supplements;
import mintic.reto1.Model.User;
import mintic.reto1.Repository.Crud.UserCrudRepository;
import mintic.reto1.Repository.Crud.OrderCrudRepository;
import mintic.reto1.Repository.Crud.SupplementsCrudRepository;

@Component
@SpringBootApplication
@EnableConfigurationProperties
public class Reto1Application implements CommandLineRunner {
    

	@Autowired
    private SupplementsCrudRepository FootwearsCrudRepository;
    @Autowired
    private UserCrudRepository UserCrudRepository;
    @Autowired
    private OrderCrudRepository OrderCrudRepository;

	public static void main(String[] args) {
		SpringApplication.run(Reto1Application.class, args);
	}

	@Override
    public void run(String... args) throws Exception {
       
    }

}
