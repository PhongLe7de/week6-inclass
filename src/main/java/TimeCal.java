import java.util.Scanner;

public class TimeCal {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the distance: ");
        double distance = sc.nextDouble();
        System.out.print("Enter the speed: ");
        double speed = sc.nextDouble();
        System.out.print("Time to reach the destination: " + calTime(distance, speed));
    }

    public static double calTime(double x, double v){
        return x/v;
    }
}
