package classes;

import java.util.Map;

public class Classes {
    public void levelUp() {
    }

    public void levelUpIncrease() {
    }

    public void updateStats(Map<String, Integer> stats, Integer str, Integer charisma, Integer intelligence, Integer dexterity, Integer wisdom, Integer currentHp, Integer level, Integer curretXp) {
        stats.put("Strength", str);
        stats.put("Charisma", charisma);
        stats.put("Intelligence", intelligence);
        stats.put("Dexterity", dexterity);
        stats.put("Wisdom", wisdom);
        stats.put("Current HP", currentHp);
        stats.put("Level", level);
        stats.put("Current XP", curretXp);
    }

}

