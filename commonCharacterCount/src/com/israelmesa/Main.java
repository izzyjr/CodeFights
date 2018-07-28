package com.israelmesa;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main {

    public static void main(String[] args) {


        String one = "aabcc";
        String two = "adcaa";

//        String one = "abca";
//        String two = "xyzbac";
        commonCharacterCount(one, two);


    }

    private static int commonCharacterCount(String s1, String s2) {

        int count = 0;
        List<String> stringListOne = new ArrayList<String>(Arrays.asList(s1.split("")));
        List<String> stringListTwo = new ArrayList<String>(Arrays.asList(s2.split("")));

        for (int i = 0; i < stringListOne.size(); i++) {

            for (int j = 0; j < stringListTwo.size(); j++) {

                if (stringListOne.get(i).equals(stringListTwo.get(j))) {

                    System.out.println(stringListOne.get(i)+ " == " + stringListTwo.get(j));
                    stringListOne.remove(i);
                    stringListTwo.remove(j);
                    count++;

                } else {

                    System.out.println(stringListOne.get(i)+ " != " + stringListTwo.get(j));

                }

            }

        }

        System.out.println("Count: " + count);
        return count;

    }
}
