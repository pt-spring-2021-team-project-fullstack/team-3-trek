package com.jackrtrekr.jackrtrekrteam3.repositories;

import com.jackrtrekr.jackrtrekrteam3.models.Trek;
import org.springframework.data.repository.CrudRepository;

import java.util.Optional;

public interface TrekRepository extends CrudRepository<Trek, String> {
    Optional<Trek> findByName(String name);
}
