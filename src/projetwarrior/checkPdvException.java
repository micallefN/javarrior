package projetwarrior;

public class checkPdvException extends Exception{
    public checkPdvException(int nbr){
        System.out.println("Pas de chiffe négatif comme " + nbr);
    }
}
