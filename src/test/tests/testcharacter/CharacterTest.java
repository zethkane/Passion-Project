package testcharacter;

import character.Character;
import classes.ClassType;
import classes.Mage;
import org.junit.Assert;
import org.junit.Test;

import java.util.ArrayList;

public class CharacterTest {

    @Test
    public void testClass(){
        Mage mage = new Mage();
        Character character = new Character(mage);

        ArrayList expected = mage.getStats();
        ArrayList actual = character.getStats();

        Assert.assertEquals(expected,actual);
    }
}
