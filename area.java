import java.util.*;
public class area {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the radius of the circle: ");
        double radius = scanner.nextDouble();
        System.out.println("Enter side length of square: ");
        double side = scanner.nextDouble();
        System.out.println("Enter length and breadth of rectangle: ");
        double length = scanner.nextDouble();
        double breadth = scanner.nextDouble();
        System.out.println("Enter base and height of triangle: ");
        double base = scanner.nextDouble();
        double height = scanner.nextDouble();
        double area = Math.PI * radius * radius;
        System.out.printf("The area of the circle with radius %.2f is %.2f%n", radius, area);
        double area1 = side * side;
        System.out.printf("The area of the square with side length %.2f is %.2f%n", side, area1);
        double area2 = length * breadth;    
        System.out.printf("The area of the rectangle with length %.2f and breadth %.2f is %.2f%n", length, breadth, area2);
        double area3 = 0.5 * base * height;
        System.out.printf("The area of the triangle with base %.2f and height %.2f is %.2f%n", base, height, area3);
        scanner.close();
    }
}
