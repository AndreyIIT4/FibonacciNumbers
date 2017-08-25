import java.util.Scanner;

public class Fibonacci {

    public int n;
    Scanner scan = new Scanner(System.in);
    public  static void main(String args[]){
        Fibonacci fib=new Fibonacci();
        fib.FibonacciCalculation();
    }

    public void FibonacciCalculation(){
        System.out.print("N =");
        n=scan.nextInt();
        int fib1=1;
        int fib2=1;
        int sumFib;
        System.out.print("Fibonacci numbers:");
        for (int i=1;i<n;i++){
            sumFib = fib1 + fib2;
            fib1=fib2;
            fib2=sumFib;
            System.out.print(sumFib + " ");
        }
    }

}
