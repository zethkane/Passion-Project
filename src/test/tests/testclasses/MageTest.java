package testclasses;

import classes.Mage;
import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;
import java.util.Map;
import java.util.TreeMap;

public class MageTest {



    @After


    @Test
    public void testClass(){
        Mage mage = new Mage();
        Map<String , Integer> testStats = new TreeMap<>();
        testStats.put("Strength", 4);
        testStats.put("Charisma", 7);
        testStats.put("Intelligence", 10);
        testStats.put("Dexterity", 5);
        testStats.put("Wisdom", 10);
        testStats.put("Current HP",10);
        testStats.put("Level", 1);
        testStats.put("Current XP", 0);

        Map actual = mage.getStats();
        Map expected = testStats;

        Assert.assertEquals(actual , expected);



    }

    @Test
    public void testLevelUp(){
        Mage mage = new Mage();
        mage.setCurretXp(55);
        mage.levelUp();
        Integer xpExpected = 5;
        Integer levelExpected = 2;
        Integer expectedXpToLevel = 75;
        Map<String , Integer> testStats = new TreeMap<>();
        testStats.put("Strength", 5);
        testStats.put("Charisma", 9);
        testStats.put("Intelligence", 12);
        testStats.put("Dexterity", 6);
        testStats.put("Wisdom", 12);
        testStats.put("Current HP",13);
        testStats.put("Level", 2);
        testStats.put("Current XP", 5);

        Assert.assertEquals(mage.getCurretXp(), xpExpected);
        Assert.assertEquals(mage.getLevel(),levelExpected);
        Assert.assertEquals(mage.getXpToNextLevel(), expectedXpToLevel);
        Assert.assertEquals(mage.getStats(), testStats );
    }
}
