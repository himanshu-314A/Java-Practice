public class basicOperators {
    public static void main(String[] args) {

        // Arithmetic Operators
        int a = 20 ;
        int b = 30 ;
        System.out.println(a + b );
        System.out.println(a - b );
        System.out.println(a * b );
        System.out.println(a / b );
        System.out.println(a % b );

        // Relational Operators
        int c = 20 ;
        int d = 20 ;
        System.out.println( c == d );
        System.out.println( c != d );
        System.out.println( c > d );
        System.out.println( c < d );
        System.out.println( c <= d );
        System.out.println( c >= d );

        // Logical Operators 
        int age = 53 ; 

        System.out.println(age >= 24 && age <= 45);
        System.out.println(age >= 24 || age <= 45);

        // Assignment Operators
        int num1 = 10 ;
    
        num1 += 10 ;             //num1 = num1 + 10
        System.out.println(num1); 

        int num2 = 10 ;
        num2 -= 3 ;             //num2 = num2 - 10
        System.out.println(num2);
        int num3 = 10 ; 
        num3 *= 10 ;             //num3 = num3 * 10
        System.out.println(num3);

        int num4 = 10 ; 
        num4 /= 2 ;             //num4 = num4 / 10
        System.out.println(num4);

        int num5 = 10 ; 
        num5 %= 10 ;             //num5 = num5 % 10
        System.out.println(num5); 

        // Unary Operators

        int k = 10 ;
         k++;
        System.out.println(k);
        int l = 10 ;
        l--;
        System.out.println(l);
        


    }
}
