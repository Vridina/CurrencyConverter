package project.kolesnikova.converter.utils;

import project.kolesnikova.converter.exception.AppException;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.time.LocalDate;
import java.util.stream.Stream;

import static project.kolesnikova.converter.config.Setting.getUrlForeignCurrencyMarket;

public class URLUtils {



    Stream<String> readUrl() {
        try (BufferedReader bufferedReader = new BufferedReader
                (new InputStreamReader(getUrlForeignCurrencyMarket(LocalDate.now()).openStream()))) {
            return bufferedReader.lines();
        } catch (IOException e) {
            throw new AppException("Ошибка чтения URL", e);
        }
    }

}
