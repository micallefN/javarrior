package projetwarrior;

// import java.util.ArrayList;

import java.util.ArrayList;

public class Main {

    //private static ArrayList<Character> characters = new ArrayList<>();

    private static Character[] charactersList = new Character[5];

    private static Menu menu = new Menu();

    public static void addCharacter(Character character){
        int i = 0;
        while(i< charactersList.length){
            if(charactersList[i] == null){
                character.setId(i);
                charactersList[i] = character;
                break;
            }
            i++;
        }
    }

    public static void startMenu(){
        int choice = 0;
        while (choice < 1 || choice >4) {
            choice = menu.getInt("\nQue voulez-vous faire? \n1: Créer un personnage\n2: lister les personnages \n3: Choisir un personnage \n4: Arrêter");
        }
        switch (choice){
            case 1:
                try{
                    Character character = menu.createCharacter();
                    addCharacter(character);
                } catch (checkPdvException e){
                    e.getMessage();
                }
                startMenu();
                break;
            case 2:
                menu.showCharacters(charactersList);
                startMenu();
                break;
            case 3:
                menu.showCharacters(charactersList);
                int player = menu.getInt("quel personnage?");
                if(charactersList[player] != null){
                   charactersList =  menu.menuOptions(charactersList, charactersList[player]);
                }
                startMenu();
                break;
            case 4:
                System.out.println("Sortie Menu");
        }
    }

    public static void main(String[] args) {

        startMenu();

        Labyrinthe labyrinthe = new Labyrinthe();
        labyrinthe.printLabyrinthe();

        Character test = new Warrior();

        test.setX(4);
        test.setY(0);

        while(labyrinthe.getLabyrinthe()[test.getX()][test.getY()].getIsFinale() != 1){
            labyrinthe.getPath(test);
            labyrinthe.getPathChoice(test);
            labyrinthe.move();
        }


        System.out.println("Fin du donjon");

    }
}
