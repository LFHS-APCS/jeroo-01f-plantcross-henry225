/**
 * Put your Jeroo methods in this class.
 * @author Steve Aronson
 */
public class Jeroo extends JerooBase {

//start of plant cross, calling to all helpermethods.
 public void plantCross(){
  moveToTop();
  plantTopRight();
  plantBottomRight();
  plantBottomLeft();
  plantTopLeft();
}
//move to top of the cross, in order to start planting.
public void moveToTop(){
  hopSeven();
  turn(RIGHT);
  hopThree();
}
//hop seven in order to get above the top of the cross
public void hopSeven(){
  hop();
  hop();
  hop();
  hop();
  hop();
  hop();
  hop();
}
//hop three in order to get right above the top of the cross
public void hopThree(){
  hop();
  hop();
  hop();
}
//start planting the top right quadrant of the cross
public void plantTopRight(){
  plantTurnLeft();
  hop();
  turn(RIGHT);
  plantHop();
  plantHop();
  plantHop();
  turn(LEFT);
  plantHop();
  plantHop();
  plantHop();
}
//start planting the bottom right quadrant of the cross
public void plantBottomRight(){
  turn(RIGHT);
  plantHop();
  plantHop();
  turn(RIGHT);
  plantHop();
  plantHop();
  plantHop();
  plantTurnLeft();
  hop();
  plantHop();
  plantHop();
  plant();
}
//start planting the bottom left quadrant of the cross
public void plantBottomLeft(){
  turn(RIGHT);
  plantHop();
  plantHop();
  plant();
  turn(RIGHT);
  plantHop();
  plantHop();
  plantHop();
  plantTurnLeft();
  plantHop();
  plantHop();
  plantHop();
  plantTurnRight();
  plantHop();
  plantHop();
  plant();
}
//start planting the top left quadrant of the cross
public void plantTopLeft(){
  turn(RIGHT);
  plantHop();
  plantHop();
  plantHop();
  plantTurnLeft();
  hop();
  plantHop();
  plantHop();
  plantTurnRight();
  hop();
}
//in order to clean up the code, use planthop when there is a plant and then a hop in succession. 
public void plantHop(){
  plant();
  hop();
}
//in order to clean up the code, use plantTurnLeft when there is a plant and turn(LEFT) in succession
public void plantTurnLeft(){
  plant();
  turn(LEFT);
}
//in order to clean up the code, use plantTurnRight when there is a plant and turn(RIGHT) in succesion
public void plantTurnRight(){
  plant();
  turn(RIGHT);
}
    
    // Put any helpermethods here
    
    
    
    
    // Do NOT touch the code below here

    public Jeroo() {super();}

    public Jeroo(int flowers) {super(flowers); }

    public Jeroo(int x, int y) { super(x, y); }

    public Jeroo(int x, int y, CompassDirection direction) { super (x, y, direction);}

    public Jeroo(int x, int y, int flowers) { super (x, y, flowers);}

    public Jeroo(int x, int y, CompassDirection direction, int flowers) { super(x, y, direction, flowers);}

}
