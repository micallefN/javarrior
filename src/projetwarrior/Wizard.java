package projetwarrior;

public class Wizard extends Character {

    private String philter;

    public Wizard(){
        super();
        this.philter = "pas de philtre";
        this.attackType= "un sort";
        this.defenseType = "un philtre";
    }
    public Wizard(String name){
        super(name);
        this.philter = "pas de philtre";
        this.attackType= "un sort";
        this.defenseType = "un philtre";
    }
    public Wizard(String name, String image, int lifeLevel, int strengthLevel){
        super(name,image,lifeLevel,strengthLevel);
        if(lifeLevel < 3){
            this.lifeLevel = 3;
        } else if(lifeLevel > 6){
            this.lifeLevel = 6;
        } else {
            this.lifeLevel = lifeLevel;
        }
        if(strengthLevel < 8){
            this.strengthLevel = 8;
        } else if(strengthLevel > 15){
            this.strengthLevel = 15;
        } else {
            this.strengthLevel = strengthLevel;
        }
        this.philter = "pas de philtre";
        this.attackType= "un sort";
        this.defenseType = "un philtre";
    }

    public String getPhilter(){
        return this.philter;
    }
    public void setPhilter(String philter){
        this.philter = philter;
    }

    public void setStrengthLevel(int strengthLevel){
        this.strengthLevel = strengthLevel;

    }
    public void setLifeLevel(int lifeLevel){
        this.lifeLevel = lifeLevel;
    }

    public String toString(){
        String spellString;
        if(this.getOffensive() != null){
            spellString = "\nSort : " + this.getOffensive().getName();
        } else {
            spellString = "\nSort : Pas de sort";
        }
        return super.toString() + "\nPhiltre : " + this.getPhilter() + spellString;
    }

    public Offensive createOffensive(){
        Offensive offensive = new Spell();
        return offensive;
    }
}
