package com.intercorp.technicalExercise.repository;

import com.intercorp.technicalExercise.model.Client;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

@Repository
public interface ClientRepository extends JpaRepository<Client,Long> {

    @Query(
            value = "SELECT AVG(c.age) as averageAge, STDDEV_POP(c.age) as standardDeviation from Client c",
            nativeQuery = true)
    IClientsKpi getClientsKpi();
}
