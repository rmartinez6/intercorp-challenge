package com.intercorp.technicalExercise.service.impl;

import com.intercorp.technicalExercise.dao.IClientDao;
import com.intercorp.technicalExercise.model.Client;
import com.intercorp.technicalExercise.repository.IClientsKpi;
import com.intercorp.technicalExercise.service.ClientService;
import com.intercorp.technicalExercise.dto.ClientDTO;
import com.intercorp.technicalExercise.dto.ClientsKpiDTO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.*;

@Service
public class ClientServiceImpl implements ClientService {

    @Autowired
    private IClientDao clientDao;

    @Override
    public void save(Client client) {
        clientDao.save(client);
    }

    @Override
    public List<ClientDTO> getAll(){
        List<ClientDTO> clientDTOList = new ArrayList<>();
        clientDao.getAll().forEach(client -> clientDTOList.add(new ClientDTO(client, calculateClientDeathDate(client))));
        return clientDTOList;
    }

    @Override
    public Optional<ClientsKpiDTO> getClientsKpi(){
        IClientsKpi iClientsKpi =  clientDao.getClientsKpi();
        Double averageAge = iClientsKpi.getAverageAge();
        Double standardDeviation = iClientsKpi.getStandardDeviation();
        return (averageAge!=null && standardDeviation!=null)?
                Optional.of(new ClientsKpiDTO(averageAge, standardDeviation)):
                Optional.empty();
    }


    private Date calculateClientDeathDate(Client client){
        Calendar calendar = Calendar.getInstance();
        calendar.setTime(client.getBirthdate());
        calendar.add(Calendar.DAY_OF_YEAR, 76*365);
        return calendar.getTime();
    }


}
