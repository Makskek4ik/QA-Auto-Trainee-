package Tasks;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Task2 {

    private static final String STATIC_NAME = "Вячеслав";

    public static void main(String[] args) {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Enter name");
        try {
            String name = reader.readLine();
            System.out.println(getGreeting(name));
        } catch (IOException e) {
            System.err.println("line has not been read");
        }
    }

    public static String getGreeting(String name){
        if (name.equals(STATIC_NAME)){
            return "Привет, Вячеслав";
        }else {
            return "Нет такого имени";
        }
    }
}
