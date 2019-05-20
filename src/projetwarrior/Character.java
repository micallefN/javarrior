package projetwarrior;

import java.util.ArrayList;

public class Character {
    protected String name;
    protected String image;
    protected int lifeLevel;
    protected int strengthLevel;
    protected String attackType;
    protected WeaponSpell weaponSpell;
    protected ArrayList<WeaponSpell> weaponSpells = new ArrayList<WeaponSpell>();

    public Character(){
        this.name = "no name";
        this.image = "no image";
        this.lifeLevel = 0;
        this.strengthLevel = 0;
        this.weaponSpell = null;
    }

    public Character(String name){
        this.name = name;
        this.image = "no image";
        this.lifeLevel = 0;
        this.strengthLevel = 0;
        this.weaponSpell = null;
    }

    public Character(String name, String image, int lifeLevel, int strengthLevel){
        this.name = name;
        this.image = image;
        this.lifeLevel = lifeLevel;
        this.strengthLevel = strengthLevel;
        this.weaponSpell = null;
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

    public String getAttackType() {
        return this.attackType;
    }
    public void setAttackType(String attackType) {
        this.attackType = attackType;
    }

    public WeaponSpell getWeaponSpell() {
        return weaponSpell;
    }

    public void setWeaponSpell(WeaponSpell weaponSpell) {
        this.weaponSpell = weaponSpell;
    }

    public ArrayList<WeaponSpell> getWeaponSpells() {
        return weaponSpells;
    }
    public void setWeaponSpells(ArrayList<WeaponSpell> weaponSpells) {
        this.weaponSpells = weaponSpells;
    }
    public void addWeaponSpell(WeaponSpell weaponSpell){
        this.weaponSpells.add(weaponSpell);
    }
    public void removeWeaponSpell(int index){
        this.weaponSpells.remove(index);
    }

    public String toString(){
        return "nom : " + this.getName() + "\nimage: " + this.getImage() + "\nvie : " + this.getLifeLevel() + "\nforce : " + this.getStrengthLevel();
    }
}
