package projetwarrior;

public class WeaponSpell {
    private String name;
    private int attackLevel;

    public WeaponSpell(){
        this.name = "pas de nom";
        this.attackLevel = 0;
    }

    public WeaponSpell(String name, int attackLevel){
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
