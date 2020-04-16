package monsters;

public class Monster {
    private String name;
    private Integer hp;
    private Integer level;

    public Monster(Integer level, String name){
        this.hp = 10 * level;
        this.level = level;
        this.name = name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getHp() {
        return hp;
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
}
