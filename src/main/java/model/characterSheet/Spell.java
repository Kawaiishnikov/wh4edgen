package model.characterSheet;

public class Spell {
    public String name;
    public int totalCost;
    public int range;
    public int target;
    public int duration;
    public String effect;

    public Spell(String name, int totalCost, int range, int target, int duration, String effect) {
        this.name = name;
        this.totalCost = totalCost;
        this.range = range;
        this.target = target;
        this.duration = duration;
        this.effect = effect;
    }
}
