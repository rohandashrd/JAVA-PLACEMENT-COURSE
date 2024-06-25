import java.util.Scanner;

public class R8_loop {
    public static void main(String[] args) {

        Scanner sc=new Scanner(System.in);

        //WHILE LOOP


//       Q1
//        int n=1;
//       while(n<=100){
//            System.out.println(n+" Hello");
//            n++;
//        }

//        Q2
//        while (n<=10){
//            System.out.println(n++);
//        }

//        Q3
//        System.out.print("Enter number to be counted till: ");
//        int a=sc.nextInt();
//        int i=1;
//        int sum=0;
//        while(i<=a) {
//            sum = sum +i;
//            i++;
//        }
//        System.out.print(sum);

        // FOR LOOP

//        Q1
//        for (int i=1;i<=5;i++){
//            System.out.println("Hello");
//        }

//        Q2
//        for (int i=1;i<=4;i++){
//            System.out.println("****");

//        System.out.print("Enter number: ");
//        int n=sc.nextInt();
//        for (;n>0;){
//            int last=n%10;
//            n=n/10;
//            System.out.print(last);

        //DO WHILE LOOP

        int m=1;
        do{
            System.out.println(m+"hello");
            m++;
    }while(m<=10);
    }
}
