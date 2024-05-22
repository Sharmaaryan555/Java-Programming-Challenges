import java.util.Scanner;

class UserInput {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Please , enter your name:  ");
        String name = input.next();
        System.out.println("Welcome "+ name + " to Java Programming Language...");

    }
}
