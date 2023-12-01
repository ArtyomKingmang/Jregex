package com.kingmang.tests.ansi;

import com.kingmang.jreg.ansi.ansi;

public class AnsiColoringTest {
    public static void main(String[] args){
        System.out.println(ansi.fgRed("Hello") + " " + ansi.fgGreen("World"));
    }

}
