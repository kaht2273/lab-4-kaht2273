package q1;
import java.util.InputMismatchException;
import java.util.Scanner;

public class App
{

    // TODO: Complete the application as described in the lab instructions
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);


        // This method reads the number provided using keyboard
        double numOne = 0;
        double numTwo = 0;
        boolean isValidInput = false;

        while (!isValidInput)
        {
            try
            {
                System.out.print("Enter your first number: ");
                numOne = scanner.nextDouble();
                System.out.print("Enter the second number: ");
                numTwo = scanner.nextDouble();
                isValidInput = true;
            }
            catch (InputMismatchException e)
            {
                System.out.println("Invalid input, please enter numbers only.");
                scanner.nextLine();
            }
        }

        // This method reads the number provided using keyboard
        //double num--- = scan.nextDouble();

        // Closing Scanner after the use
        //scanner.close();

        System.out.println("");
        System.out.println("Sum:              " + (numOne + numTwo));
        System.out.println("Difference:       " + (numOne - numTwo));
        System.out.println("Product:          " + (numOne * numTwo));
        System.out.println("Average:          " + ((numOne + numTwo) / 2));
        System.out.println("Distance:         " + (numOne + numTwo));

        //Shortcut to Min & Max
        double min= Math.min(numOne,numTwo);
        double max= Math.max(numOne,numTwo);

        //Long way to fin max and min
        /*
        if (numOne > numTwo)
        {
            System.out.println("Min:          " + numTwo);

        }
        if (numOne < numTwo)
        {
            System.out.println("Max:          " + numTwo);

        }
        if (numOne == numTwo)
        {
            System.out.println("Both Numbers are  " + numOne);
        }
        else
            System.out.println("Min:          " + numOne);

        */
        }


    }
