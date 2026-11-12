public class basicTypecasting {
    public static void main(String[] args) {
        // Widening Typecasting 
        // int -> long -> float -> double  convert automatically
        int a = 10 ;
        float b = a ;
        System.out.println(b);

        float c = 10.f ;
        double d = c ;
        System.out.println(d);

        // Narrowing Typecasting
        // double-> float -> long -> int  convert manually
        float e = 23.f ;
        int f = (int) e;
        System.out.println(f);

    }
}
