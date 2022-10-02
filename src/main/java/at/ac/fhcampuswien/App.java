package at.ac.fhcampuswien;

import java.sql.SQLOutput;
import java.util.Scanner;

public class App {

    //todo Task 1
    public void sayHelloWorld() {
        System.out.println("Hello World!");
        // input your solution here
    }

    //todo Task 2
    public void helloRobot() {
        System.out.println("0123456789012345678901");
        System.out.println("         __");
        System.out.println(" _(\\    |@@|");
        System.out.println("(__/\\__ \\--/ __");
        System.out.println("   \\___|----|  |   __");
        System.out.println("       \\ }{ /\\ )_ / _\\");
        System.out.println("       /\\__/\\ \\__O (__");
        System.out.println("      (--/\\--)    \\__/");
        System.out.println("      _)(  )(_");
        System.out.println("     `---''---`");
        // input your solution here
    }

    //todo Task 3
    public void sumOfLiterals() {
        char a = 'Z';
        int b = 0xface;
        int c = 012;
        long d = 80L;
        float e = 44e-1f;
        float f = 5.5f;
        double g = 8.88e1;
        double h = 99.9;
        int htoint = (int)h;
        int gtoint = (int)g;
        int ftoint = (int)f;
        int etoint = (int)e;
        int dtoint = (int)d;
        int atoint = (int)a;
        int x;
        x = (int) (atoint+b+c+dtoint+etoint+ftoint+gtoint+htoint);
        System.out.println(x);
        // input your solution here
    }

    //todo Task 4
    public void addTwoNumbers() {
        Scanner s = new Scanner(System.in);
        int zahl1 = s.nextInt();
        int zahl2 = s.nextInt();
        int sum = zahl1 + zahl2;
        System.out.println(sum);
        // input your solution here
    }

    //todo Task 5
    public void swapTwoNumbers() {
        Scanner s = new Scanner(System.in);
        System.out.println("Before Swap:");
        System.out.print("x: ");
        int x = s.nextInt();
        System.out.print("y: ");
        int y = s.nextInt();
        x = x + y;
        y = x - y;
        x = x - y;
        System.out.println("After Swap:");
        System.out.println("x: " + x);
        System.out.println("y: " + y);
        // input your solution here
    }

    //todo Task 6
    public void compareTwoNumbers() {
        Scanner s = new Scanner(System.in);
        System.out.print("n1: ");
        int n1 = s.nextInt();
        System.out.print("n2: ");
        int n2 = s.nextInt();
        if (n1-n2 <0){
            System.out.println("n2 > n1");
        }
        else if (n1-n2 > 0) {
            System.out.println("n1 > n2");

        }
        else {
            System.out.println("n1 == n2");
        }
        // input your solution here
    }

    //todo Task 7
    public void ratingSalesPerson() {
        Scanner s = new Scanner(System.in);
        System.out.print("Enter annual Revenue: ");
        int x = s.nextInt();
        if (0 > x && x >= 100000) {
            System.out.println("Invalid Revenue");
        }
        else if (0 <= x && x < 20000) {
        System.out.println("Poor Sales Revenue");
        }
        else if (20000 <= x && x < 50000) {
        System.out.println("Average Sales Revenue");
        }
        else if (50000 <= x && x < 80000) {
        System.out.println("Good Sales Revenue");
        }
        else if (80000 <= x && x < 100000) {
        System.out.println("Excellent Sales Revenue");
        }
        else {
            System.out.println("Invalid Revenue");
        }
        // input your solution here
    }

    //todo Task 8
    public void getCommissionRate() {
        Scanner s = new Scanner(System.in);
        System.out.print("Enter CommissionClass: ");
        int n = s.nextInt();
        switch(n) {
            case 1: System.out.println("Your Commission Rate was set to 0.01"); break;
            case 2: System.out.println("Your Commission Rate was set to 0.02"); break;
            case 3: System.out.println("Your Commission Rate was set to 0.03"); break;
            case 4: System.out.println("Your Commission Rate was set to 0.04"); break;
            default: System.out.println("Your Commission Rate was set to 0.0"); break;
        }
        // input your solution here
    }

    //todo Task 9
    public void leapyear() {
        Scanner s = new Scanner(System.in);
        System.out.print("Year: ");
        int x = s.nextInt();
        if (x % 4 == 0 && x % 400 == 0) {
            System.out.println("Leapyear");
        }
        else if (x % 100 == 0 && x % 400 != 0) {
            System.out.println("Not a Leapyear");
        }
        else {
            System.out.println("Not a Leapyear");
        }
        // input your solution here
    }

    //todo Task 10
    public void transposedNumbers() {
        Scanner s = new Scanner(System.in);
        System.out.print("Number: ");
        int x = s.nextInt();
        int n1 = x % 10;
        int n2 = (x % 100)/10;
        int n3 = x / 100;
        System.out.print(n1);
        System.out.print(n2);
        System.out.println(n3);
        // input your solution here
    }


    public static void main(String[] args) {
        App exercise1 = new App();

        System.out.println("Task 1: Say Hello World");
        exercise1.sayHelloWorld();

        System.out.println("\nTask 2: Hello Robot");
        exercise1.helloRobot();

        System.out.println("\nTask 3: Literals");
        exercise1.sumOfLiterals();

        System.out.println("\nTask 4: Add two Numbers");
        exercise1.addTwoNumbers();

        System.out.println("\nTask 5: Swap two Numbers without using a helper variable");
        exercise1.swapTwoNumbers();

        System.out.println("\nTask 6: Compare two Numbers");
        exercise1.compareTwoNumbers();

        System.out.println("\nTask 7: Rating Sales Person");
        exercise1.ratingSalesPerson();

        System.out.println("\nTask 8: Commission Rate");
        exercise1.getCommissionRate();

        System.out.println("\nTask 9: Leapyear");
        exercise1.leapyear();

        System.out.println("\nTask 10: Transposed Numbers");
        exercise1.transposedNumbers();
    }
}