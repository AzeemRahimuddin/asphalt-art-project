import org.code.neighborhood.*;

public class PainterPlus extends Painter {

/*
*allows painter to make right turns. 
*/
public void turnRight(){

turnLeft();
turnLeft();
turnLeft();

  
}  

/*
the painter will take paint if on the bucket
*/
public void takeAllPaint(){
while(isOnBucket()){
  takePaint();
}



  
}

/*
*Moves forward while a Painter object can move
*/
public void moveFast(){
while(canMove()){
  move();
}
  
}

/*
 * Paints and moves while the Painter object has paint 
 */
public void paintToEmpty(String Color){
while(isOnBucket()){
  takePaint();
}
  
}
  
/*
* Moves, turns, and paints in a donut shape
*/
  public void paintDonut(String color) {
    while (hasPaint()) {
      move();
      turnRight();
      paint(color);
      move();
      paint(color);
    }
  }

 
   
}