import java.util.Scanner;
public class R10_BinaryToDecimal {

    //Binary to Decimal
    public static void binarytodecimal(int n) {
        int num=n;
        int pow = 0;
        int dec = 0;

        while (n > 0) {
            int LD = n % 10;
            dec = (int) (dec + (LD * Math.pow(2, pow)));
            pow++;
            n = n / 10;
        }

        System.out.println("Decimal of "+num+" is : " + dec);
    }

    //decimal to binary

    public static void dectobinary(int m){
        int numb=m;
        int pow=0;
        int binary=0;
         while(m>0){
             int rem=m%2;
             binary=(int)(binary+(rem*Math.pow(10, pow)));
             pow++;
             m=m/2 ;
         }
        System.out.println("Binary of "+numb+" is "+binary);
    }
        public static void main(String[] args) {

            Scanner sc =new Scanner(System.in);
            System.out.print("Enter Binary Number: ");
            int bi=sc.nextInt();
            System.out.print("Enter Decimal Number: ");
            int dec=sc.nextInt();
            binarytodecimal(bi);
            dectobinary(dec);
        }
}
