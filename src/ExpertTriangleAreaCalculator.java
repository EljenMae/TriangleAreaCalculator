import java.util.Scanner;
public class ExpertTriangleAreaCalculator {
    public static void main (String[] args){
        Scanner scanner = new Scanner(System.in);


        System.out.println("-- Welcome to Triangle Area Calculator--");
        System.out.println("1. Base and height");
        System.out.println("2: Three sides (SSS)");
        System.out.println("3: Two sides + angle between (SAS)");
        System.out.println("4: Two angles + side between (ASA)");
        System.out.print("Choose a number of your choice: ");

        //Choices
        int choices = scanner.nextInt();

        //Activing the cases here
        switch (choices){
            case 1:{

                System.out.println("Base and height");

                double result;

                System.out.print("Width: ");
                double width = scanner.nextDouble();
                System.out.print("Height: ");
                double height = scanner.nextDouble();
                System.out.print("Area: ");
                double area = scanner.nextDouble();

                //if statement here
                if (width == 0 ){
                    result = (2 * area)/ height;
                } else if (height == 0) {
                    result = (2 * area)/width;
                } else {
                    result = 0.5 * width * height;
                }

                //Showing the result
                System.out.print("Result: " + result);

                break;

            }//end of case 1
            case 2: {

                double result1;

                System.out.println("Three sides (SSS)");

                //Inputing values in this part
                System.out.print("Side A: ");
                double a = scanner.nextDouble();

                System.out.print("Side B: ");
                double b = scanner.nextDouble();

                System.out.print("Side C: ");
                double c = scanner.nextDouble();

                //Create a conditional for where the side b must be smaller than the sum of sides a and c.
                if ( a<= 0 || b <=0 || c<=0){
                    System.out.print("All sides must be greater than 0.");
                } else if (b>=a+c) {
                    System.out.print("Side B must be smaller than the sum of sides A and C");
                }else {
                    //Conditional for the calculations here if they are match
                    result1 = 0.25 * Math.sqrt((a + b + c) * (-a + b + c) * (a - b + c) * (a + b - c));

                    //Result
                    System.out.print("Getting the area: " + result1);
                }//ending of conditional formula here
                break;
            }//End of case 2

            case 3: {

                double result;

                System.out.println("Two sides + angle between (SAS)");

                System.out.print("Side A: ");
                double a = scanner.nextDouble();

                System.out.print("Angle Y: ");
                double angleY = scanner.nextDouble();

                System.out.print("Side B: ");
                double b = scanner.nextDouble();

                System.out.print("Area: ");
                double area = scanner.nextDouble();

                // Here lies the calculation
                if (a == 0 && b != 0 && angleY != 0) { //and condition for the every is true here that are not all is not to 0.
                    // Solve for a
                    result = (2 * area) / (b * Math.sin(angleY));

                } else if (b == 0 && a != 0 && angleY != 0) {
                    // Solve for b
                    result = (2 * area) / (a * Math.sin(angleY));

                } else if (angleY == 0 && a != 0 && b != 0) {
                    // Solve for sin(angleY)
                    result = (2 * area) / (a * b);

                } else {
                    result = 0.5 * a * b * Math.sin(angleY);
                }
                //Showing the result
                System.out.println("Result: " + result);
                break;
            }//end of case 3

            case 4: {
                System.out.println("Two angles + side between (ASA)");
                break;
            }//end of case 4

            default: //if no matches
                System.out.println("Please, choose the number of your choices.");
        }
        scanner.close();
    }
}
