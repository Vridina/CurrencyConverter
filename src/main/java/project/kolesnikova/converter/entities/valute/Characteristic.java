package project.kolesnikova.converter.entities.valute;

import java.util.HashMap;
import java.util.Map;

public class Characteristic {

    String icon;

    String charCode;


    Map<String, String> icons = Map.ofEntries(
            Map.entry("RUB", " ₽"),
            Map.entry("NOK", "🛹"),
            Map.entry("NOK", "")
    );


    public Characteristic(String icon, String charCode) {
        this.icon = icon;
        this.charCode = charCode;
    }

    String getIcon(Valute v) {

        return icon;
    }


}
