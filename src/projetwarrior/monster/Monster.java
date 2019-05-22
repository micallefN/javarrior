package projetwarrior.monster;
import projetwarrior.Character;

public abstract class Monster {
    protected int life;
    protected int strength;
    protected int hitChance;

    protected String name;

    public Monster(){
        this.name = "";
        this.life = 0;
        this.strength = 0;
        this.hitChance = 0;
    }

    public void setLife(int life) {
        this.life = life;
    }

    public void setStrength(int strength) {
        this.strength = strength;
    }

    public void setHitChance(int hitChance) {
        this.hitChance = hitChance;
    }

    public int getLife() {

        return life;
    }

    public int getStrength() {
        return strength;
    }

    public int getHitChance() {
        return hitChance;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void attack(Character character){
        character.setLifeLevel(character.getLifeLevel() - this.strength);
    }
}
