import java.util.Scanner;

public class basicLoops {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // // for loop
        for (int i = 1; i <= 5; i++) {
        System.out.println("hello");
        }
        System.out.println("Over");

        // // While loop
        int a = 10;
        while (a <= 11) {
        System.out.println("my name is himanshu");
        a++;
        }

        // // do while loop
        int b = 1;
        do {
        System.out.println("pagal");
        b++;
        } while (b < 6);

        // Print 1 to 10
        for (int i = 1; i <= 10; i++) {
        System.out.print(i);
        }

        // // print 10 to 1
        for (int i = 10; i >= 1; i--) {
        System.out.print(i);
        }

        // all even number between 1 to 50
        int even = 1;
        while (even <= 50) {
        if (even % 2 == 0) {
        System.out.println(even);
        }
        even++;
        }

        // all odd number between 1 to 50
        int odd = 1;
        while (odd <= 50) {
        if (odd % 2 == 1) {
        System.out.println(odd);
        }
        odd++;
        }

        // sum all numbers from 1 to 100
        int num = 1;
        int sum = 0;
        while (num <= 100) {
        sum = sum + num;
        num++;
        }
        System.out.println(sum);

        // print table
        System.out.print("Enter number to print table : ");
        int table = sc.nextInt();
        for (int i = 1; i <= 10; i++) {
        System.out.println(table*i);
        }

        // sum of all even number
        int even1 = 1;
        int sumofeven = 0;
        while (even1 <= 100) {
            if (even1 % 2 == 0) {
                System.out.println(even1);
                sumofeven = sumofeven + even1;
            }
            even1++;
        }
        System.out.println(sumofeven);

        
        sc.close();

    }
}