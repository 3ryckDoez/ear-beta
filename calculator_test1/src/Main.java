import com.tests.calculator1.Calculator1;

import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Calculator1 cal = new Calculator1();
        double[] user_vals = pedirValores();
        double result = cal.doOperation(user_vals, Calculator1.operators.suma);
        System.out.println("La suma total es: " + result);
        result = cal.doOperation(user_vals, Calculator1.operators.resta);
        System.out.println("La resta total es: " + result);
        result = cal.doOperation(user_vals, Calculator1.operators.mult);
        System.out.println("La multiplicación total es: " + result);


    }

    public static double[] pedirValores(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Ingrese los valores: ");
        String[] str_vals = sc.nextLine().split(" ");
        double[] temp_vals = new double[str_vals.length];
        for(int i = 0; i < str_vals.length; i++) temp_vals[i] = Double.parseDouble(str_vals[i]);
        return temp_vals;
    }
}