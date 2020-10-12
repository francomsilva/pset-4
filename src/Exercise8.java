import java.util.Scanner;

public class Exercise8 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Text : ");
        String text = input.nextLine();
        String capitalizedText = text.toUpperCase();

        int length = capitalizedText.length();
        int divide = (int) (length * 0.5);
        String back = capitalizedText.substring(0, divide);
        String front = capitalizedText.substring(divide);

        System.out.println("\n" + front + back + ".");
        input.close();
    }
}
