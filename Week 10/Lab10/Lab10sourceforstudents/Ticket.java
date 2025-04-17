public class Ticket{
    
    private int ticketNumber;
    private static int ticketNumberCounter = 100;
    
    public Ticket(){
        ticketNumber = ticketNumberCounter;
        ticketNumberCounter = ticketNumberCounter + 1;
    }
    public void setTicketNumber(int ticketNumber){
        this.ticketNumber = ticketNumber;
    }
    public String toString(){
        return "Ticket: " + ticketNumber;
    }
    
    
    public int hashCode(){
        String s = ticketNumber +"";
        return s.hashCode();
    }
    
    public boolean equals(Object obj){
        if (obj instanceof Ticket){
            Ticket p = (Ticket)obj;
            return (p.ticketNumber == this.ticketNumber);
        }
        throw new IllegalArgumentException("Cannot compare non equals");
    }
}
