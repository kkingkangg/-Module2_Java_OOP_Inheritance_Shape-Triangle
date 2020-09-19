import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Nhập cạnh thứ nhất cho tam giác: ");
        double side1 = input.nextDouble();
        System.out.print("Nhập cạnh thứ hai cho tam giác: ");
        double side2 = input.nextDouble();
        System.out.print("Nhập cạnh thứ ba cho tam giác: ");
        double side3 = input.nextDouble();
        System.out.print("Nhập màu cho tam giác: ");
        String color = input.nextLine();

        Triangle triangle = new Triangle(side1, side2, side3);
        triangle.setColor(color);
        System.out.println(triangle);
    }
}
