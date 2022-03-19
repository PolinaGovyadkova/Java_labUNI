package com.company;

import java.io.IOException;

public class Main {

    public static void main(String[] args) {
        String str = "Begayet po polyu veselo kabanchik";
        System.out.println(str);
        String result = "";
        try
        {
            result = Swap.SwapWords(str);
        }
        catch (Exception e)
        {
            System.out.println(e.getMessage());
        }
        System.out.println(result);
    }
}
