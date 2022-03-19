package com.company;

import java.util.ArrayList;
import java.util.List;
import java.util.regex.MatchResult;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.stream.Collectors;

import static java.lang.Math.max;

public class Swap {

    public static String SwapWords(String str) {
        String regexWordMatch = "\\w{1,}";
        String regexSymbolsMatch = "\\W{1,}";
        StringBuilder result = new StringBuilder("");
        List<String> words = new ArrayList<String>();
        List<String> symbols = new ArrayList<String>();

        Pattern p1 = Pattern.compile(regexWordMatch);
        Pattern p2 = Pattern.compile(regexSymbolsMatch);
        Matcher m1 = p1.matcher(str);
        Matcher m2 = p2.matcher(str);
        words = m1.results().
                map(MatchResult::group).
                collect(Collectors.toList());
        symbols = m2.results().
                map(MatchResult::group).
                collect(Collectors.toList());
        String temp = words.get(words.size() - 1);
        words.remove(words.size() - 1);
        words.add(0, temp);
        int maxList = max(words.toArray().length, symbols.toArray().length);
        for (int i = 0; i < maxList; i++) {
            if (i < words.toArray().length) {
                result.append(words.get(i));
            }
            if (i < symbols.toArray().length) {
                result.append(symbols.get(i));
            }
        }
        return result.toString();
    }
}
