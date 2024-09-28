import java.util.Scanner;

public class ZooManagement {
    int nbrCages;
    String ZooName;

    public static void main(String[] args) {
        ZooManagement zooManagement = new ZooManagement();
        Scanner input = new Scanner(System.in);
        System.out.println("enter the name of zoo");
        zooManagement.ZooName = input.nextLine();
        System.out.println("enter the number of cages");
        zooManagement.nbrCages = input.nextInt();
        System.out.println(zooManagement.ZooName+" comporte "+zooManagement.nbrCages+"cages");

    }
}
