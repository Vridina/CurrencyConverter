package project.kolesnikova.converter.entities;

import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlElementWrapper;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlRootElement;
import lombok.*;
import project.kolesnikova.converter.entities.valute.Valute;

import java.io.Serializable;
import java.util.Set;


@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JacksonXmlRootElement(localName = "ValCurs")
public class ValCurs implements Serializable {


    @JacksonXmlProperty(isAttribute = true, localName = "Date")
    String date;

    @JacksonXmlProperty(isAttribute = true)
    String name;

    @JacksonXmlProperty(localName = "Valute" )
    @JacksonXmlElementWrapper(useWrapping = false)
    Set<Valute> valute;

    @Override
    public String toString() {
        return "ValCurs{" +
                "date='" + date + '\'' +
                ", name='" + name + '\'' +
                ", valute=\n" + valute +
                "}";
    }
}
