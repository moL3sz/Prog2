import java.util.Scanner;

public class lab2{
    public static void main(String args[]){
        // System.out.println("Lab2 - Java");

        // Scanner scanner = new Scanner(System.in);

        // System.out.print("Enter your username: ");
        // String userName = scanner.nextLine();
        // scanner.close();

        // System.out.println("Welcome back Sir " + userName);



        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter two number");
        Integer a = scanner.nextInt(10);
        Integer b = scanner.nextInt(10);

        System.out.print("The sum: ");
        System.out.println(a+b);
    }
}