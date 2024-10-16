package tn.esprit.gestionzoo.main;

import tn.esprit.gestionzoo.entities.*;

public class ZooManagement {
    public static void main(String[] args) {


        Zoo z2 = new Zoo();
        Animal lion = new Animal();
Zoo z3 = new Zoo();
        z2.setCity("tunis");
        z2.setName("friguia");
        lion.setFamily("lionFamily");
        lion.setAge(-2);
        lion.setName("symba");
        lion.setMammal(true);

        Zoo z1 = new Zoo("myzoo","tunis",21);
        Animal chien = new Animal("DogFamily","bobi",3,true);
        Animal chat = new Animal("CatFamily","mimi",2,true);
        Animal mouse = new Animal("MouseFamily","sousou",1,true);
        Animal singe = new Animal("SFamily","Miko",1,true);
        Animal chien2 = new Animal("DogFamily","bobi",3,true);
z1.displayZoo();
        System.out.println("*********************");
        System.out.println(z1);

        System.out.println(chien);
        System.out.println(chat);

        System.out.println("*********************");
         z1.addAnimal(chien);
         z1.addAnimal(chat);
         z1.addAnimal(mouse);

        System.out.println(z1);
        System.out.println(z1.searchAnimal(mouse));
        System.out.println(z1.searchAnimal(chien2));

        System.out.println(Zoo.comparerZoo(z1,z2));
    }
}
