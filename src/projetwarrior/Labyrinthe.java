package projetwarrior;
import projetwarrior.monster.*;

public class Labyrinthe {

    Menu menu = new Menu();

//    private Room[][] labyrinthe = {
//            {null, null, null, new Room(), null, new Room(), new Room(), new Room(), null, null, null, null, null, null},
//            {null, null, null, new Room(), null, new Room(), null, new Room(), null, null, new Room(), new Room(), new Room(), null},
//            {null, null, null, new Room(), new Room(), new Room(), null, new Room(), null, new Room(), new Room(), null, new Room(), new Room(1)},
//            {null, null, null, new Room(), null, null, null, new Room(), new Room(), new Room(), null, null, null, null},
//            {new Room(true), new Room(), new Room(), new Room(), null, new Room(), new Room(), new Room(), null, new Room(), null, new Room(), new Room(), null},
//            {null, null, null, new Room(), null, new Room(), null, new Room(), null, new Room(), new Room(), new Room(), null, null},
//            {null, null, null, new Room(), new Room(), new Room(), null, new Room(), new Room(), new Room(), null, null, null, null}
//    };

    private Room[][] labyrinthe = {
            {null, null, null, null, null, null, new Room(), new Room(), new Room(), null, null, new Room(), null, null, null, null, null},
            {null, new Room(), new Room(), new Room(), null, null, new Room(), null, new Room(), new Room(), new Room(), new Room(), null, null, null, null, null},
            {null, new Room(), null, null, null, null, new Room(), null, null, null, new Room(), new Room(), new Room(), new Room(), null, null, null},
            {null, new Room(), null, new Room(), new Room(), null, new Room(), new Room(), new Room(), null, null, new Room(), null, null, null, new Room(), new Room()},
            {null, new Room(), null, null, new Room(), null, null, new Room(), null, null, null, new Room(), null, null, new Room(), new Room(), null},
            {new Room(true), new Room(), new Room(), new Room(), new Room(), new Room(), new Room(), new Room(), null, null, null, new Room(), new Room(), new Room(), new Room(), null, null},
            {null, new Room(), null, null, null, new Room(), null, new Room(), new Room(), new Room(), null, new Room(), new Room(), null, new Room(), null, null},
            {null, new Room(), new Room(), new Room(), null, new Room(), new Room(), null, null, null, null, new Room(), null, null, new Room(), new Room(), null},
            {null, new Room(), null, null, null, new Room(), null, null, new Room(), new Room(), null, new Room(), new Room(), null, null, new Room(), null},
            {null, new Room(), new Room(), new Room(), new Room(), new Room(), new Room(), null, null, new Room(), new Room(), new Room(), null, null, null, new Room(1), null},
            {null, null, null, null, null, null, new Room(), new Room(), new Room(), new Room(), null, new Room(), new Room(), new Room(), null, null, null},
    };

    public void printLabyrinthe(){
        for(int i = 0; i<labyrinthe.length; i++){
            String line = "";
            for(int j = 0; j < labyrinthe[i].length; j++){
                if(labyrinthe[i][j] != null && labyrinthe[i][j].getShown()){
                    if(labyrinthe[i][j].getHasPlayer()){
                        line += "[X]";
                    } else {
                        line += "[ ]";
                    }
                } else {
                    line += "   ";
                }
            }
            System.out.println(line);
        }
    }

    public Room[][] getLabyrinthe() {
        return labyrinthe;
    }

    public  void getPath(Character character){


        int x = character.getX();
        int y = character.getY();
        int index = 1;

        String direction = "";

        if(x-1>= 0 && labyrinthe[x-1][y] != null){
            direction += "\n1 : Haut ";
        }
        if(y+1< 17 && labyrinthe[x][y+1] != null){
            direction += "\n2 : Droite ";
        }
        if(x+1 <11 && labyrinthe[x+1][y] != null){
            direction += "\n3 : Bas ";
        }
        if(y-1>=0 && labyrinthe[x][y-1] != null){
            direction += "\n4 : Gauche ";
        }
        System.out.println(direction);

    }

    public void getPathChoice(Character character){

        labyrinthe[character.getX()][character.getY()].setHasPlayer(false);

        int choice = menu.getInt("\nQuelle direction ? : \n");
        switch (choice){
            case 1:
                character.setX(character.getX()-1);
                break;
            case 2:
                character.setY(character.getY()+1);
                break;
            case 3:
                character.setX(character.getX()+1);
                break;
            case 4:
                character.setY(character.getY()-1);
                break;
        }

        labyrinthe[character.getX()][character.getY()].setHasPlayer(true);

    }

    public void showRoom(Character character){
        int x = character.getX();
        int y = character.getY();

        labyrinthe[x][y].setShown(true);

        if(x-1>= 0 && labyrinthe[x-1][y] != null && !labyrinthe[x-1][y].getShown()){
            labyrinthe[x-1][y].setShown(true);
        }
        if(y+1< 17 && labyrinthe[x][y+1] != null && !labyrinthe[x][y+1].getShown()){
            labyrinthe[x][y+1].setShown(true);
        }
        if(x+1 <11 && labyrinthe[x+1][y] != null && !labyrinthe[x+1][y].getShown()){
            labyrinthe[x+1][y].setShown(true);
        }
        if(y-1>=0 && labyrinthe[x][y-1] != null && !labyrinthe[x][y-1].getShown()){
            labyrinthe[x][y-1].setShown(true);
        }
    }

    public void checkMonster(Character character){
        int x = character.getX();
        int y = character.getY();

        if(labyrinthe[x][y].getMonster() != null && labyrinthe[x][y].getMonster().getLife()>0){
            fight(character, labyrinthe[x][y].getMonster());
        } else {
            System.out.printf("Pas de monstre");
        }
    }

    public void fight(Character character, Monster monster){
        while (character.getLifeLevel() > 0 && monster.getLife() > 0){
            character.attack(monster);
            monster.attack(character);
        }
        if(character.getLifeLevel()>0){
            System.out.printf("vous avez battu le " + monster.getName() + " il vous reste " + character.getLifeLevel() + " pdv");
        } else {
            System.out.printf("t'es mort ducon");
        }
    }

}
