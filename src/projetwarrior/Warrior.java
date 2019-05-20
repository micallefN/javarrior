package projetwarrior;

public class Warrior extends Character {

    private String shield;

    public Warrior(){
        super();
        this.shield = "pas de bouclier";
        this.attackType= "une arme";
        this.defenseType = "un bouclier";
    }
    public Warrior(String name){
        super(name);
        this.shield = "pas de bouclier";
        this.attackType= "une arme";
        this.defenseType = "un bouclier";
    }
    public Warrior(String name, String image, int lifeLevel, int strengthLevel){
        super(name,image,lifeLevel,strengthLevel);
        this.shield = "pas de bouclier";
        this.attackType= "une arme";
        this.defenseType = "un bouclier";
    }

    public String getShield(){
        return this.shield;
    }
    public void setShield(String shield){
        this.shield = shield;
    }

    public void setStrengthLevel(int strengthLevel){
        if(strengthLevel < 5){
            this.strengthLevel = 5;
        } else if(strengthLevel > 10){
            this.strengthLevel = 10;
        } else {
            this.strengthLevel = strengthLevel;
        }
    }

    public void setLifeLevel(int lifeLevel){
        if(lifeLevel < 5){
            this.lifeLevel = 5;
        } else if(lifeLevel > 10){
            this.lifeLevel = 10;
        } else {
            this.lifeLevel = lifeLevel;
        }
    }

    public String toString(){
        String weaponString;
        if(this.getOffensive() != null){
            weaponString = "\nArme : " + this.getOffensive().getName();
        } else {
            weaponString = "\nArme : Pas d'arme";
        }
        return super.toString() + "\nBouclier : " + this.getShield() + weaponString;
    }

}
