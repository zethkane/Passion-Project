package classes;

import java.util.Map;
import java.util.TreeMap;

public class Cleric extends Classes {
    private Integer level = 1;
    private Integer curretXp = 0;
    private Integer xpToNextLevel = 50;
    private Integer currentHp = 15;
    private Integer maxhp = 15;
    private String name;
    private Integer str = 7;
    private Integer charisma = 10;
    private Integer intelligence = 5;
    private Integer dexterity = 4;
    private Integer wisdom = 10;
    private Map<String, Integer> stats = new TreeMap<>();

    public Cleric() {
        stats.put("Strength", str);
        stats.put("Charisma", charisma);
        stats.put("Intelligence", intelligence);
        stats.put("Dexterity", dexterity);
        stats.put("Wisdom", wisdom);
        stats.put("Current HP", currentHp);
        stats.put("Level", level);
        stats.put("Current XP", curretXp);

    }

    public Integer getLevel() {
        return level;
    }

    public Integer getCurretXp() {
        return curretXp;
    }

    public Integer getXpToNextLevel() {
        return xpToNextLevel;
    }

    public Integer getCurrentHp() {
        return currentHp;
    }

    public Integer getMaxhp() {
        return maxhp;
    }

    public String getName() {
        return name;
    }

    public Integer getStr() {
        return str;
    }

    public Integer getCharisma() {
        return charisma;
    }

    public Integer getIntelligence() {
        return intelligence;
    }

    public Integer getDexterity() {
        return dexterity;
    }

    public Integer getWisdom() {
        return wisdom;
    }

    public Map<String, Integer> getStats() {
        return stats;
    }

    public void setCurretXp(Integer curretXp) {
        this.curretXp = curretXp;
    }

    @Override
    public void levelUp() {
        if(this.curretXp > this.xpToNextLevel){
            this.level += 1;
            this.curretXp = curretXp - xpToNextLevel;
            xpToNextLevel += (xpToNextLevel/2);
            levelUpIncrease();

        }
    }
    public void levelUpIncrease(){
        this.maxhp += 3;
        this.currentHp += 3;
        this.intelligence += 1;
        this.wisdom += 2;
        this.str += 2;
        this.charisma += 2;
        this.dexterity += 1;
        updateStats(stats, str, charisma, intelligence, dexterity, wisdom, currentHp, level, curretXp);
    }
}
