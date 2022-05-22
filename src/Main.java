/**
 * @author Ulugbek Ostonov
 * @Date 22.05.2022
 */

import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws Exception {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Калькулятор \n***\nВведите значения через пробел: \n \t2 + 3, X / II\n***\nВвод:");
        String in = scanner.nextLine();


        Calc calc = new Calc();

        calc.getResult(in);
    }
}
