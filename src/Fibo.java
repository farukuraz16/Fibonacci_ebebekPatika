import java.util.Scanner;

//sample: 9 digits  Fibonacci Series : 0 1 1 2 3 5 8 13 21 34
public class Fibo {
    public static void main(String[] args) {
        Scanner dat = new Scanner(System.in);
        System.out.println("Enter a number= ");
        int num= dat.nextInt();
        int a = 0;
        int sum = 1;
        for (int i = 0; i <= num; i++) {
            System.out.print(a + " ");
            sum += a;
            a = sum - a;
        }
    }
}
