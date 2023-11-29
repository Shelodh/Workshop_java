import java.util.Scanner;
// Ex0 build the program and display "Hello World!" in the terminal
// Ex0.5 create a .jar

class Main
{
    public static void main(String[] args)
    {
        // System.out.println("Hello World !");
        // age(args);
        loop(args);
    }

    // EX01 displays an age given in args[1] if the program has no argument asking the user to enter one
    public static void age(String[] args)
    {
        Scanner scan = new Scanner(System.in);
        String str;

        if (args.length != 1) {
            System.out.println("give an age : ");
            str = scan.next();
        } else {
            str = args[0];
        }
        System.out.println("you have " + str + " years old"); 
    }

    // EX02 Display the elements of an array with the for-each loop
    public static void loop(String[] args)
    {
        int[] tableau = {1, 2, 3, 4, 5};

        for (int element : tableau) {
            System.out.print(element + " ");
        }
        System.out.println("\n");

        // Ex02.5: Using the do-while loop to ask the user for a positive number if the number is negative you need to ask again.
        Scanner scanner = new Scanner(System.in);
        int nombre;

        do {
            nombre = scanner.nextInt();
            if (nombre <= 0) {
                System.out.println("The number must be a positive one, Try again.");
            }
        } while (nombre <= 0);

        System.out.println("The number is positive : " + nombre);
    }

    // Ex3: creates a class and modified its values, use the class Peasant in Peopole.java;
    public static void myclass(String[] args) {
        // EX4: call the Soldier class here:
        Soldier soldier = new Soldier("john", 20);
        soldier.add_Age(30);
        soldier.close();
    }
}
