package JAVAProgramming.Day1;

public class P001Swapping {
    public static void main(String[] args) {

        int a = 10, b= 20;
        System.out.println("Before swapping the values are "+a+" "+b);
        // logic 1 - Using third variable

//        int t = a;
//        a=b;
//        b=t;
//        System.out.println("After swapping the values are "+a+" "+b);

        // logic 2 - without Using third variable
        // using + and - operator
//
//        a = a+b; // 10+20 = 30
//        b = a-b; // 30-20 = 10
//        a = a-b; // 30-20 = 20
//
//        System.out.println("After swapping the values are "+a+" "+b);

        // logic 2 using * and / operator
        // here a & b values should not be zero

//        a = a*b; //10*20 =200
//        b= a/b; // 200/20 =10
//        a=a/b; // 200/10 = 20
//        System.out.println("After swapping the values are "+a+" "+b);

        //Logic 4  botwise XOR (^)

//        a = a^b;
//        b = a^b;
//        a = a^b;
//
//        System.out.println("After swapping the values are "+a+" "+b);


        //Logic 4
        b=a+b-(a=b);
        System.out.println("After swapping the values are "+a+" "+b);

    }
}
