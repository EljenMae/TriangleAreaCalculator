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
                System.out.print("Case 2");

                break;
            }//End of case 2

            default: //if no matches
                System.out.println("Please, choose the number of your choices.");
        }








        scanner.close();
    }
}
