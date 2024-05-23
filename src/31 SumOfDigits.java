import java.util.Scanner;

class SumOfDigits {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Welcome to Sum of Digits");
        System.out.print("Please, enter a nunber: ");
        int number = input.nextInt();

        int sum = sumOfDigits(number);
        System.out.println("Sum of Digits of a number is: "+sum);

    }
    public static int sumOfDigits(int num){
        int sum =0;
        while (num > 0){
            sum += num % 10;//sum = sum +(num % 10);
            num /= 10;// num = num /10;
        }
        return sum;
    }
}
