package com;

/**
 * People
 */
public class People {
    private String name;
    private int age;
    private long id;

    /**
     * Constructor 
     * @param name
     * @param age
     * @param id
     */
    public People(String name, int age, long id) {
        this.name = name;
        this.age = age;
        this.id = id;
    }

    /**
     * @return the name
     */
    public String getName() {
        return name;
    }

    /**
     * @return the id
     */
    public long getId() {
        return id;
    }

    /**
     * @return the age
     */
    public int getAge() {
        return age;
    }

    /**
     * 
     * @param newId
     */
    private void setId(long newId){
        this.id =  newId;
    }
    
    private void makesBirthday() {
        age += 1;
    }
}