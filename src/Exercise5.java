import java.util.Scanner;

public class Exercise5 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Diameter : ");
        int diameter = input.nextInt();

        double area = Math.PI * (Math.pow(0.5 * diameter, 2));
        double circumference = Math.PI * diameter;

        System.out.printf("\nArea            : %,.2f%n", area);
        System.out.printf("\nCircumference :%,.2f%n", circumference);
        input.close();
    }
}