package com.kingmang.jreg.ansi;

public class ansi {
    public static String fgBlack(String text) {
        return Colors.ANSI_BLACK + text + Colors.ANSI_RESET;
    }

    public static String fgRed(String text) {
        return Colors.ANSI_RED + text + Colors.ANSI_RESET;
    }

    public static String fgGreen(String text) {
        return Colors.ANSI_GREEN + text + Colors.ANSI_RESET;
    }

    public static String fgYellow(String text) {
        return Colors.ANSI_YELLOW + text + Colors.ANSI_RESET;
    }

    public static String fgBlue(String text) {
        return Colors.ANSI_BLUE + text + Colors.ANSI_RESET;
    }

    public static String fgPurple(String text) {
        return Colors.ANSI_PURPLE + text + Colors.ANSI_RESET;
    }

    public static String fgCyan(String text) {
        return Colors.ANSI_CYAN + text + Colors.ANSI_RESET;
    }

    public static String fgWhite(String text) {
        return Colors.ANSI_WHITE + text + Colors.ANSI_RESET;
    }
}
