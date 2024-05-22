import java.util.Scanner;

class TriangleArea {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Welcome to Area Calculator !!!");
        System.out.print("Please, enter your base in cm: ");
        double base = input.nextDouble();
        System.out.print("Now, enter your perpendicular height in cm: ");
        double height = input.nextDouble();

        double area = (base * height)/2;

        System.out.println("The Area of your Triangle is: "+area+" cm2");
    }
}
