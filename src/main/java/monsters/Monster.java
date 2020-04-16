package monsters;

public class Monster {
    private Integer hp;
    private Integer level;

    public Monster(Integer level){
        this.hp = 10 * level;
        this.level = level;
    }

    public Integer getHp() {
        return hp;
    }


    public Integer getLevel() {
        return level;
    }

    public void setLevel(Integer level) {
        this.level = level;
    }
}
