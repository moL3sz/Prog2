import java.util.Scanner;

class Animal {

    Double weight;
    String name;

    public void animalSound() {
        System.out.println("The animal makes sound!");
    }

}

class Pig extends Animal {
    Integer kor;

    public void animalSound() {
        System.out.println("Ouink!");
    }
}

class Dog extends Animal {
    Integer friends;

    public void animalSound() {
        System.out.println("Vau!");
    }
}

public class Main {
    public static void main(String args[]) {
        // Animal a1 = new Animal();
        // Animal p1 = new Pig();
        // Animal d1 = new Dog();

        // a1.animalSound();
        // p1.animalSound();
        // d1.animalSound();



        /// Animal def ///

        Scanner scanner = new Scanner(System.in);
        Animal a1 = new Animal();
        System.out.println("- Animal -");
        System.out.print("Name:");
        a1.name = scanner.nextLine();
        System.out.print("Weight (double):");
        a1.weight = scanner.nextDouble();
        System.out.println();





        /// Pig def ///

        scanner = new Scanner(System.in);
        Pig p1 = new Pig();
        System.out.println("- Pig -");
        System.out.print("Name:");
        p1.name = scanner.nextLine();
        System.out.print("Weight (double):");
        p1.weight = scanner.nextDouble();
        System.out.print("Age:");
        p1.kor = scanner.nextInt();
        System.out.println();



        /// Dog def ///

        scanner = new Scanner(System.in);
        Dog d1 = new Dog();
        System.out.println("- Dog -");
        System.out.print("Name:");
        d1.name = scanner.nextLine();
        System.out.print("Weight (double):");
        d1.weight = scanner.nextDouble();
        System.out.print("Friends: ");
        d1.friends = scanner.nextInt();
    
        
        System.out.print("The bigger animal is: ");
        System.out.println(d1.weight > p1.weight ? "The dog" : d1.weight < p1.weight ?  "The pig" : "They are the same!");

    }
}
