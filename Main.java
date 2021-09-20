import java.util.Scanner;

class CalculateDistance{
    double x1;
    double x2;
    double y1;
    double y2;

    public CalculateDistance(double x1, double x2, double y1, double y2) {
        this.x1 = x1;
        this.x2 = x2;
        this.y1 = y1;
        this.y2 = y2;
    }

    public double calculateDistanceBetweenPoints(){
        return Math.sqrt((y2 - y1) * (y2 - y1) + (x2 - x1) * (x2 - x1));
    }
}

public class Main {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        int x1;
        int y1;
        int x2;
        int y2;
        double result;
        System.out.println("Please input coordinate for start of line");
        System.out.print("X1: ");
        x1 = reader.nextInt();
        System.out.print("Y1: ");
        y1 = reader.nextInt();
        System.out.println("Please input coordinate for end of line");
        System.out.print("X2: ");
        x2 = reader.nextInt();
        System.out.print("Y2: ");
        y2 = reader.nextInt();
        CalculateDistance calculateDistance = new CalculateDistance(x1, x2, y1, y2);
        result = calculateDistance.calculateDistanceBetweenPoints();
        System.out.print("Length of line: " + result);
    }
}
