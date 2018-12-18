package model.characterSheet;

public class Skill {
    public String name;
    public String characteristicName;
    public int characteristicValue;
    public int advance;
    public int totalSkill;

    public Skill(String name, String characteristicName, int characteristicValue, int advance, int totalSkill) {
        this.name = name;
        this.characteristicName = characteristicName;
        this.characteristicValue = characteristicValue;
        this.advance = advance;
        this.totalSkill = totalSkill;
    }
}
