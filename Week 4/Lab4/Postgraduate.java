public class Postgraduate extends Student{
    
    private String supervisor;
    private String thesisTitle;
    private String status;
    
    public Postgraduate(String name, String supervisor, String thesisTitle){
        super(name);
        this.supervisor=supervisor;
        this.thesisTitle=thesisTitle;
        setStatus("full-time");
    }
    
    public void setStatus(String status){
        this.status = status;
        calculateFees();
    }
    
    public void calculateFees(){
        if(this.status.equalsIgnoreCase("full-time")){
            super.setFees(2650);
        }
        if(this.status.equalsIgnoreCase("part-time")){
            super.setFees(1325);
        }
    }
    
        public String toString(){
        String def = "\n" + super.toString();
        def+= "\n SUPERVISOR:" + this.supervisor + "THESIS TITLE:" + this.thesisTitle +
        "STATUS: " + this.status;
        return def;
    }
}
