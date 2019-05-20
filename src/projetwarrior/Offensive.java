package projetwarrior;

/**
 * <b>Offensive est une classe commune pour les armes et les sorts</b>
 * <p>elle possède un nom et une puissance</p>
 */
abstract class Offensive {
    /**
     * Le nom de l'arme / sort
     *
     * @see Offensive#getName()
     * @see Offensive#setName(String)
     */
    protected String name;

    /**
     * La puissance de l'arme / sort
     *
     * @see Offensive#getAttackLevel()
     * @see Offensive#setAttackLevel(int)
     */
    protected int attackLevel;

    /**
     * Constructeur Offensive
     * <p>constructeur par defaut, l'attaque est fixée à 0 et le nom à 'pas de nom'</p>
     *
     * @see Offensive#name
     * @see Offensive#attackLevel
     */
    public Offensive(){
        this.name = "pas de nom";
        this.attackLevel = 0;
    }

    /**
     * Constructeur Offensive
     * <p>constructeur complet qui prend en paramètre le nom et le niveau de force de l'arme / sort</p>
     *
     * @param name
     *              le nom de l'arme / sort
     * @param attackLevel
     *              la puissance de l'arme / sort
     */
    public Offensive(String name, int attackLevel){
        this.name = name;
        this.attackLevel = attackLevel;
    }

    /**
     * Retourne le niveau d'attaque
     *
     * @return un entier
     */
    public int getAttackLevel() {
        return attackLevel;
    }

    /**
     * met à jour le niveau d'attaque
     *
     * @param attackLevel
     *              le nouveau niveau d'attaque
     */
    public void setAttackLevel(int attackLevel) {
        this.attackLevel = attackLevel;
    }

    /**
     * retourne le nom de l'arme / sort
     *
     * @return un string
     */
    public String getName(){
        return this.name;
    }

    /**
     * met à jour le nom de l'arme / sort
     *
     * @param name
     *              le nouveau nom
     */
    public void setName(String name){
        this.name = name;
    }
}
