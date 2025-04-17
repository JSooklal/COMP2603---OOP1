import java.awt.Shape;
import java.awt.geom.Ellipse2D;

public class Circle extends SimpleShape{
  
    protected int radius;
    
    public Circle(int r) {
       radius = r;
       xLoc += radius + 10;    
    }
    
    public void calculateArea(){
        super.area = this.radius * this.radius * Math.PI;
    }
    
     public Shape draw(){
        return new Ellipse2D.Double(super.x, super.y, this.radius, this.radius);
    }
    
    
    public String toString(){
        calculateArea();
        return "Circle" + super.toString();
    }
 
}
