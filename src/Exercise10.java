import java.util.Scanner;

public class Exercise10 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("What's your favorite city? ");
        String city = input.nextLine();
        int cityLength = city.length();
        String cityUppercase = city.toUpperCase();
        String cityLowercase = city.toLowerCase();

        System.out.println("\nText   : " + city);
        System.out.println("Length : " + cityLength);
        System.out.println("Upper  : " + cityUppercase);
        System.out.println("Lower  : " + cityLowercase);
    }
}