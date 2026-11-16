import java.util.Scanner;

public class basicinput {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter your name : ");
        String name = sc.nextLine();

        // take two input from the user to add, sub, multiply
        System.out.print("Enter num1 : ");
        int a = sc.nextInt();
        System.out.print("Enter num2 : ");
        int b = sc.nextInt();

        System.out.println("Add of two input is :" + (a + b));
        System.out.println("sub of two input is :" + (a - b));
        System.out.println("Multiply of two input is :" + (a * b));
        System.out.println("div of two input is :" + (a / b));

        // take two input form the user to check the biger one
        System.out.print("Enter the num3 : ");
        int c = sc.nextInt();
        System.out.print("Enter the num4 : ");
        int d = sc.nextInt();

        if (c > d) {
            System.out.println(c + " is greater ");
        } else if (d > c) {
            System.out.println(d + " is greater ");
        }

        // take age to check the eligibal for voating or not
        System.out.print(" Enter your age : ");
        int age = sc.nextInt();
        if (age >= 18) {
            System.out.println("Eligibal for voating ");
        } else {
            System.out.println("you are under age");
        }

        // check even or odd by using % operator
        System.out.print("Enter a number : ");
        int num = sc.nextInt();
        if (num % 2 == 0) {
            System.out.println("num is Even");
        } else {
            System.out.println("num is Odd");
        }

        // take user name or 3 subject markes find out percentage
        System.out.print("Enter your name : ");
        String name1 = sc.nextLine();
        System.out.print("Mathe markes : ");
        int mathe = sc.nextInt();
        System.out.print("Mathe hindi : ");
        int hindi = sc.nextInt();
        System.out.print("Mathe english : ");
        int english = sc.nextInt();

        int total = mathe + hindi + english;
        double percentage = (total / 300.0) * 100;
        System.out.println("Name :" + name1);
        System.out.println("Total Markes :" + total);
        System.out.println("Percentage :" + percentage);

        sc.close();
    }

}
