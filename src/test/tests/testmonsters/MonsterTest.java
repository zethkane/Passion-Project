package testmonsters;

import monsters.Monster;
import org.junit.Assert;
import org.junit.Test;

public class MonsterTest {

    @Test
    public void testHP(){
        Monster monster = new Monster(14, "Dracula");
        Integer expected = 14 * 10;
        Integer actual = monster.getHp();

        Assert.assertEquals(expected, actual);
    }

    @Test
    public void testName(){
        Monster monster = new Monster(14, "Dracula");
        String expected = "Dracula";
        String actual = monster.getName();

        Assert.assertEquals(expected, actual);
    }
}
