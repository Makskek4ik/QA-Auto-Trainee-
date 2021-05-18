package Tasks;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Task1 {
    private static final int STATIC_NUMBER = 7;

    public static void main(String[] args) {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Enter number");
        try {
            int number = Integer.parseInt(reader.readLine());
            System.out.println(hiOrEmpty(number));
        } catch (IOException e) {
            System.err.println("line has not been read");
        }catch (NumberFormatException e){
            System.err.println("number has been entered incorrectly");
        }
    }

    public static String hiOrEmpty(int number) {
        if (number > STATIC_NUMBER) {
            return "Привет!";
        } else {
            return "";
        }
    }
}
