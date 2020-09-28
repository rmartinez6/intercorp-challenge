package com.intercorp.technicalExercise.dao;

import com.intercorp.technicalExercise.model.Client;
import com.intercorp.technicalExercise.repository.IClientsKpi;
import java.util.List;

public interface IClientDao {

    List<Client> getAll();
    Client save(Client client);
    IClientsKpi getClientsKpi();
}
