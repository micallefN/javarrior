package projetwarrior;

import projetwarrior.monster.Corgi;
import projetwarrior.monster.Monster;

public class Room {

    private Boolean hasPlayer;
    private int isFinale;
    private Boolean shown;
    private Monster monster;

    public Room(){
        this.hasPlayer = false;
        this.isFinale = 0;
        this.shown = false;
        if(((int) (Math.random() * (101))> 80)){
            this.monster = new Corgi();
        }

    }

    public void setShown(Boolean shown) {
        this.shown = shown;
    }
    public Boolean getShown() {
        return shown;
    }

    public Room(Boolean hasPlayer){
        this.hasPlayer = true;

        this.isFinale = 0;
        this.shown = false;
    }
    public Room(int isFinale){
        this.hasPlayer = false;
        this.isFinale = 1;
        this.shown = false;
    }

    public Boolean getHasPlayer(){
        return this.hasPlayer;
    }
    public void setHasPlayer(Boolean hasPlayer){
        this.hasPlayer = hasPlayer;
    }

    public void setIsFinale(int isFinale) {
        this.isFinale = isFinale;
    }
    public int getIsFinale() {
        return isFinale;
    }

    public Monster getMonster() {
        return monster;
    }

    public void setMonster(Monster monster) {
        this.monster = monster;
    }
}
