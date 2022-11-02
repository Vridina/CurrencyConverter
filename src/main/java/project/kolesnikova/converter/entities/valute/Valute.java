package project.kolesnikova.converter.entities.valute;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonSubTypes;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlElementWrapper;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlRootElement;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlText;
import lombok.*;


import java.io.Serializable;
import java.util.concurrent.Exchanger;


@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter

@JacksonXmlRootElement(localName = "Valute")
public class Valute
        extends Exchanger
        implements Serializable {

    @JacksonXmlProperty(isAttribute = true, localName = "ID")
    String id;

    @JacksonXmlProperty(localName = "Name")
    String name;

    @JacksonXmlProperty(localName = "CharCode")
    String charCode;

    @JacksonXmlProperty(localName = "NumCode")
    String numCode;

    @JacksonXmlProperty(localName = "Value")
    String value;

    @JacksonXmlProperty(localName = "Nominal")
    int nominal;

    @JsonIgnore
    Characteristic characteristic;

    @Override
    public String toString() {
        return "Valute{" +
                "id='" + id + '\'' +
                ", name='" + name + '\'' +
                ", charCode='" + charCode + '\'' +
                ", numCode='" + numCode + '\'' +
                ", value='" + value + '\'' +
                ", nominal=" + nominal +
                "}\n";
    }



}
