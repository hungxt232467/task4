import java.util.Scanner;

public class task4_3 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a number : ");
        int num = input.nextInt();
        if (num % 3 ==0){
            System.out.println("Inside Outer if block ");
            if (num % 5 == 0){
                System.out.printf("Number is divisible by 3 and 5");
            }
            else {
                System.out.println("Number iss divisible by 3 ,but not by 5");
            }
        }
        else {
            System.out.printf("Number iss not divisible by 3");
        }
    }
}
