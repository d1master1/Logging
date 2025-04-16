package org.example;

import java.util.logging.*;

public class SimpleLogging {
    private static final Logger logger = Logger.getLogger(SimpleLogging.class.getName());

    public static void main(String[] args) {
        logger.setLevel(Level.ALL);
        logger.info("Программа запущена");
        int result = divide(10, 0);
        logger.info("Программа завершена");
    }

    public static int divide(int a, int b) {
        logger.fine("Вход в метод divide с аргументами: " + a + ", " + b);
        if (b == 0) {
            logger.severe("Попытка деления на ноль");
            return 0;
        }
        return a / b;
    }
}