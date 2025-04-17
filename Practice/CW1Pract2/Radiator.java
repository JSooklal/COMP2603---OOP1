public class Radiator{
    private int radiatorID = 1000;
    private boolean isTurnedOn;
    private Room heatedRoom;
    
    
    public Radiator(){
        this.radiatorID += 10;
        this.isTurnedOn = false;
        this.heatedRoom = null;
    }
    
    public int getRadiatorID(){return this.radiatorID;}
    public void heats(Room rm){
        this.heatedRoom = rm;
    }
    
}