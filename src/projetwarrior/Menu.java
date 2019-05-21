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

    public Character[] menuOptions(Character[] charactersList, Character player){
        int value = 0;

        while (value < 1 || value >4){
            value = getInt("\nQue faire? \n1: Voir les caracteristiques \n2: modifier les caracterisitques \n3: Supprimer \n4: Retour");
        }
        if(value == 1){
            System.out.println(player); // appel la fonction toString
            charactersList = menuOptions(charactersList, player);
        } else if(value == 2){
            setPlayerStats(player);
            charactersList = menuOptions(charactersList, player);
        } else if(value == 3){
            charactersList = removeCharacter(charactersList, player);
        }

        return charactersList;
    }
    public void createOffensive(Character player){
        String name = getString("nom ?");
        int power = getInt("Puissance ?");
        Offensive offensive = player.createOffensive();
        offensive.setAttackLevel(power);
        offensive.setName(name);
        player.setOffensive(offensive);
        player.addOffensive(offensive);
    }
    public void equipOffensive(Character player){
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
    public void deleteOffensive(Character player){
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
            value = getInt("Que faire? \n 1: Créer et équiper " + player.getAttackType() + " \n 2: Equiper  " + player.getAttackType() + " \n 3: Supprimer " + player.getAttackType() + " \n 4: retour \n");
        }
        switch (value){
            case 1:
                createOffensive(player);
                break;
            case 2:
                equipOffensive(player);
                break;
            case 3:
                deleteOffensive(player);
                break;
            case 4:
                return ;
        }
        attackOptions(player);
    }

    public void setPlayerStats(Character player){
        int value = 0;

        while (value < 1 || value >7){
            value = getInt("\n Que faire? \n1: Modifier le nom \n 2: modifier l'image \n 3: modifier la vie \n 4: modifier la force \n 5: modifier " + player.getAttackType() +  " \n 6: modifier " + player.getDefenseType() + " \n 7: retour au menu");
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
    public Character createCharacter() throws checkPdvException{
        int type = getInt("Quel type de personnage voulez-vous? \n1: guerrier \n2: magicien");
        String name= getString("Quel est son nom?");
        String image= getString("Quel est son image?");
        int life = getInt("Combien de points de vie?");
        if(life < 0){
            throw new checkPdvException(life);
        } else {
            life = 0;
        }
        int strength = getInt("Combien de point de force?");

        Character character;

        if(type == 1){
            character = new Warrior(name, image, life, strength);
            System.out.println("Très bien " + name + " tu es un guerrier!");
        } else{
            character = new Wizard(name, image, life, strength);
            System.out.println("Très bien " + name + " tu es un magicien!");
        }
        return character;
    }
    public void showCharacters(Character[] charactersList){

        String characterClass;

        for(int i = 0; i < charactersList.length; i++){
            if(charactersList[i] != null){
                if(charactersList[i] instanceof Warrior){
                    characterClass = "Guerrier - ";
                } else {
                    characterClass = "Magicien - ";
                }
                System.out.println(charactersList[i].getId() + " : " + characterClass + charactersList[i].getName());
            } else {
                System.out.println(i + " : slot disponible");
            }
        }
    }

    public Character[] removeCharacter(Character[] charactersList, Character character){
        charactersList[character.getId()] = null;
        return charactersList;
    }
}
