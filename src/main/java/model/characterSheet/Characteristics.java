package model.characterSheet;

public class Characteristics {
    public String name;
    public String shortName;
    public int initialValue;
    public int advances;
    public int currentValue;

    public Characteristics(String name, String shortName, int initialValue, int advances, int currentValue) {
        this.name = name;
        this.shortName = shortName;
        this.initialValue = initialValue;
        this.advances = advances;
        this.currentValue = currentValue;
    }
}
