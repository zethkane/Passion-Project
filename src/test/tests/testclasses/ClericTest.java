package testclasses;

import classes.Cleric;
import classes.Mage;
import org.junit.Assert;
import org.junit.Test;

import java.util.Map;
import java.util.TreeMap;

public class ClericTest {
    @Test
    public void testClass(){
        Cleric cleric = new Cleric();
        Map<String , Integer> testStats = new TreeMap<>();
        testStats.put("Strength", 7);
        testStats.put("Charisma", 10);
        testStats.put("Intelligence", 5);
        testStats.put("Dexterity", 4);
        testStats.put("Wisdom", 10);
        testStats.put("Current HP",15);
        testStats.put("Level", 1);
        testStats.put("Current XP", 0);

        Map actual = cleric.getStats();
        Map expected = testStats;

        Assert.assertEquals(actual , expected);



    }

    @Test
    public void testLevelUp(){
       Cleric cleric = new Cleric();
        cleric.setCurretXp(55);
        cleric.levelUp();
        Integer xpExpected = 5;
        Integer levelExpected = 2;
        Integer expectedXpToLevel = 75;
        Map<String , Integer> testStats = new TreeMap<>();
        testStats.put("Strength", 9);
        testStats.put("Charisma", 12);
        testStats.put("Intelligence", 6);
        testStats.put("Dexterity", 5);
        testStats.put("Wisdom", 12);
        testStats.put("Current HP",18);
        testStats.put("Level", 2);
        testStats.put("Current XP", 5);

        Assert.assertEquals(cleric.getCurretXp(), xpExpected);
        Assert.assertEquals(cleric.getLevel(),levelExpected);
        Assert.assertEquals(cleric.getXpToNextLevel(), expectedXpToLevel);
        Assert.assertEquals(cleric.getStats(), testStats );
    }
}
