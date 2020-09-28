package com.intercorp.technicalExercise.service.impl;

import com.intercorp.technicalExercise.dao.impl.ClientDaoImpl;
import com.intercorp.technicalExercise.model.Client;
import com.intercorp.technicalExercise.dto.ClientDTO;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.MockitoJUnitRunner;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import static junit.framework.TestCase.assertEquals;

@RunWith(MockitoJUnitRunner.class)
public class ClientServiceImplTest {

    @InjectMocks
    private ClientServiceImpl clientService;

    @Mock
    private ClientDaoImpl clientDao;


    @Test
    public void whenGetClient_thenReturnAllClients() {
        List<Client> clientList =new ArrayList<>();
        clientList.add(new Client("Rodrigo","Martinez",30, new Date()));
        clientList.add(new Client("Damian","Cordoba",34, new Date()));

        Mockito.when(clientDao.getAll()).thenReturn(clientList);

        List<ClientDTO> listClientResult = clientService.getAll();
        assertEquals(2, listClientResult.size());
        assertEquals("Rodrigo", listClientResult.get(0).getName());
        assertEquals("Damian", listClientResult.get(1).getName());
    }

}
