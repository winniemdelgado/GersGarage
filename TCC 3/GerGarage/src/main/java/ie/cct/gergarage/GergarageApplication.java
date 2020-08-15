package ie.cct.gergarage;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication
@EntityScan(basePackages = {"ie.cct.gergarage.domain"} )
@EnableJpaRepositories(basePackages = "ie.cct.gergarage.repositories")
@ComponentScan("ie.cct.gergarage.*")
public class GergarageApplication {

	public static void main(String[] args) {
		SpringApplication.run(GergarageApplication.class, args);
	}

}
