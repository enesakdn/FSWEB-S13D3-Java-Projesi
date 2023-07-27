public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");
        Person person = new Person("John", "Doe", 20);
        Person person1 = new Person("Developer",188,"Boğa","Enes","Akdoğan",24);
        System.out.println(person.getFirstname());

        System.out.println( person.getLastName());

        System.out.println( person.getAge());

        Wall wall = new Wall(5.0,4.0);

        System.out.println("area= " + wall.getArea());

        wall.setHeight(-1.5);

        System.out.println("width= " + wall.getWidth());

        System.out.println("height= " + wall.getHeight());

        System.out.println("area= " + wall.getArea());
    }


}