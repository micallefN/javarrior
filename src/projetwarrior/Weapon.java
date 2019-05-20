package projetwarrior;

/**
 * <b>Weapon est une classe pour les armes et herite de Offensive</b>
 * <p>elle possède un nom et une puissance</p>
 *
 * @see Offensive
 */
public class Weapon extends Offensive{

    /**
     * constructeur par defaut
     */
    public Weapon(){
        super();
    }

    /**
     * constructeur complet weapon
     *
     * @param name
     *              le nom de l'arme
     * @param attackLevel
     *              la force de l'arme
     */
    public Weapon(String name, int attackLevel){
        super(name, attackLevel);
    }
}
