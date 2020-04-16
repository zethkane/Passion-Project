package monsters;

import java.util.Random;

public class Monster {
    private String name;
    private Integer maxHp;
    private Integer level;
    private Integer maxDamage;
    private Integer currentHp;

    Random random = new Random();

    public Monster(Integer level, String name){
        this.maxHp = 3 * level;
        this.level = level;
        this.name = name;
        this.maxDamage = level / 2;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getHp() {
        return maxHp;
    }

    public String getName(){
        return name;
    }

    public Integer getLevel() {
        return level;
    }

    public void setLevel(Integer level) {
        this.level = level;
    }

    public Integer getMaxDamage(){
        return this.maxDamage;
    }

    public void setCurrentHp(Integer damageTaken){
        if (maxHp.equals(currentHp)){
            this.currentHp = maxHp - damageTaken;
        } else {
            currentHp = currentHp -damageTaken;
        }
    }

    public Integer damageDealt(){
       return random.nextInt(maxDamage);
    }
}
