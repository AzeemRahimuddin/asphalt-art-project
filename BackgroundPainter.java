import org.code.neighborhood.*;

/*
 * BackgroundPainter is a PainterPlus that paints
 * the background in The Neighborhood
 */
public class BackgroundPainter extends PainterPlus {

  /*
   * Paints each row of The Neighborhood with the color
   * where size is the size of the grid
   */
  public void paintBackground(String color, int size) {


// This for loop paints the sky across the grid
// and then turns downwards and around
// continues to paint across the grid
for (int i= 1; i<=6;i++){
  
  paintLine(color,size);  
  downRight();
  paintLine(color,size);
  downLeft();
      }

  }


  
  /*
   * Paints a line with the color where the length
   * of the line is specified by spaces
   */
  public void paintLine(String color, int spaces) {
    setPaint(spaces);

    while (hasPaint()) {
      paint(color);

      if (canMove()) {
        move();
      }
    }
  }

  
/*
* Turns the BackgroundPainter south right
*  and then to the next row
*/
public void turnToSouthRight(){
if (isFacingEast()){
    turnRight();
    move();
    turnRight();
    move();
}
  
}

/*
*Turns the Background Painter south left
 *then to the next row
 */
public void turnToSouthLeft(){
if (isFacingWest()){
    turnLeft();
    move();
    turnLeft();
    move();
}

  
}

/*
*Turns the BackgroundPainter right, moves it
* and then turns right again
*/
public void downRight(){
if (isFacingEast()){
    turnRight();
    move();
    turnRight();
  
}

  
}

/*
*Turns the BackgroundPainter left, moves it
* and then turns left again
*/
public void downLeft(){
if (isFacingWest()){
    turnLeft();
    move();
    turnLeft();
    
}


  
}

  
}
