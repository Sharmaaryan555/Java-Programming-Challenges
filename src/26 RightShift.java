import java.util.Scanner;

class RightShift {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Welcome to showcase RightShift Operator\n");
        System.out.print("Please enter your number: ");
        int num = input.nextInt();

        int result = num >> 1;
        System.out.println("Result is: "+result);

    }
}
