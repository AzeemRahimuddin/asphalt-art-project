import org.code.neighborhood.*;

// This project paints a yellow bus, blue sky and dirt road

public class NeighborhoodRunner {
  public static void main(String[] args) {

// Instantiating a painter object to paint the background   
BackgroundPainter azeem = new BackgroundPainter();
    
// This will be the background sky color    
azeem.paintBackground("LightCyan",16);
  
 // Instantiating another painter object to paint
// the yellow bus and the dirt road
BusPainter azeemBus = new BusPainter();

// These colors are used to paint the bus
// and also the dirt road
azeemBus.paintBus("Yellow","Black","BurlyWood");

    
  }
}