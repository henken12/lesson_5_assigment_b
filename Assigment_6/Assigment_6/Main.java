package Assigment_6;

public class Main {
    public static void main(String[] args) {

        Computer computer1 = new Computer("Dell", "Intel Core i5", 8, 3.4);
        Computer computer2 = new Computer("HP", "AMD Ryzen 7", 16, 4.2);


        System.out.println("Computer 1:");
        System.out.println(computer1);
        System.out.println("Power of Computer 1: " + computer1.computePower());

        System.out.println("\nComputer 2:");
        System.out.println(computer2);
        System.out.println("Power of Computer 2: " + computer2.computePower());


        System.out.println("\nAre Computer 1 and Computer 2 equal? " + computer1.equals(computer2));


        System.out.println("\nHash code of Computer 1: " + computer1.hashCode());
        System.out.println("Hash code of Computer 2: " + computer2.hashCode());
        System.out.println("Are hash codes equal? " + (computer1.hashCode() == computer2.hashCode()));
    }
}

