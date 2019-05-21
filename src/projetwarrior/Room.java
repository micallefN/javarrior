package projetwarrior;

public class Room {

    private Boolean hasPlayer;
    private int isFinale;

    public Room(){
        this.hasPlayer = false;
        this.isFinale = 0;
    }
    public Room(Boolean hasPlayer){
        this.hasPlayer = true;
        this.isFinale = 0;
    }
    public Room(int isFinale){
        this.hasPlayer = false;
        this.isFinale = 1;
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
}
