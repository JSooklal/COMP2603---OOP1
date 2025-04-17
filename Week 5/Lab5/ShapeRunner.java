import java.awt.Color;
public class ShapeRunner{
   public static void main(String[] args){
     ShapeScreen s = new ShapeScreen();
     
     SimpleShape s1 = new SimpleShape();
     SimpleShape s2 = new Rectangle(50,100);
     
     
     
     
     Circle s3 = new Circle(50);
     Circle s4 =  new Circle(30);
     Rectangle s5 = new Rectangle(300,100);
     s5.roundEdge(35);

     SimpleShape[] shapes = {s1,s2,s3,s4,s5};
     
     for(SimpleShape ss : shapes){
         if(ss instanceof Rectangle){
             Rectangle r1 = (Rectangle)ss;
             r1.calculateArea();
             if(r1.getArea()>10000){
                 r1.roundEdge(35);
             }
             r1.setColor(Color.blue);
         }
         if (ss instanceof Circle){
             Circle c1 = (Circle)ss;
             c1.calculateArea();
             if(c1.getArea()>2828){
                 c1.setColor(Color.red);
             }
         }
         System.out.println(ss.toString());
     }
     ShapeScreen screen = new ShapeScreen(shapes);
   }
}
