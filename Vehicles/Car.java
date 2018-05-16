public class Car implements Vehicle
{
 private int size;
 private int X;
 private int Y;
 public Car(int X, int Y)
 {
  this.X = X;
  this.Y = Y;
  size = 2;
 }
 
 public int getX()
 {
  return X;
 }
 
 public getY()
 {
  return Y;
 }
 
 public void move(int spaces, Direction d)
 {
  switch(d)
  {
   case FORWARD:
    Y += spaces;
    break;
   case BACKWARD:	
    Y -= spaces;
    break;
   case UP:
    X -= spaces;
    break;
   case DOWN:
    X += spaces;
    break;
   default:
    System.out.println("Not a valid direction"); 
  }
 } 
}