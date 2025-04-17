public class Undergraduate extends Student{
    private String minor;
    private String major;
    private int credits;
    
    public Undergraduate(){
    
    }
    
    public Undergraduate(String name){
        super(name);
    }
    
    public String getMinor(){return this.minor;}
    public String getMajor(){return this.major;}
    public int getCredits(){return this.credits;}
    
    public void setMinor(String minor){this.minor = minor;}
    public void setMajor(String major){this.major = major;}
    public void setCredits(int credits){
        this.credits=credits;
        calculateFees();
    }
    
    public void calculateFees(){
        super.setFees(200*this.credits);
    }
    
    public String toString(){
        String def = "\n" + super.toString();
        def+= "\n MAJOR:" + getMajor() + " MINOR:" + getMinor() + " CREDITS:" + getCredits();
        return def;
    }
}
