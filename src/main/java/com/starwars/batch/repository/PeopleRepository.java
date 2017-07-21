package com.starwars.batch.repository;

import com.starwars.batch.domain.People;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 * Created by jpcs1 on 21/07/17.
 */
@Repository
public interface PeopleRepository extends JpaRepository<People, String> {
}
