package testmonsters;

import monsters.Chicken;
import org.junit.Assert;
import org.junit.Test;

public class ChickenTest {

    @Test
    public void ChickenDamageTest(){
        Chicken chicken =  new Chicken(2, "Chicken");
       Assert.assertTrue(chicken.damageDealt() <= 1);
    }
}
