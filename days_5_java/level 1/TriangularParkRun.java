import java.util.Scanner;

public class TriangularParkRun {

    public static double calculateRounds(double a, double b, double c) {
        double perimeter = a + b + c;
        double distance = 5000; // 5 km in meters
        return distance / perimeter;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        double side1 = sc.nextDouble();
        double side2 = sc.nextDouble();
        double side3 = sc.nextDouble();

        double rounds = calculateRounds(side1, side2, side3);

        System.out.println("The athlete must complete " + rounds + " rounds to finish 5 km run");

        sc.close();
    }
}
