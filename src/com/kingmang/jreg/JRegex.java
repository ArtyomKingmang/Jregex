package com.kingmang.jreg;

public class JRegex {
    private StringBuilder regex;

    public JRegex() {
        regex = new StringBuilder();
    }

    public JRegex digit() {
        regex.append("\\d");
        return this;
    }

    public JRegex just(String str) {
        regex.append(str);
        return this;
    }
    public JRegex unicode(){
        regex.append("\\u");
        return this;
    }
    public JRegex times(int n) {
        regex.append("{").append(n).append("}");
        return this;
    }

    public JRegex beginning() {
        regex.insert(0, "^");
        return this;
    }

    public JRegex ending() {
        regex.append("$");
        return this;
    }

    public JRegex group(JRegex regex) {
        this.regex.append("(").append(regex.build()).append(")");
        return this;
    }

    public JRegex or(JRegex regex) {
        this.regex.append("|").append(regex.build());
        return this;
    }

    public JRegex any() {
        this.regex.append(".");
        return this;
    }

    public JRegex word() {
        this.regex.append("\\w");
        return this;
    }

    public JRegex notDigit() {
        this.regex.append("\\D");
        return this;
    }

    public JRegex notWord() {
        this.regex.append("\\W");
        return this;
    }

    public JRegex notSpace() {
        this.regex.append("\\S");
        return this;
    }

    public JRegex optional() {
        regex.append("?");
        return this;
    }


    public JRegex repeat(int min, int max) {
        regex.append("{").append(min).append(",").append(max).append("}");
        return this;
    }

    public String build() {
        return regex.toString();
    }


}