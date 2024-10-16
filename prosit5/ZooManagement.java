

public class ZooManagement {

    public static void main(String[] args) {


        Animal lion = new Animal();

        Zoo myzoo = new Zoo();

        lion.setName("Symba");
        lion.setAge(2);
        lion.setFamily("lionFamily");
        lion.setMammal(true);


        myzoo.setName("Friguia");
        //myzoo.nbrCages=20;
        myzoo.setCity("Tunis");

        Animal chien = new Animal("DogFamily","bobi",2,true);
        Animal chat = new Animal("CatFamily","mimi",1,true);
        Animal mouse = new Animal("MouseFamily","sousou",1,true);
        Animal chien2 = new Animal("DogFamily","bobi",2,true);
        Zoo z1 = new Zoo("cityzoo","tunis");
        Zoo z2 = new Zoo("Friguia","ariana");

        z1.displayZoo();

        System.out.println("*********************");

        // System.out.println(z1);
        //System.out.println(z1.toString());

        System.out.println(chat);
        System.out.println(chien);

        System.out.println("**********-----***********");

        z1.addAnimal(chat);
        z1.addAnimal(chien);
        System.out.println(z1);

        System.out.println(z1.searchAnimal(chien2));
        System.out.println(z1.searchAnimal(mouse));
        z2.addAnimal(mouse);
        Zoo z3 = new Zoo("cityzoo","tunis");
        System.out.println("zzzzzzzzzzzzzzzzzzzzzz");
        System.out.println(Zoo.comparerZoo(z1,z2));


        Penguin p1 = new Penguin();
        Aquatic a1 = new Aquatic();
        Dolphin d1 = new Dolphin();
        p1.setAge(6);
        d1.getFamily();
        d1.setName("doudou");
        Penguin p2 = new Penguin("family","PIO",4,true,"sea",8);
        Dolphin d2 = new Dolphin("dfamily","deo",2,true,"sea",8);
        System.out.println(p2);
        System.out.println(d2);

        p2.swim();
        d2.swim();

    }
}
