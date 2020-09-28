package com.intercorp.technicalExercise.service;

import com.intercorp.technicalExercise.model.Client;
import com.intercorp.technicalExercise.dto.ClientDTO;
import com.intercorp.technicalExercise.dto.ClientsKpiDTO;

import java.util.List;
import java.util.Optional;

public interface ClientService {

    void save(Client client);

    Optional<ClientsKpiDTO> getClientsKpi();

    List<ClientDTO> getAll();


}
