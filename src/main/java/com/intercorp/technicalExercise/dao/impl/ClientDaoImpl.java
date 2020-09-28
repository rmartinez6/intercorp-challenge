package com.intercorp.technicalExercise.dao.impl;

import com.intercorp.technicalExercise.dao.IClientDao;
import com.intercorp.technicalExercise.model.Client;
import com.intercorp.technicalExercise.repository.ClientRepository;
import com.intercorp.technicalExercise.repository.IClientsKpi;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;

@Service
public class ClientDaoImpl implements IClientDao {

    @Autowired
    private ClientRepository clientRepository;

    @Override
    public List<Client> getAll(){
        return clientRepository.findAll();
    }

    @Override
    public Client save(Client client){
        return this.clientRepository.save(client);
    }

    @Override
    public IClientsKpi getClientsKpi(){
        return clientRepository.getClientsKpi();
    }

}