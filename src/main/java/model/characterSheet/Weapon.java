package model.characterSheet;

import java.util.List;

public class Weapon {
    public String name;
    public String group;
    public int encumberance;
    public int range;
    public int damage;
    public List<String> qualities;

    public Weapon(String name, String group, int encumberance, int range, int damage, List<String> qualities) {
        this.name = name;
        this.group = group;
        this.encumberance = encumberance;
        this.range = range;
        this.damage = damage;
        this.qualities = qualities;
    }
}
