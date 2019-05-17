package projetwarrior;

public class Warrior extends Character {

    private String shield;
    private Weapon weapon;

    public Warrior(){
        super();
        this.shield = "pas de bouclier";
        this.weapon = null;
    }
    public Warrior(String name){
        super(name);
        this.shield = "pas de bouclier";
        this.weapon = null;
    }
    public Warrior(String name, String image, int lifeLevel, int strengthLevel){
        super(name,image,lifeLevel,strengthLevel);
        this.shield = "pas de bouclier";
        this.weapon = null;
    }

    public String getShield(){
        return this.shield;
    }
    public void setShield(String shield){
        this.shield = shield;
    }

    public Weapon getWeapon(){
        return this.weapon;
    }
    public void setWeapon(Weapon weapon){
        this.weapon = weapon;
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

    public void showStats(){
        System.out.println("nom : " + this.name);
        System.out.println("image : " + this.image);
        System.out.println("vie : " + this.lifeLevel);
        System.out.println("force : " + this.strengthLevel);
        System.out.println("Bouclier : " + this.shield);
        System.out.println("Arme : " + this.weapon);
    }
}
