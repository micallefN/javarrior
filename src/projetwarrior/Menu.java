package projetwarrior;

import java.util.Scanner;

class Menu {

    private static Scanner sc = new Scanner(System.in);

    public String getString(String string){
        System.out.println(string);
        return sc.nextLine();
    }

    public int getInt(String string){
        System.out.println(string);
        int integer = sc.nextInt();
        sc.nextLine();
        return integer;
    }

    public boolean menuOptions(Character player){
        int value = 0;

        while (value < 1 || value >4){
            value = getInt("Que faire? (1: Voir les caracteristiques, 2: modifier les caracterisitques, 3: créer un nouveau personnage, 4: Arreter)");
        }
        if(value == 1){
            System.out.println(player); // appel la fonction toString
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
    public void createWeaponSpell(Character player){
        String name = getString("nom ?");
        int power = getInt("Puissance ?");
        Offensive offensive = player.createOffensive();
        offensive.setAttackLevel(power);
        offensive.setName(name);
        player.setOffensive(offensive);
        player.addOffensive(offensive);
    }
    public void equipWeaponSpell(Character player){
        int value = -1;
        if(!player.getOffensives().isEmpty()){
            while (value < 0 || value > player.getOffensives().size()) {
                for(int i = 0; i < player.getOffensives().size(); i++){
                    System.out.println(i +  " : " + player.getOffensives().get(i).getName() + " - " + player.getOffensives().get(i).getAttackLevel());
                }
                value = getInt("Choix ? \n");
            }
            player.setOffensive(player.getOffensives().get(value));
            System.out.println("Vous avez équipé " + player.getAttackType());
        } else {
            System.out.println("Aucun objet de ce type dans l'inventaire \n");
        }
    }
    public void deleteWeaponSpell(Character player){
        int value = -1;
        if(!player.getOffensives().isEmpty()){
            while (value < 0 || value > player.getOffensives().size()) {
                for(int i = 0; i < player.getOffensives().size(); i++){
                    System.out.println(i +  " : " + player.getOffensives().get(i).getName() + " - " + player.getOffensives().get(i).getAttackLevel());
                }
                value = getInt("Choix ?");
            }
            if(player.getOffensive().getName() == player.getOffensives().get(value).getName()){
                System.out.println("Impossible de supprimer un objet équipé \n");
            } else {
                player.removeOffensive(value);
            }
        } else {
            System.out.println("Aucun objet de ce type dans l'inventaire \n");
        }
    }

    public void attackOptions(Character player){
        int value = 0;
        while (value < 1 || value >4) {
            value = getInt("Que faire? (\n 1: Créer et équiper " + player.getAttackType() + " \n 2: Equiper  " + player.getAttackType() + " \n 3: Supprimer " + player.getAttackType() + " \n 4: retour \n");
        }
        switch (value){
            case 1:
                createWeaponSpell(player);
                break;
            case 2:
                equipWeaponSpell(player);
                break;
            case 3:
                deleteWeaponSpell(player);
                break;
            case 4:
                return ;
        }
        attackOptions(player);
    }

    public void setPlayerStats(Character player){
        int value = 0;

        while (value < 1 || value >7){
            value = getInt("Que faire? \n (1: Modifier le nom \n 2: modifier l'image \n 3: modifier la vie \n 4: modifier la force \n 5: modifier " + player.getAttackType() +  " \n 6: modifier " + player.getDefenseType() + " \n 7: retour au menu)");
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
            case 5:
                attackOptions(player);
                break;
            case 7:
                return ;
        }
        setPlayerStats(player);
    }
}
