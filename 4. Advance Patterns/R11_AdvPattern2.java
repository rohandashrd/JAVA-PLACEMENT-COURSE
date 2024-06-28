import java.util.Scanner;

public class R11_AdvPattern2 {

//                    *
//                  **
//                 ***
//                ****
//               *****


    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter number of rows: ");
        int n=sc.nextInt();

        for(int i=1;i<=n;i++){
            //outer loop for rows
            for(int j=1;j<=n-i;j++){
                //for printing spaces
                System.out.print(" ");
            }
            for(int k=1;k<=i;k++){
                //print stars as number of stars = i
                System.out.print("*");
            }
            System.out.println();
        }

    }
}
