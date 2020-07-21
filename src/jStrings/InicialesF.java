package jStrings;

import libs.Input;

public class InicialesF {

    public static void main(String[] args) {

        Input.print("Cual es tu nombre? ");
        String s = Input.get_string();
        if (s != null) {

            for (int i = 0, n = s.length(); i < n; i++)

            {
                if (s.charAt(i) >= 'A' && s.charAt(i) <= 'Z') {

                    Input.print(s.charAt(i));
                }


            }

        }

    }

}
