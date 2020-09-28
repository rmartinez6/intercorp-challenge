package com.intercorp.technicalExercise.model;

import org.junit.Test;
import java.util.Date;
import static org.junit.Assert.assertEquals;

public class ClientTest {

    @Test
    public void testPersonConstructor(){
        Date birthdate = new Date();
        Client client = new Client("Rodrigo", "Martinez", 29, birthdate);
        assertEquals("Rodrigo", client.getName());
        assertEquals("Martinez", client.getSurname());
        assertEquals((Integer)29, client.getAge());
        assertEquals(birthdate, client.getBirthdate());
    }
}
