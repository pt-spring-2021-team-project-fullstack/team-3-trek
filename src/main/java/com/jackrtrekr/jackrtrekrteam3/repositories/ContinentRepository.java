package com.jackrtrekr.jackrtrekrteam3.repositories;

import com.jackrtrekr.jackrtrekrteam3.models.Continent;
import org.springframework.data.repository.CrudRepository;

public interface ContinentRepository extends CrudRepository<Continent, String> {
    Continent findContinentByLocation(String location);
}
