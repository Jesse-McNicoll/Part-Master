package com.example.partmaster.Repository;

import com.example.partmaster.Model.Part;
import org.springframework.data.repository.CrudRepository;

public interface PartRepository extends CrudRepository<Part, Integer> {
}
