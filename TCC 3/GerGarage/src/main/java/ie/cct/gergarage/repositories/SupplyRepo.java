package ie.cct.gergarage.repositories;

import org.springframework.data.repository.Repository;

import ie.cct.gergarage.domain.Supply;

import java.util.ArrayList;

public interface SupplyRepo extends Repository<Supply, Integer> {
Supply save(Supply s);
ArrayList<Supply> findAll();
void deleteByPartid(Integer id);


}
