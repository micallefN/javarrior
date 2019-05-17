package projetwarrior;

public class Character {
    protected String name;
    protected String image;
    protected int lifeLevel;
    protected int strengthLevel;

    public Character(){
        this.name = "no name";
        this.image = "no image";
        this.lifeLevel = 0;
        this.strengthLevel = 0;
    }

    public Character(String name){
        this.name = name;
        this.image = "no image";
        this.lifeLevel = 0;
        this.strengthLevel = 0;
    }

    public Character(String name, String image, int lifeLevel, int strengthLevel){
        this.name = name;
        this.image = image;
        this.lifeLevel = lifeLevel;
        this.strengthLevel = strengthLevel;
    }

    public String getName(){
        return this.name;
    }
    public void setName(String name){
        this.name = name;
    }

    public String getImage(){
        return this.image;
    }
    public void setImage(String image){
        this.image = image;
    }

    public int getLifeLevel(){
        return this.lifeLevel;
    }
    public void setLifeLevel(int lifeLevel){
        this.lifeLevel = lifeLevel;
    }

    public int getStrengthLevel(){
        return this.strengthLevel;
    }
    public void setStrengthLevel(int strengthLevel){
        this.strengthLevel = strengthLevel;
    }

    public void showStats(){
        System.out.println("nom : " + this.name);
        System.out.println("image : " + this.image);
        System.out.println("vie : " + this.lifeLevel);
        System.out.println("force : " + this.strengthLevel);
    }
}
