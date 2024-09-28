public class Zoo {
private String name;
private  String city;
private    int nbrCages;
    Animal[] animals;
private int numberNow=0;

public Zoo(String name, String city, int nbrCages) {
    this.name = name;
    this.city = city;
    this.nbrCages = nbrCages;
    animals = new Animal[2];
    ;
}
public void addAnimal(Animal animal) {
if (numberNow<animals.length) {

    animals[numberNow++] = animal;
    System.out.println("is ok ");
}
else {
    System.out.println("sorry is plein ");
}
}
public void displayzoo() {
    System.out.println("Nom du zoo: " + name);
    System.out.println("Ville: " + city);
    System.out.println("Nombre de cages: " + nbrCages);
    System.out.println("Animaux dans le zoo:");
    for (int i = 0; i < numberNow; i++) {
        System.out.println("Animal " + (i + 1) + ":" + animals[i].name);

        System.out.println();
    }
}
}
