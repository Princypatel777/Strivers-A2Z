import java.util.Scanner;

public class InputOutput {
    public static void printNumber(int num) {
        System.out.print(num);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int number = sc.nextInt();
        printNumber(number);
    }
}
