import java.util.Scanner;
public class Scan {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("What is your Name?");
        String name = scanner.nextLine();
        System.out.println("Hello "+ name + " welcome");

        System.out.println("What is your age?");
        int age = scanner.nextInt();
        scanner.nextLine();
        System.out.println("You are " +age + " years old");

        System.out.println("What is your favorite food?");
        String food = scanner.nextLine();
        System.out.println("Your favorite food is "+ food);

        System.out.println("What's the name of your mothr?");
        String nam = scanner.nextLine();
        System.out.println("wow you mom is called "+ nam +"." + " It's a nice name say hi ukifika home");

        System.out.println("How old is your mum?");
        int age1 = scanner.nextInt();
        System.out.println("wow!! you mum is "+ age1 +" years old? She is soo young ama ni mimi zang zimeshuka kiazi?");
        



    }
}