import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("Enter a number: ");
        Scanner sc = new Scanner(System.in);
        int i = sc.nextInt();
        if(i % 3 == 0 && i % 5 == 0){
            System.out.println("FizzBuzz");
        }
        else if(i % 3 == 0){
            System.out.println("Fizz");
        }
        else if(i % 5 == 0){
            System.out.println("Buzz");
        }



    }
}
