package org.example;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class Log4jExample {
    private static final Logger logger = LogManager.getLogger(Log4jExample.class);

    public static void main(String[] args) {
        logger.info("Запуск программы");
        try {
            int x = 10 / 0;
        } catch (Exception e) {
            logger.error("Произошла ошибка: ", e);
        }
        logger.info("Завершение программы");
    }
}