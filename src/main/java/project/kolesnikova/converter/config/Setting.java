package project.kolesnikova.converter.config;


import project.kolesnikova.converter.entities.valute.Valute;
import project.kolesnikova.converter.exception.AppException;

import java.net.MalformedURLException;
import java.net.URL;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class Setting {

    public static final String URLNotAvailable = "URL недоступен";

    private static final String urlForeignCurrencyMarket = "https://www.cbr.ru/scripts/XML_daily.asp?date_req=";

    private static final String urlForeignCurrencyMarketDynamic = "https://www.cbr.ru/scripts/XML_dynamic.asp?date_req1=";

    //======================== URL =============================


    public static URL getUrlForeignCurrencyMarket(LocalDate localDate) {
        try {
            return new URL( urlForeignCurrencyMarket + localDate.format(DateTimeFormatter.ofPattern("dd/MM/yyyy")));
        } catch (MalformedURLException e) {
            throw new AppException(URLNotAvailable, e);
        }
    }


    public static URL getUrlForeignCurrencyMarketDynamic(Valute valute, LocalDate dateRange1, LocalDate dateRange2) {
        try {
            return new URL(urlForeignCurrencyMarket +
                    dateRange1.format(DateTimeFormatter.ofPattern("dd/MM/yyyy")) +
                    "&date_req2=" +
                    dateRange2.format(DateTimeFormatter.ofPattern("dd/MM/yyyy")) +
                    "&VAL_NM_RQ=" +
                    valute.getId());
        } catch (MalformedURLException e) {
            throw new AppException(URLNotAvailable, e);
        }
    }

    //======================== / URL =============================
}
