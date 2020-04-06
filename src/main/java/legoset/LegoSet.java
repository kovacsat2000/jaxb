package legoset;

import album.Track;
import lombok.Data;
import movie.YearAdapter;

import javax.xml.bind.annotation.*;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementWrapper;
import java.time.Year;
import java.util.List;
import java.util.Set;

@XmlRootElement
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(propOrder = {"name", "theme", "subtheme", "year", "pieces", "tags", "minifigs", "weight", "url"})
@Data
public class LegoSet {

    private String name;
    private String theme;
    private String subtheme;
    @XmlJavaTypeAdapter(YearAdapter.class)
    private Year year;
    private int pieces;

    @XmlAttribute
    private String number;

    @XmlElementWrapper(name = "tags")
    @XmlElement(name = "tag")
    private Set<String> tags;

    @XmlElementWrapper(name = "minifigs")
    @XmlElement(name = "minifig")
    private List<Minifig> minifigs;

    private Weight weight;

    private String url;

}
