package com.intercorp.technicalExercise.dto;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.intercorp.technicalExercise.model.Client;

import java.util.Date;

public class ClientDTO {

    private Long id;
    private String name;
    private String surname;
    private int age;
    @JsonFormat(pattern="dd-MM-yyyy")
    private Date birthdate;
    @JsonFormat(pattern="dd-MM-yyyy")
    private Date deathDate;

    public ClientDTO(Client client, Date deathDate){
        this.id = client.getId();
        this.name = client.getName();
        this.surname = client.getSurname();
        this.age = client.getAge();
        this.birthdate = client.getBirthdate();
        this.deathDate = deathDate;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public Date getBirthdate() {
        return birthdate;
    }

    public void setBirthdate(Date birthdate) {
        this.birthdate = birthdate;
    }

    public Date getDeathDate() {
        return deathDate;
    }

    public void setDeathDate(Date deathDate) {
        this.deathDate = deathDate;
    }

}
