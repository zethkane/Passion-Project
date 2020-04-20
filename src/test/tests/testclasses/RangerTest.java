package testclasses;

import classes.Ranger;
import classes.Warrior;
import org.junit.Assert;
import org.junit.Test;

import java.util.Map;
import java.util.TreeMap;

public class RangerTest {
    @Test
    public void testClass(){
        Ranger ranger = new Ranger();
        Map<String , Integer> testStats = new TreeMap<>();
        testStats.put("Strength", 7);
        testStats.put("Charisma", 10);
        testStats.put("Intelligence", 4);
        testStats.put("Dexterity", 10);
        testStats.put("Wisdom", 5);
        testStats.put("Current HP",10);
        testStats.put("Level", 1);
        testStats.put("Current XP", 0);

        Map actual = ranger.getStats();
        Map expected = testStats;

        Assert.assertEquals(actual , expected);



    }

    @Test
    public void testLevelUp(){
        Ranger ranger = new Ranger();
        ranger.setCurretXp(55);
        ranger.levelUp();
        Integer xpExpected = 5;
        Integer levelExpected = 2;
        Integer expectedXpToLevel = 75;
        Map<String , Integer> testStats = new TreeMap<>();
        testStats.put("Strength", 9);
        testStats.put("Charisma", 12);
        testStats.put("Intelligence", 5);
        testStats.put("Dexterity", 12);
        testStats.put("Wisdom", 6);
        testStats.put("Current HP",13);
        testStats.put("Level", 2);
        testStats.put("Current XP", 5);

        Assert.assertEquals(ranger.getCurretXp(), xpExpected);
        Assert.assertEquals(ranger.getLevel(),levelExpected);
        Assert.assertEquals(ranger.getXpToNextLevel(), expectedXpToLevel);
        Assert.assertEquals(ranger.getStats(), testStats );
    }
}
