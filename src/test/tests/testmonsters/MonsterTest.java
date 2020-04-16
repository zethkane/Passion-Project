package testmonsters;

import monsters.Monster;
import org.junit.Assert;
import org.junit.Test;

public class MonsterTest {

    @Test
    public void testHP(){
        Monster monster = new Monster(14);
        Integer expected = 14 * 10;
        Integer actual = monster.getHp();

        Assert.assertEquals(expected, actual);
    }

}
