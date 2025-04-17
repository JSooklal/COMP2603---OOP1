public class Room{
    private String roomName;
    private int seatingCapacity;
    private int numRadiators;
    private Radiator[] radiators;
    
    public Room(String roomName){
        this.roomName = roomName;
        this.seatingCapacity = 15;
        this.numRadiators = 0;
        this.radiators = new Radiator[2];
    }
    
    public String isHeatedBy(Radiator rd){
        for (int i = 0; i < numRadiators; i++){
            if(radiators[i] == rd){
                return "Radiator already added to room";
        }
    }
    if(numRadiators <2){
        radiators[numRadiators++] = rd;
        rd.heats(this);
        return "Radiator added";
    } else { return "Cannot add radiator";}
}

}
