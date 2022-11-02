package project.kolesnikova.converter.services;

import project.kolesnikova.converter.entities.ValCurs;
import project.kolesnikova.converter.entities.valute.Valute;

import java.util.Set;


public class RubleExchange
        implements Exchange {

    ValCurs valCurs;


    public static Valute findValute(ValCurs valCurs, String charCode) {
        Valute valute = null;
        Set<Valute> valuteSet = valCurs.getValute();
        for (Valute v : valuteSet) {
            if (v.getCharCode().equalsIgnoreCase(charCode)) {
                valute = v;
            }
        }
        return valute;
    }

    public static double getValueChange(Valute valute, int n) {
        String s = valute.getValue().replace(',', '.');
        double value = Double.parseDouble(s);
        return value * n * valute.getNominal();
    }


//    public static double getValueChange(String charCode, int n) {
//        String s = valute.getValue().replace(',', '.');
//        double value = Double.parseDouble(s);
//        return value * n * valute.getNominal();
//    }


//    public static double getValueChange(String valute, int n) {
//        for (Valute v : valuteSet) {
//            if (v.getCharCode().equalsIgnoreCase(charCode)) {
//                valute = v;
//            }
//        }
//        String s = valute.getValue().replace(',', '.');
//        double value = Double.parseDouble(s);
//        return value * n * valute.getNominal();
//    }


}
//        ParseCbr parseCbr = new ParseCbr();
//        URL urlForeignCurrencyMarket = getUrlForeignCurrencyMarket(LocalDate.now());
//        System.out.println(urlForeignCurrencyMarket);
//        ValCurs valCurs = parsing(urlForeignCurrencyMarket);