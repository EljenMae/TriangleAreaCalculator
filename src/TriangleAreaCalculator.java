/*
This is the basic of the calculation of the getting the area of the triangle.
 */


import java.util.Scanner;

public class TriangleAreaCalculator {
    public static void main (String[] args){
        Scanner scanner = new Scanner (System.in);

        System.out.println("--Welcome to Basic Triangle Area Caculator--");
        System.out.print("Enter width: ");
        double width = scanner.nextDouble();
        System.out.print("Enter height: ");
        double height = scanner.nextDouble();

        //Caculating the area
        double area = width * height * 0.5;

        //Showing the result
        System.out.println("The are of the triangle is " + area);

        scanner.close();
    }
}
