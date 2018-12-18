package model.characterSheet;

import java.util.List;

public class Armour {
    public String name;
    public String location;
    public int encumberance;
    public int AP;
    public List<String> qualities;

    public Armour(String name, String location, int encumberance, int AP, List<String> qualities) {
        this.name = name;
        this.location = location;
        this.encumberance = encumberance;
        this.AP = AP;
        this.qualities = qualities;
    }
}
