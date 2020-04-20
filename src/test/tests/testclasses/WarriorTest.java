package testclasses;

import classes.Mage;
import classes.Warrior;
import org.junit.Assert;
import org.junit.Test;

import java.util.Map;
import java.util.TreeMap;

public class WarriorTest {


    @Test
    public void testClass(){
        Warrior warrior = new Warrior();
        Map<String , Integer> testStats = new TreeMap<>();
        testStats.put("Strength", 10);
        testStats.put("Charisma", 7);
        testStats.put("Intelligence", 4);
        testStats.put("Dexterity", 10);
        testStats.put("Wisdom", 5);
        testStats.put("Current HP",15);
        testStats.put("Level", 1);
        testStats.put("Current XP", 0);

        Map actual = warrior.getStats();
        Map expected = testStats;

        Assert.assertEquals(actual , expected);



    }

    @Test
    public void testLevelUp(){
        Warrior warrior = new Warrior();
        warrior.setCurretXp(55);
        warrior.levelUp();
        Integer xpExpected = 5;
        Integer levelExpected = 2;
        Integer expectedXpToLevel = 75;
        Map<String , Integer> testStats = new TreeMap<>();
        testStats.put("Strength", 12);
        testStats.put("Charisma", 9);
        testStats.put("Intelligence", 5);
        testStats.put("Dexterity", 12);
        testStats.put("Wisdom", 6);
        testStats.put("Current HP",18);
        testStats.put("Level", 2);
        testStats.put("Current XP", 5);

        Assert.assertEquals(warrior.getCurretXp(), xpExpected);
        Assert.assertEquals(warrior.getLevel(),levelExpected);
        Assert.assertEquals(warrior.getXpToNextLevel(), expectedXpToLevel);
        Assert.assertEquals(warrior.getStats(), testStats );
    }
}
