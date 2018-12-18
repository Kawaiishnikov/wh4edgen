package model.characterSheet;

import java.util.List;

public class Character {
    public String name;
    public String species;
    public String charClass;
    public String career;
    public int careerLevel;
    public String careerPath;
    public String status;
    public int age;
    public int height;
    public String hairColour;
    public String eyeColour;
    public int fatePoints;
    public int fortunePoints;
    public int resilencePoints;
    public int resolvePoints;
    public int currentExperiencePoints;
    public int spentExperiencePoints;
    public int totalExperiencePoints;
    public List<Spell> spells;
    public List<Characteristics> characteristics;
    public List<Skill> skills;
    public List<Trapping> trappings;
    public List<Armour> armour;
    public List<Weapon> weapons;


    public Character(String name, String species, String charClass, String career, int careerLevel, String careerPath, String status,
                     int age, int height, String hairColour, String eyeColour, List<Characteristics> characteristics, List<Skill> skills,
                     List<Trapping> trappings, List<Armour> armour, List<Weapon> weapons, int fatePoints, int fortunePoints, int resilencePoints,
                     int resolvePoints, int currentExperiencePoints, int spentExperiencePoints, int totalExperiencePoints, List<Spell> spells) {
        this.name = name;
        this.species = species;
        this.charClass = charClass;
        this.career = career;
        this.careerLevel = careerLevel;
        this.careerPath = careerPath;
        this.status = status;
        this.age = age;
        this.height = height;
        this.hairColour = hairColour;
        this.eyeColour = eyeColour;
        this.characteristics = characteristics;
        this.skills = skills;
        this.trappings = trappings;
        this.armour = armour;
        this.weapons = weapons;
        this.fatePoints = fatePoints;
        this.fortunePoints = fortunePoints;
        this.resilencePoints = resilencePoints;
        this.resolvePoints = resolvePoints;
        this.currentExperiencePoints = currentExperiencePoints;
        this.spentExperiencePoints = spentExperiencePoints;
        this.totalExperiencePoints = totalExperiencePoints;
        this.spells = spells;
    }
}
