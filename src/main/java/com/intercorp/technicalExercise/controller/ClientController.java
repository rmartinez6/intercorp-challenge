package com.intercorp.technicalExercise.controller;

import com.intercorp.technicalExercise.model.Client;
import com.intercorp.technicalExercise.service.ClientService;
import com.intercorp.technicalExercise.dto.ClientDTO;
import com.intercorp.technicalExercise.dto.ClientsKpiDTO;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiResponse;
import io.swagger.annotations.ApiResponses;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.List;
import java.util.Optional;

@Api(tags = "Clients")
@RestController
@RequestMapping("/clients")
public class ClientController {

    @Autowired
    private ClientService clientService;


    @ApiOperation(value = "Obtiene la lista de todos los clientes",
            response = ClientDTO.class)
    @GetMapping("/listclientes")
    @ApiResponses(value = {
            @ApiResponse(code = 200, message = "Success"),
            @ApiResponse(code = 400, message = "Bad Request")
    })
    public ResponseEntity<List<ClientDTO>> getAll(){
        return ResponseEntity.ok().body(clientService.getAll());
    }


    @ApiOperation(value = "Obtiene los kpi de los clientes")
    @GetMapping("/kpideclientes")
    @ApiResponses(value = {
            @ApiResponse(code = 200, message = "Success"),
            @ApiResponse(code = 400, message = "Bad Request")
    })
    public  ResponseEntity<?> getKpiClients(){
        Optional<ClientsKpiDTO> clientsKpiDTO = this.clientService.getClientsKpi();
        return (clientsKpiDTO.isPresent())
                ? ResponseEntity.ok().body(clientsKpiDTO)
                : ResponseEntity.noContent().build();
    }


    @ApiOperation(value = "Crea un nuevo cliente")
    @PostMapping(value = "/creacliente")
    public ResponseEntity<?> create(
            @Valid @RequestBody Client client) {
        clientService.save(client);
        return ResponseEntity.status(HttpStatus.CREATED).body(client);
    }
}
