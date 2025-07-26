package ru.shapovalov.common.logging.maven;

public class LoggingStarterAutoConfiguration {

    public static void println(String text) {
        System.out.println("Выведено из maven стартера: " + text);
    }
}
