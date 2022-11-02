package project.kolesnikova.converter.app;

import project.kolesnikova.converter.entities.ValCurs;
import project.kolesnikova.converter.exception.AppException;
import project.kolesnikova.converter.parser.ParseCbr;

public class App {

    void start(String[] args) {
        try {
            ParseCbr parsing = new ParseCbr();
            ValCurs valCurs = parsing.parser();

        } catch (AppException e) {



        }
    }


}



