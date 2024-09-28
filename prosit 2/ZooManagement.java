import java.util.Scanner;

public class ZooManagement {


    public static void main(String[] args) {
     Zoo myzoo=new Zoo("Belvedere Park","tunis",10);
     Animal lion=new Animal("lion",11,"Felidae");
        Animal tiger=new Animal("tiger",11,"Felidae");
        Animal geraf=new Animal("geraf",11,"Felidae");
        Animal duphin=new Animal("duphin",11,"Felidae");
        myzoo.addAnimal(lion);
        myzoo.addAnimal(tiger);        myzoo.addAnimal(geraf);        myzoo.addAnimal(duphin);


        myzoo.displayzoo();

    }
}
