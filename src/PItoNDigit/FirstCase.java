package PItoNDigit;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * Created by Artem on 16.05.2016.
 *
 * Find PI to the Nth Digit - Enter a number and have the program generate PI up to that many decimal places.
 * Keep a limit to how far the program will go.
 *
 */
public class FirstCase {
    private static final int LIMIT = 1500;
    public static void main(String[] args){
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        try{
            int decimalCount = Integer.parseInt(reader.readLine());
            System.out.println((Math.PI));
        }
        catch (IOException e){
            System.out.println("Incorrect input. Please enter digit.");
        }
    }
}
