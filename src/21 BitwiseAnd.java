import java.util.Scanner;

class BitwiseAnd {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Showcasing Bitwise And Operator\n");

        System.out.print("Please, enter first Number: ");
        int first = input.nextInt();
        System.out.print("Now, enter the other Number: ");
        int second = input.nextInt();

        int result = first & second;
        System.out.println("Result is : "+result);
    }
}
