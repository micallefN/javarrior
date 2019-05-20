package projetwarrior;

/**
 * <b>Spell est une classe pour les sort et herite de Offensive</b>
 * <p>elle possède un nom et une puissance</p>
 *
 * @see Offensive
 */
public class Spell extends Offensive{

    /**
     * constructeur par defaut
     */
    public Spell(){
        super();
    }

    /**
     * constructeur complet spell
     *
     * @param name
     *              le nom de l'arme
     * @param attackLevel
     *              la force de l'arme
     */
    public Spell(String name, int attackLevel){
        super(name, attackLevel);
    }
}
