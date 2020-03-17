package com.swiftbeard.socialmultiplication.repository;

import com.swiftbeard.socialmultiplication.domain.Multiplication;
import org.springframework.data.repository.CrudRepository;

public interface MultiplicationRepository extends CrudRepository<Multiplication, Long> {
}
