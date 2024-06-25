public class R10_Functions_Operation {

    public static void calby(int a, int b){
        int temp=a;
        a=b;
        b=temp;
        System.out.println("in function a= "+a);
        System.out.println("in function b= "+b);

    }
    public static int multiply(int a,int b){
        int product=a*b;
        return product;
    }

    public static int factorial(int n) {
        int f=1;
        for(int i=1;i<=n;i++){
            f=f*i;
        }
        return f;//factorial of n
    }

    public static int binomial(int n,int r){
        int n_frac=factorial(n);
        int r_frac=factorial(r);
        int nmr_frac=factorial(n-r);
        int BC=n_frac/(r_frac*nmr_frac);
        return BC;
    }

    public static boolean prime(int n){
        boolean isPrime=true;
        for(int i=2;i<=n-1;i++){
            if(n%i==0){
                isPrime=false;
                break;
            }
        }
        return isPrime;
    }

    public static boolean optimizePrime(int n){
        for(int i=2;i<=Math.sqrt(n);i++){
            if(n%i==0){
                return false;
            }

        }
        return true;
    }
    public static void main(String[] args) {

//        int a=10;
//        int b=5;
//        System.out.println(a);
//        System.out.println(b);
//        calby(a,b);
//        System.out.println("a = "+a);
//        System.out.println("b = "+b);

//        int prod=multiply(3, 5);
//        System.out.println(prod);
//        prod=multiply(9, 5);
//        System.out.println(prod);

//        System.out.println(factorial(5));

//        System.out.println(binomial(5,2));

        System.out.println(optimizePrime(26));
        System.out.println(optimizePrime(29));
    }
}
