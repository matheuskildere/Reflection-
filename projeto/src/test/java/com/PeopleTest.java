package com;

import static org.junit.Assert.assertEquals;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

import org.junit.Before;
import org.junit.Test;

/**
 * PeopleTest
 */
public class PeopleTest {
    static People person;

    @Before
    public void setUp() {
        person = new People("matheus", 17, 987021);
    }

    @Test
    public void getNameTest() {

        String namePerson = person.getName();

        assertEquals("kildere", namePerson);
    }

    @Test
    public void setIdTest() throws NoSuchMethodException, SecurityException, IllegalAccessException,
            IllegalArgumentException, InvocationTargetException {
        Class<?> peopleClass = People.class;
        Method setId = peopleClass.getDeclaredMethod("setId", long.class);
        setId.setAccessible(true);

        setId.invoke(person, 789);

        assertEquals(789, person.getId());
        
    }

    @Test
    public void makesBirthdayTest() throws NoSuchMethodException, SecurityException, IllegalAccessException,
            IllegalArgumentException, InvocationTargetException {
        Method makesBirthday = People.class.getDeclaredMethod("makesBirthday");
        makesBirthday.setAccessible(true);

        makesBirthday.invoke(person);

        assertEquals(18, person.getAge());
    }
    
}