package soa.location.repository;

import org.springframework.data.repository.CrudRepository;

import org.springframework.stereotype.Repository;
import soa.location.model.Location;

import java.util.List;

@Repository
public interface LocationRepository extends CrudRepository<Location, Integer> {
    List<Location> findAll();

    Location save(Location location);
}
