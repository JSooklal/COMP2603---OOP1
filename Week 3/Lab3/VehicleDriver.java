public class VehicleDriver {
    private String name;
    private Vehicle vehicle1;
    private Vehicle vehicle2;
    
    public VehicleDriver(String name){
        this.name = name;
        this.vehicle1=null;
        this.vehicle2=null;
    }
    
    public boolean addVehicle(Vehicle v){
        if(v!=null){
            if(vehicle1==null){
                vehicle1=v;
                return true;
            }
            if((vehicle2==null) && (!vehicle1.equals(v))){
                vehicle2=v;
                return true;
            }
        }
        return false;
    }
    
    public String toString(){
        return getName() +
        "\n 1." + vehicle1.toString() +
        "\n 2." + vehicle2.toString();
    }
    
    public String getName(){
        return name;
    }
}
