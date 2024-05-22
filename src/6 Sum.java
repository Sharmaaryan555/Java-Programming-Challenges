import java.util.Scanner;

class Sum {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Please , enter first Number: ");
        int firstNum = input.nextInt();
        System.out.print("Please , enter your Second Number: ");
        int secondNumber = input.nextInt();

        int sum = firstNum + secondNumber;

        System.out.println("Sum of Two Number are :  "+sum);
    }
}
