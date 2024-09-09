import org.code.neighborhood.*;



/*
 * BusPainter is a PainterPlus that paints
 * the bus and dirt road in The Neighborhood
 */
public class BusPainter extends BackgroundPainter {

// This will allow the bus to be painted
// in the Neigborhood
public BusPainter(){
  

}

/* 
* This method will paint the bus and the ground by using 3 different colors
* The main color will paint the bus yellow/paintTop
* The second color will paint the bus wheels black/paintBottom
* The third color will paint the dirt road burlywood/paintGround
*/
public void paintBus (String mainColor, String secondColor, String thirdColor){

 // calls to start the starting point for the painter object 
startPosition();

//  calls to start the painting of the yellow bus
paintTop(mainColor);
// calls to start the painting of the bus wheels
paintBottom(secondColor);
// calls to start the painting of the ground
paintGround(thirdColor);

  
}
 
/*
*This method will set up the starting position for the painter object
* It also involves moving the painter objects to the end locations
*/
public void startPosition(){

// move foward 4 units
for (int i= 1; i<=4;i++){
  move();
}
// After moving 4 units, then turning right 
turnRight();

// This will move the Painter object 7 units
for (int i= 1; i<=7;i++){
  move();
}
// After moving 7 units, then turning left  
turnLeft();

// moving foward 1 unit
 move();   
}

/*
* This method paints the top of the bus, using the mainColor
* This method involves painting several lines and also many turns
*/
public void paintTop (String mainColor){

// Painting a line of 9 units using the mainColor
paintLine (mainColor,9);

// Turning the painter object to the south right direction
turnToSouthRight();

// Painting a line of 11 units using the mainColor  
paintLine(mainColor,11);
  
// Turning the painter object to the south left direction
turnToSouthLeft();

// Painting a line of 11 units using the mainColor  
paintLine(mainColor,11);

// Turning the painter object to the south right direction
turnToSouthRight();


  
}

/*
* This method will paint the bottom of the bus, using the secondColor
* This method includes painting several lines and also many turns
*/
public void paintBottom (String secondColor){

//  Move foward 2 units 
move();
move();

// Adding more paint to the painter object's bucket
setPaint(2);

// This will paint the first bus wheel using the secondColor
paint(secondColor);

 // moving foward 7 units 
for (int i= 1; i<=7;i++){
  move();
}             
// This will paint the second bus wheel using the secondColor
paint(secondColor);

// moving foward 4 units
for (int i= 1; i<=4;i++){
  move();
}         

turnLeft();
move();
turnLeft();


}
/*
* This method will paint the ground, using the thirdColor
* This method also includes painting several lines and also many turns
*/
public void paintGround (String thirdColor){

// Painting a line of 16 units using the color BurlyWood
paintLine(thirdColor,16);
// The 3 lines of code below, move the paint object down to the next line
turnRight();
move();
turnRight();
paintLine(thirdColor,16);
turnLeft();
move();
turnLeft();
paintLine(thirdColor,16);
turnRight();
move();
turnRight();
paintLine(thirdColor,16);
turnLeft();
move();
turnLeft();
paintLine(thirdColor,16);
  
}

}