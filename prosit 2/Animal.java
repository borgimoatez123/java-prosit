public class Animal {
    String name;
    private int age;
    private String family;
    boolean isMammal;
public Animal(String name, int age, String family) {
    this.name = name;
    this.age = age;
    this.family = family;
    this.isMammal = false;
}
public void display() {
    System.out.println(name + " " + age + " " + family + " " + isMammal);
}
}
