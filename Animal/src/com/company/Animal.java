package com.company;


/**
This class describe general animals settings and behavior
 */
public class Animal {

     /**
        Set default settings
     */
      Animal(){

        breed = "noneme";
        name = "noname";

    }
    /**
     its animal breeg
     */

    private String breed;
    /**
      its animal name
     */
    private String name;


    public String getBreed() {
        return breed;
    }

    public void setBreed(String breed) {
        this.breed = breed;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
    /**
     This method can tell which animal breed
     */
    public void sayBreed(){

        System.out.println("Hello I am " + breed);
    }
    /**
     This method can tell name of animal
     */
    public void sayName(){

        System.out.println("Hello my name is " + name+ "\n");
    }
}
