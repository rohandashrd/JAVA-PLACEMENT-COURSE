public class R7_operators {
    public static void main(String[] args) {
        int a=10;
        int b=20;
        int sum=a+b;
        int sub=b-a;
        int mul=a*b;
        int div=b/a;
        int modulo=a%b;
        System.out.println("\n\n--------------Arithmetic Operation------------");
        System.out.println("Given a= "+a+" and "+"b= "+b);
        System.out.println("Addition is: "+sum);
        System.out.println("Subtraction is: "+sub);
        System.out.println("Multiplication is: "+mul);
        System.out.println("Division is: "+div);
        System.out.println("Remainder is: "+modulo);

        System.out.println("\n\n------------Unary Operation------------");

        System.out.println("a++ : "+ a++ +" after updation: "+ a);
        System.out.println("++a : "+ ++a +" before: "+ a);
        System.out.println("b-- : "+ b-- +" after updation: "+ b);
        System.out.println("--b : "+ --b +" before: "+ b);

        System.out.println("\n\n------------Relational Operation------------");
        System.out.println(a==b);
        System.out.println(a<b);
        System.out.println(a<=b);
        System.out.println(a>b);
        System.out.println(a>=b);
        System.out.println(a!=b);

        System.out.println("\n\n------------Logical Operation------------");
        System.out.println((a>20) && (b<20));
        System.out.println((a>20) || (b<20));
        System.out.println(!(25==25));

        System.out.println("\n\n------------Logical Operation------------");
        System.out.println(a=b);
        System.out.println(a+=a);
        System.out.println(b-=b);




    }
}
