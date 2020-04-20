package classes;

import java.util.ArrayList;

public class Mage extends ClassType {
    private Integer str = 4;
    private Integer charisma = 7;
    private Integer intelligence = 10;
    private Integer dexterity = 5;
    private Integer wisdom = 10;
    private ArrayList<Integer> stats = new ArrayList<>();

    public Mage() {
    }

    public ArrayList<Integer> getStats(){
        stats.add(str);
        stats.add(charisma);
        stats.add(intelligence);
        stats.add(dexterity);
        stats.add(wisdom);
        return stats;
    }
}

