package com.intercorp.technicalExercise.model;

import javax.persistence.*;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;
import java.util.Date;

@Entity
@Table(name="CLIENT")
public class Client {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    @Column(name="ID")
    private Long id;
    @Column(name="NAME")
    @NotEmpty(message = "Please provide a name")
    private String name;
    @Column(name="SURNAME")
    @NotEmpty(message = "Please provide a surname")
    private String surname;
    @Column(name="AGE")
    @NotNull(message = "Please provide an age")
    private Integer age;
    @Column(name="BIRTHDATE")
    @NotNull(message = "Please provide a birthdate")
    private Date birthdate;

    public Client(){

    }

    public Client(String name, String surname, Integer age, Date birthdate){
        this.name = name;
        this.surname = surname;
        this.age = age;
        this.birthdate = birthdate;
    }


    public Long getId(){ return id;}

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

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public Date getBirthdate() {
        return birthdate;
    }

    public void setBirthdate(Date birthdate) {
        this.birthdate = birthdate;
    }
}
