 import java.awt.geom.RoundRectangle2D;
import java.awt.Shape;

public class Rectangle extends SimpleShape{
    
    private int length;
    private int breadth;
    private int edgeRoundness;
    
    public Rectangle(int l, int b){
        length = l;
        breadth = b;
        edgeRoundness = 30;
        xLoc += length + 10;
    }
    
    
       
    public void calculateArea(){
        super.area = this.length * this.breadth;

    }
    
    public void roundEdge(int curve){
        this.edgeRoundness = curve;

    }
    
    
     public Shape draw(){
        return new RoundRectangle2D.Double(super.x,super.y,this.length,this.breadth,
        this.edgeRoundness, this.edgeRoundness);
    }
    
    
    
    public String toString(){
        calculateArea();
        return "Rectangle" + super.toString();
        
    }
 
  
    

}
