package character;

import classes.ClassType;

import java.util.ArrayList;

public class Character {

    private Integer level = 1;
    private Integer curretXp = 0;
    private Integer xpToNextLevel = 50;
    private Integer currentHp;
    private Integer maxhp = 10;
    private String name;
    private Integer str;
    private Integer charisma;
    private Integer intelligence;
    private Integer dexterity;
    private Integer wisdom;
    private ArrayList<Integer> stats = new ArrayList<>();

    public Character(ClassType classType) {
        this.str = classType.getStr();
        this.charisma = classType.getCharisma();
        this.intelligence = classType.getIntelligence();
        this.dexterity = classType.getDexterity();
        this.wisdom = classType.getWisdom();
    }

    public ArrayList getStats(){
        stats.add(str);
        stats.add(charisma);
        stats.add(intelligence);
        stats.add(dexterity);
        stats.add(wisdom);
        return stats;
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
