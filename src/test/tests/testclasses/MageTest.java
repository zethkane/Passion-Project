package testclasses;

import classes.Mage;
import org.junit.Assert;
import org.junit.Test;

import java.util.ArrayList;
import java.util.Map;
import java.util.TreeMap;

public class MageTest {

    @Test
    public void testClass(){
        Mage mage = new Mage();
        Map<String , Integer> testStats = new TreeMap<>();
        testStats.put("Strength", 4);
        testStats.put("Charisma", 7);
        testStats.put("Intelligence", 10);
        testStats.put("Dexterity", 5);
        testStats.put("Wisdom", 10);
        testStats.put("Current HP", 10);
        testStats.put("Level", 1);
        testStats.put("Current XP", 0);

        Map actual = mage.getStats();
        Map expected = testStats;

        Assert.assertEquals(actual , expected);



    }
}
