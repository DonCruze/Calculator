/**
 * @author Ulugbek Ostonov
 * @Date 22.05.2022
 */

import java.util.ArrayList;
import java.util.Arrays;
import java.util.InputMismatchException;
import java.util.List;

public class Calc {

    public void getResult (String inf) throws Exception {

        List<String> strList = new ArrayList<>();
        List<String> rimList;
        String [] rome = {"X","I","II","III","IV","V","VI","VII","VIII","IX"};
        Integer a = 0;

        rimList = Arrays.asList(rome);

        for (String listElement : inf.trim().split(" ")) {
            strList.add(listElement);
        }
        for (String kakoyto: rimList  ) {
            if(strList.get(0).equals(kakoyto) && !strList.get(2).equals(kakoyto) || !strList.get(0).equals(kakoyto) && strList.get(2).equals(kakoyto)){
                throw new Exception();
            }
        }


        for (String listRim: rimList ) {

            if(strList.get(0).equals(listRim)) {
                strList.set(0,String.valueOf(romanToNumber(strList.get(0)))) ;

            }
            if(strList.get(2).equals(listRim)) {
                strList.set(2,String.valueOf(romanToNumber(strList.get(2))));

            }


        }


        if(Integer.parseInt(strList.get(0)) < 1 || Integer.parseInt(strList.get(0)) > 10 || Integer.parseInt(strList.get(2)) < 1 || Integer.parseInt(strList.get(2)) > 10 ){
            throw new Exception();
        }
        if(Integer.parseInt(strList.get(2)) < 1 || Integer.parseInt(strList.get(2)) > 10){
            throw new Exception();
        }


        if(strList.get(1).equals("+")) {
            a = Integer.parseInt(strList.get(0)) + Integer.parseInt(strList.get(2));

        }
        if(strList.get(1).equals("-")) {
            a = Integer.parseInt(strList.get(0)) - Integer.parseInt(strList.get(2));
            ;
        }
        if(strList.get(1).equals("/")) {
            a = Integer.parseInt(strList.get(0)) / Integer.parseInt(strList.get(2));

        }
        if(strList.get(1).equals("*")) {
            a = Integer.parseInt(strList.get(0)) * Integer.parseInt(strList.get(2));

        }
        System.out.println(a);

    }

    private static int romanToNumber (String roman) {
        try {
            if (roman.equals("I")) {
                return 1;
            } else if (roman.equals("II")) {
                return 2;
            } else if (roman.equals("III")) {
                return 3;
            } else if (roman.equals("IV")) {
                return 4;
            } else if (roman.equals("V")) {
                return 5;
            } else if (roman.equals("VI")) {
                return 6;
            } else if (roman.equals("VII")) {
                return 7;
            } else if (roman.equals("VIII")) {
                return 8;
            } else if (roman.equals("IX")) {
                return 9;
            } else if (roman.equals("X")) {
                return 10;
            }
        } catch (InputMismatchException e) {
            throw new InputMismatchException("Неверный формат данных");
        }
        return -1;
    }
}
