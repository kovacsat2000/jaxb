package legoset;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.xml.bind.annotation.*;

@XmlRootElement
@XmlAccessorType(XmlAccessType.FIELD)
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Weight {

    /*@XmlValue
    private double value = 0.89;

    @XmlAttribute
    private String unit = "kg";*/

    @XmlValue
    private double value;

    @XmlAttribute
    private String unit;

}
