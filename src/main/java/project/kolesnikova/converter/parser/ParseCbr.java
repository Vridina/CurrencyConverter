package project.kolesnikova.converter.parser;


import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.dataformat.xml.XmlMapper;
import project.kolesnikova.converter.entities.ValCurs;
import project.kolesnikova.converter.exception.AppException;

import java.io.*;
import java.net.URL;
import java.time.LocalDate;

import static project.kolesnikova.converter.config.Setting.getUrlForeignCurrencyMarket;

//http://www.cbr.ru/development/SXML/


public class ParseCbr implements Parsing{

    public static final String MESSAGE = "Ошибка парсинга данных";

    static URL url = getUrlForeignCurrencyMarket(LocalDate.now());

    public  ValCurs parser() {
        ObjectMapper objectMapper = new XmlMapper();
        try {
            return objectMapper.readValue(url, ValCurs.class);
        } catch (IOException e) {
            throw new AppException(MESSAGE, e);
        }
    }



}

