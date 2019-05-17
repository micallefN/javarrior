package projetwarrior;

public class Wizard extends Character {

    private String philter;
    private Spell spell;

    public Wizard(){
        super();
        this.philter = "pas de philtre";
        this.spell = null;
    }
    public Wizard(String name){
        super(name);
        this.philter = "pas de philtre";
        this.spell = null;
    }
    public Wizard(String name, String image, int lifeLevel, int strengthLevel){
        super(name,image,lifeLevel,strengthLevel);
        this.philter = "pas de philtre";
        this.spell = null;
    }

    public String getPhilter(){
        return this.philter;
    }
    public void setPhilter(String philter){
        this.philter = philter;
    }

    public Spell getSpell(){
        return this.spell;
    }
    public void setSpell(Spell spell){
        this.spell = spell;
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

    public void showStats(){
        System.out.println("nom : " + this.name);
        System.out.println("image : " + this.image);
        System.out.println("vie : " + this.lifeLevel);
        System.out.println("force : " + this.strengthLevel);
        System.out.println("Philtre : " + this.philter);
        System.out.println("Sort : " + this.spell);
    }
}
