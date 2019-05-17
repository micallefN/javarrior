package projetwarrior;

public class Weapon {
    private String name;
    private int attackLevel;

    public Weapon(){
        this.name = "pas de nom";
        this.attackLevel = 0;
    }

    public Weapon(String name, int attackLevel){
        this.name = name;
        this.attackLevel = attackLevel;
    }

    public int getAttackLevel() {
        return attackLevel;
    }
    public void setAttackLevel(int attackLevel) {
        this.attackLevel = attackLevel;
    }

    public String getName(){
        return this.name;
    }
    public void setName(String name){
        this.name = name;
    }
}
