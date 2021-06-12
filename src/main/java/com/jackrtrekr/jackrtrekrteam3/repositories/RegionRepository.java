package com.jackrtrekr.jackrtrekrteam3.repositories;

import com.jackrtrekr.jackrtrekrteam3.models.Region;
import org.springframework.data.repository.CrudRepository;

import java.util.Optional;

public interface RegionRepository extends CrudRepository<Region, String> {
    Optional<Region> findRegionByLocation(String location);
}
