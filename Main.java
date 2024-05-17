import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        System.out.println();
        System.out.println("Enter the number of temperatures you wish to enter: ");
        Scanner scanner = new Scanner(System.in);
            int numOfTemps = scanner.nextInt();
            System.out.println();
            // Testing
            // System.out.println(numOfTemps + " Successfully recorded.");

            float[] temps = new float[numOfTemps];
            for (int i = 0; i < numOfTemps; i++) {
                System.out.println("Enter temperature for " + (i + 1));
                temps[i] = scanner.nextFloat();
            
        }
        System.out.println();

        // Testing
        // System.out.println("Temperatures entered:");
        // for(int i = 0; i < numOfTemps; i++) {
        //     System.out.println((i + 1) + ": " + temps[i]);
        // }

        float sum = 0.0f;
        for (int i = 0; i < numOfTemps; i++) {
            sum += temps[i];
        }

        // Testing
        // System.out.println("Sum of the temperatures: " + sum);

        float avgTemp = sum / numOfTemps;
        System.out.println("The average temperature is: " + avgTemp);
        System.out.println();

        scanner.close();
    }
}