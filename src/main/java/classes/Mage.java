package classes;

import java.util.ArrayList;
import java.util.Map;
import java.util.TreeMap;

public class Mage{
    private Integer level = 1;
    private Integer curretXp = 0;
    private Integer xpToNextLevel = 50;
    private Integer currentHp;
    private Integer maxhp = 10;
    private String name;
    private Integer str = 4;
    private Integer charisma = 7;
    private Integer intelligence = 10;
    private Integer dexterity = 5;
    private Integer wisdom = 10;
    private Map<String, Integer> stats = new TreeMap<>();

    public Mage() {
       stats.put("Strength", str);
       stats.put("Charisma", charisma);
       stats.put("Intelligence", intelligence);
       stats.put("Dexterity", dexterity);
       stats.put("Wisdom", wisdom);
       stats.put("Current HP", currentHp);
       stats.put("Level", level);
       stats.put("Current XP", curretXp);

    }

    public Map<String, Integer> getStats() {
        return stats;
    }

    public Integer getLevel() {
        return level;
    }

    public void setLevel(Integer level) {
        this.level = level;
    }

    public Integer getCurretXp() {
        return curretXp;
    }

    public void setCurretXp(Integer curretXp) {
        this.curretXp = curretXp;
    }

    public Integer getXpToNextLevel() {
        return xpToNextLevel;
    }

    public void setXpToNextLevel(Integer xpToNextLevel) {
        this.xpToNextLevel = xpToNextLevel;
    }

    public Integer getCurrentHp() {
        return currentHp;
    }

    public void setCurrentHp(Integer currentHp) {
        this.currentHp = currentHp;
    }

    public Integer getMaxhp() {
        return maxhp;
    }

    public void setMaxhp(Integer maxhp) {
        this.maxhp = maxhp;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getStr() {
        return str;
    }

    public void setStr(Integer str) {
        this.str = str;
    }

    public Integer getCharisma() {
        return charisma;
    }

    public void setCharisma(Integer charisma) {
        this.charisma = charisma;
    }

    public Integer getIntelligence() {
        return intelligence;
    }

    public void setIntelligence(Integer intelligence) {
        this.intelligence = intelligence;
    }

    public Integer getDexterity() {
        return dexterity;
    }

    public void setDexterity(Integer dexterity) {
        this.dexterity = dexterity;
    }

    public Integer getWisdom() {
        return wisdom;
    }

    public void setWisdom(Integer wisdom) {
        this.wisdom = wisdom;
    }
}

