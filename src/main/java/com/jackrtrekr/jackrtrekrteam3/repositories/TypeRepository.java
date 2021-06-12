package com.jackrtrekr.jackrtrekrteam3.repositories;

import com.jackrtrekr.jackrtrekrteam3.models.Type;
import org.springframework.data.repository.CrudRepository;

public interface TypeRepository extends CrudRepository<Type, String> {
    Type findTypeByDifficulty(String difficulty);
}
