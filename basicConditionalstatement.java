import java.util.Scanner;

public class basicConditionalstatement {
    public static void main(String[] args) {

        // if
        int age = 18;
        if (age >= 18) {
            System.out.println(" you are adult ");
        }

        // if else-if
        int a = 10;
        int b = 20;
        int total = a + b;
        if (total > 30) {
            System.out.println("greater");
        } else {
            System.out.println("smaller");
        }

        // nested if

        int age1 = 18;
        boolean hasVoterID = true;
        if (age1 >= 18) {
            if (hasVoterID) {
                System.out.println("you can vote");
            } else {
                System.out.println("you can not vote");
            }
        }

        // if else leader
        Scanner sc = new Scanner(System.in);
        System.out.println(" Enter markes to check grade : ");
        int markes = sc.nextInt();
        if (markes >= 90) {
            System.out.println("Grade A ");
        } else if (markes >= 80) {
            System.out.println("Grade B");
        } else if (markes >= 70) {
            System.out.println("Grade C");
        } else if (markes >= 60) {
            System.out.println("Grade D");
        } else if (markes >= 50) {
            System.out.println("Grade E");
        } else if (markes >= 40) {
            System.out.println("Grade F");
        } else {
            System.out.println("You are fale");
        }

        // Switch case
        System.out.println("Enter weekday number : ");
        int day = sc.nextInt();
        switch (day) {
            case 1:
                System.out.println("Monday");
                break;
            case 2:
                System.out.println("Tuesday");
                break;
            case 3:
                System.out.println("Wednesday");
                break;
            case 4:
                System.out.println("Thursday");
                break;
            case 5:
                System.out.println("Friday");
                break;
            case 6:
                System.out.println("Saturday");
                break;
            case 7:
                System.out.println("Sunday");
                break;

            default:System.out.println("enter valid weekday  number");
                break;
        }
        sc.close();
    }
}
