import java.util.Scanner;

public class IntermediateTriangleAreaCalculator {
    public static void main(String[] args){
        Scanner scanner = new Scanner (System.in);

        double area;
        double width;
        double height;
        double result;

        System.out.print("Width: ");
        width = scanner.nextDouble();

        System.out.print("Height: ");
        height = scanner.nextDouble();

        System.out.print("Area: ");
         area = scanner.nextDouble();

        //conditional here for the width
        if(width <= 0 || width == 0){
            result = (2 * area) / height;
        } else if (height <= 0 || height == 0) {
            result = (2 * area)/ width;
        } else {
            result = 0.5 * height * width;
        }

        //Showing the result
        System.out.print("Result: " + result);

        //Closing the scanner
        scanner.close();
    }
}
