package repository;

import model.Animal;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface AnimalRepository extends CrudRepository<Animal, Long> {
}
