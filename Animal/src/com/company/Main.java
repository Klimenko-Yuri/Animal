package com.company;

public class Main {

    public static void main(String[] args) {
        // write your code here

        //create new pet
        Animal pet = new Animal();

        //set pats settings
        pet.setName("Honey");
        pet.setBreed("Staff");

        //pets describe himself
        pet.sayBreed();
        pet.sayName();

        //create another pet
        Animal pet1 = new Animal();

        //set pats settings
        pet1.setName("Lucky");
        pet1.setBreed("Pit");

        //pets describe himself
        pet1.sayBreed();
        pet1.sayName();

        //create another pet
        Animal pet2 = new Animal();

        //set pats settings
        pet2.setName("Ring");
        pet2.setBreed("Pug");

        //pets describe himself
        pet2.sayBreed();
        pet2.sayName();

        //create pet without name
        Animal pet3 = new Animal();

        //pets describe himself
        pet3.sayBreed();
        pet3.sayName();

    }

}