import java.util.Scanner;

public class R11_AdvPattern3 {

//            12345
//            1234
//            123
//            12
//            1


    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter number of rows: ");
        int n= sc.nextInt();

        //outer row
        for(int i=n;i>=1;i--){
             for(int j=1;j<=i;j++){
                 System.out.print(j+" ");
             }
            System.out.println();
         }
    }
}
