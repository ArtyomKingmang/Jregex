package com.kingmang.jterminal.ansi;
import static com.kingmang.jterminal.ansi.Colors.*;

public class ansi {
    public static String fgBlack(String text) {
        return ANSI_BLACK + text + ANSI_RESET;
    }

    public static String fgRed(String text) {
        return ANSI_RED + text + ANSI_RESET;
    }

    public static String fgGreen(String text) {
        return ANSI_GREEN + text + ANSI_RESET;
    }

    public static String fgYellow(String text) {
        return ANSI_YELLOW + text + ANSI_RESET;
    }

    public static String fgBlue(String text) {
        return ANSI_BLUE + text + ANSI_RESET;
    }

    public static String fgPurple(String text) {
        return ANSI_PURPLE + text + ANSI_RESET;
    }

    public static String fgCyan(String text) {
        return ANSI_CYAN + text + ANSI_RESET;
    }

    public static String fgWhite(String text) {
        return ANSI_WHITE + text + ANSI_RESET;
    }
}
