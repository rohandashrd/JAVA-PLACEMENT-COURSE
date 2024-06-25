import java.util.Scanner;

public class R10_Functions {

    public static void printhello(){
        System.out.println("Hello World");
        System.out.println("Hello World");
        System.out.println("Hello World");
        System.out.println("Hello World");
        System.out.println("Hello World");
    }

    public static void addition(int a , int b){
        int sum=a+b;
        System.out.println("Addition is : "+ sum);
    }

    public static void main(String[] args) {
        Scanner sc=new Scanner (System.in);
        int a =sc.nextInt();
        int b=sc.nextInt();
        addition(a,b);
        System.out.print("Enter T or F: ");
        String ch=sc.next();
        if (ch.equals("T")){
            printhello();
        }


    }
}
