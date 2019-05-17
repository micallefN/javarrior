package projetwarrior;
import java.util.Scanner;

public class Main {

    private static Scanner sc = new Scanner(System.in);

    private static String getString(String string){
        System.out.println(string);
        return sc.nextLine();
    }

    private static int getInt(String string){
        System.out.println(string);
        int integer = sc.nextInt();
        sc.nextLine();
        return integer;
    }

    private static boolean menuOptions(Character player){
        int value = 0;

        while (value < 1 || value >4){
            value = getInt("Que faire? (1: Voir les caracteristiques, 2: modifier les caracterisitques, 3: créer un nouveau personnage, 4: Arreter)");
        }
        if(value == 1){
            player.showStats();
            return menuOptions(player);
        } else if(value == 2){
            setPlayerStats(player);
            return menuOptions(player);
        } else if(value == 4){
            return false;
        } else{
            return true;
        }

    }
    private static boolean setPlayerStats(Character player){
        int value = 0;
        String str;

        while (value < 1 || value >7){
            value = getInt("Que faire? \n (1: Modifier le nom \n 2: modifier l'image \n 3: modifier la vie \n 4: modifier la force \n 5: modifier l'arme/sort \n 6: modifier le bouclier/philtre \n 7: retour au menu)");
        }
        switch (value){
            case 1:
                player.setName(getString("Nouveau nom"));
                System.out.println("Votre nouveau nom est " + player.getName());
                break;
            case 2:
                player.setImage(getString("Nouvelle image"));
                System.out.println("Votre nouvelle image est " + player.getImage());
                break;
            case 3:
                player.setLifeLevel(getInt("Montant de vie"));
                System.out.println("Votre nouvelle vie est " + player.getLifeLevel());
                break;
            case 4:
                player.setStrengthLevel(getInt("Montant de force"));
                System.out.println("Votre nouvelle vie est " + player.getStrengthLevel());
                break;
            case 7:
                return true;
        }
        setPlayerStats(player);
        return true;
    }

    public static void main(String[] args) {

        boolean loop = true;
        int integer;
        String str;
        String name;

        while(loop){

            integer = getInt("Quel type de personnage voulez-vous? (1: guerrier, 2: magicien)");

            name =  getString("Quel est ton nom?");

            Character player;

            if(integer == 1){
                player = new Warrior(name);
                System.out.println("Très bien " + name + " tu es un guerrier!");
            } else if(integer == 2){
                player = new Wizard(name);
                System.out.println("Très bien " + name + " tu es un magicien!");
            } else {
                continue;
            }

            loop = menuOptions(player);
        }

        System.out.println("t'es dehors");

    }
}
