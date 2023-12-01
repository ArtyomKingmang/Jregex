package com.kingmang.tests.regex;


import com.kingmang.jterminal.JRegex.JRegex;

public class RegularExpressionsTest {
    public static void main(String[] args) {
        String pattern = new JRegex()
                .digit().times(5)
                .just("-")
                .digit().times(4).optional()
                .build();

        System.out.println(pattern);  // Output: \d{5}(-\d{4})?

        pattern = new JRegex()
                .beginning()
                .digit().repeat(4, 4)
                .just("-")
                .digit().repeat(2, 2)
                .just("-")
                .digit().repeat(2, 2)
                .ending()
                .build();

        System.out.println(pattern);  // Output: ^(?:\d){4}(?:(?:\-)(?:\d){2}){2}$


        JRegex regex = new JRegex();
        pattern = regex.beginning()
                .digit().times(3)
                .just("-")
                .word().repeat(3, 6)
                .ending()
                .build();
        System.out.println(pattern);  // Output: ^\d{3}-\w{3,6}$
    }

}
