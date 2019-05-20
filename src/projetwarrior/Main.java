package projetwarrior;

import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {

        boolean loop = true;
        int integer;
        String name;
        ArrayList<Character> characters = new ArrayList<>();

        Menu menu = new Menu();

        while(loop){

            integer = menu.getInt("Quel type de personnage voulez-vous? (1: guerrier, 2: magicien)");

            name =  menu.getString("Quel est ton nom?");

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

            loop = menu.menuOptions(player);

            characters.add(player);
        }

        System.out.println("t'es dehors");

    }
}
