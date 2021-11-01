package com.pb.sirosh;

public class Test {
    public static void main(String[] args) {

        String str1 = "ghj  //j";

        char[] str1_array_new = new char[0];
        char[] str1_array = str1.toCharArray();
        int j = 0;

            for (int i = 0; i < str1_array.length; i++) {
                if (Character.isLetter(str1_array[i])) {

                    str1_array_new[j] = str1_array[i];
                    j++;
                }
            }
        System.out.println(str1_array_new);
        //System.out.println(c);

        }
    }

