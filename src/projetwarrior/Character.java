package projetwarrior;

import java.util.ArrayList;

/**
 * <b>Character est la classe par défaut pour les personnages</b>
 * <p>Il possède :
 * <ul>
 *     <li>un nom modifiable</li>
 *     <li>une image modifiable</li>
 *     <li>un niveau de vie modifiable</li>
 *     <li>un niveau de force modifiable</li>
 *     <li>un type d'attaque propre à son genre ex: arme, sort</li>
 *     <li>un type de défense propre à son genre ex: philtre, bouclier</li>
 *     <li>une arme / sort qui peut être null</li>
 *     <li>une liste d'equipement d'attaque ex: arme, sort, vide par défaut</li>
 * </ul>
 * </p>
 *
 * @see Offensive
 */
abstract class Character {
    /**
     * Le nom du personnage
     *
     * @see Character#getName()
     * @see Character#setName(String)
     */
    protected String name;

    /**
     * l'image du personnage
     *
     * @see Character#getImage()
     * @see Character#setImage(String)
     */
    protected String image;

    /**
     * la vie du personnage
     *
     * @see Character#getLifeLevel()
     * @see Character#setLifeLevel(int)
     */
    protected int lifeLevel;

    /**
     * la force du personnage
     *
     * @see Character#getStrengthLevel()
     * @see Character#setStrengthLevel(int)
     */
    protected int strengthLevel;

    /**
     * Le type d'attaque du personnage
     *
     * @see Character#getAttackType()
     * @see Character#setAttackType(String)
     */
    protected String attackType;

    /**
     * le type de défense du personnage
     *
     * @see Character#getDefenseType()
     * @see Character#setDefenseType(String)
     */
    protected String defenseType;

    /**
     * l'arme / sort équipé du personnage
     *
     * @see Offensive
     *
     * @see Character#getOffensive()
     * @see Character#setOffensive(Offensive)
     */
    protected Offensive offensive;

    /**
     * la liste des armes / sort du personnage
     *
     * @see Offensive
     *
     * @see Character#getOffensives()
     * @see Character#setOffensives(ArrayList)
     * @see Character#addOffensive(Offensive)
     * @see Character#removeOffensive(int)
     */
    protected ArrayList<Offensive> offensives = new ArrayList<>();

    /**
     * <b>Constructeur par défaut du personnage</b>
     *
     * @see Offensive
     *
     * @see Character#name
     * @see Character#image
     * @see Character#lifeLevel
     * @see Character#strengthLevel
     * @see Character#offensive
     */
    public Character(){
        this.name = "no name";
        this.image = "no image";
        this.lifeLevel = 0;
        this.strengthLevel = 0;
        this.offensive = null;
    }

    /**
     * <b>Constructeur par nom du personnage</b>
     *
     * @see Offensive
     *
     * @see Character#name
     * @see Character#image
     * @see Character#lifeLevel
     * @see Character#strengthLevel
     * @see Character#offensive
     */
    public Character(String name){
        this.name = name;
        this.image = "no image";
        this.lifeLevel = 0;
        this.strengthLevel = 0;
        this.offensive = null;
    }

    /**
     * <b>Constructeur complet du personnage</b>
     *
     * @see Offensive
     *
     * @see Character#name
     * @see Character#image
     * @see Character#lifeLevel
     * @see Character#strengthLevel
     * @see Character#offensive
     */
    public Character(String name, String image, int lifeLevel, int strengthLevel){
        this.name = name;
        this.image = image;
        this.lifeLevel = lifeLevel;
        this.strengthLevel = strengthLevel;
        this.offensive = null;
    }

    /**
     * Retourne le nom du personnage
     *
     * @return un string
     */
    public String getName(){
        return this.name;
    }

    /**
     * met à jour le nom du personnage
     *
     * @param name
     *              le nouveau nom du personnage
     */
    public void setName(String name){
        this.name = name;
    }

    /**
     * Retourne l'image du personnage
     *
     * @return un string
     */
    public String getImage(){
        return this.image;
    }

    /**
     * met à jour l'image du personnage
     *
     * @param image
     *              la nouvelle image du personnage
     */
    public void setImage(String image){
        this.image = image;
    }

    /**
     * retourne la vie du personnage
     *
     * @return un entier
     */
    public int getLifeLevel(){
        return this.lifeLevel;
    }

    /**
     * met à jour la vie du personnage
     *
     * @param lifeLevel
     *              La nouvelle vie du perosnnage
     */
    public void setLifeLevel(int lifeLevel){
        this.lifeLevel = lifeLevel;
    }

    /**
     * retourne la force du personnage
     *
     * @return un entier
     */
    public int getStrengthLevel(){
        return this.strengthLevel;
    }

    /**
     * met à jour la force du personnage
     *
     * @param strengthLevel
     *              la nouvelle force du personnage
     */
    public void setStrengthLevel(int strengthLevel){
        this.strengthLevel = strengthLevel;
    }

    /**
     * reoturne le type d'attaque du personnage
     *
     * @return un string
     */
    public String getAttackType() {
        return this.attackType;
    }

    /**
     * met à jour le type d'attaque du personnage
     *
     * @param attackType
     *              le nouveau type d'attaque
     */
    public void setAttackType(String attackType) {
        this.attackType = attackType;
    }

    /**
     * retourne le type de défense du personnnage
     *
     * @return un string
     */
    public String getDefenseType() {
        return this.defenseType;
    }

    /**
     * met à jour le type de défense du personnage
     *
     * @param defenseType
     *              le nouveau type de défense
     */
    public void setDefenseType(String defenseType) {
        this.defenseType = defenseType;
    }

    /**
     * retourne l'arme / sort du personnage
     *
     * @see Offensive
     *
     * @return un objet offensive
     */
    public Offensive getOffensive() {
        return this.offensive;
    }

    /**
     * modifie l'arme / le sort du personnage
     *
     * @see Offensive
     *
     * @param offensive
     *              la nouvelle arme / sort
     */
    public void setOffensive(Offensive offensive) {
        this.offensive = offensive;
    }

    /**
     * retourne la liste d'arme / sort du personnage
     *
     * @see Offensive
     *
     * @return un arraylist
     */
    public ArrayList<Offensive> getOffensives() {
        return this.offensives;
    }

    /**
     * remplace la liste des armes / sort
     *
     * @see Offensive
     *
     * @param offensives
     *              une liste d'arme / sort
     */
    public void setOffensives(ArrayList<Offensive> offensives) {
        this.offensives = offensives;
    }

    /**
     * ajoute une arme / sort à la liste
     *
     * @see Offensive
     *
     * @param offensive
     *              une arme / sort
     */
    public void addOffensive(Offensive offensive){
        this.offensives.add(offensive);
    }

    /**
     * enleve une arme / sort de la liste
     *
     * @param index
     *              l'index de l'objet dans la liste
     */
    public void removeOffensive(int index){
        this.offensives.remove(index);
    }

    /**
     * renvoi le detail du personnage
     *
     * @return un string
     */
    public String toString(){
        return "nom : " + this.getName() + "\nimage: " + this.getImage() + "\nvie : " + this.getLifeLevel() + "\nforce : " + this.getStrengthLevel();
    }

    abstract Offensive createOffensive();

}
