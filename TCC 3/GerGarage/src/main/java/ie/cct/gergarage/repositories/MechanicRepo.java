package ie.cct.gergarage.repositories;

import ie.cct.gergarage.domain.Mechanic;
import org.springframework.data.repository.Repository;

import java.util.ArrayList;
import java.util.Optional;

public interface MechanicRepo  extends Repository<Mechanic, Integer> {
Mechanic save(Mechanic mech);
void deleteById(Integer id);
ArrayList<Mechanic> findAll();

}
