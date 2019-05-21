package projetwarrior;


import java.util.ArrayList;

public class Labyrinthe {

    Menu menu = new Menu();

    private Room[][] labyrinthe = {
            {null, null, null, new Room(), null, new Room(), new Room(), new Room(), null, null, null, null, null, null},
            {null, null, null, new Room(), null, new Room(), null, new Room(), null, null, new Room(), new Room(), new Room(), null},
            {null, null, null, new Room(), new Room(), new Room(), null, new Room(), null, new Room(), new Room(), null, new Room(), new Room(1)},
            {null, null, null, new Room(), null, null, null, new Room(), new Room(), new Room(), null, null, null, null},
            {new Room(true), new Room(), new Room(), new Room(), null, new Room(), new Room(), new Room(), null, new Room(), null, new Room(), new Room(), null},
            {null, null, null, new Room(), null, new Room(), null, new Room(), null, new Room(), new Room(), new Room(), null, null},
            {null, null, null, new Room(), new Room(), new Room(), null, new Room(), new Room(), new Room(), null, null, null, null}
    };

    public void printLabyrinthe(){
        for(int i = 0; i<labyrinthe.length; i++){
            String line = "";
            for(int j = 0; j < labyrinthe[i].length; j++){
                if(labyrinthe[i][j] != null){
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
        if(y+1< 14 && labyrinthe[x][y+1] != null){
            direction += "\n2 : Droite ";
        }
        if(x+1 <7 && labyrinthe[x+1][y] != null){
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
    public void move(){

        printLabyrinthe();
    }

}
