package projetwarrior;

public class Wizard extends Character {

    private String philter;
    private WeaponSpell weaponSpell;
    private String attackType;

    public Wizard(){
        super();
        this.philter = "pas de philtre";
        this.weaponSpell = null;
        this.attackType= "un sort";
    }
    public Wizard(String name){
        super(name);
        this.philter = "pas de philtre";
        this.weaponSpell = null;
        this.attackType= "un sort";
    }
    public Wizard(String name, String image, int lifeLevel, int strengthLevel){
        super(name,image,lifeLevel,strengthLevel);
        this.philter = "pas de philtre";
        this.weaponSpell = null;
        this.attackType= "un sort";
    }

    public String getPhilter(){
        return this.philter;
    }
    public void setPhilter(String philter){
        this.philter = philter;
    }

    public void setStrengthLevel(int strengthLevel){
        if(strengthLevel < 8){
            this.strengthLevel = 8;
        } else if(strengthLevel > 15){
            this.strengthLevel = 15;
        } else {
            this.strengthLevel = strengthLevel;
        }
    }
    public void setLifeLevel(int lifeLevel){
        if(lifeLevel < 3){
            this.lifeLevel = 3;
        } else if(lifeLevel > 6){
            this.lifeLevel = 6;
        } else {
            this.lifeLevel = lifeLevel;
        }
    }

    public String getAttackType() {
        return this.attackType;
    }
    public void setAttackType(String attackType) {
        this.attackType = attackType;
    }

    public String toString(){
        String spellString;
        if(this.getWeaponSpell() != null){
            spellString = "\nSort : " + this.getWeaponSpell().getName();
        } else {
            spellString = "\nSort : Pas de sort";
        }
        return super.toString() + "\nPhiltre : " + this.getPhilter() + spellString;
    }

}
