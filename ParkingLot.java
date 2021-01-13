 public class ParkingLot {
   private int numCars;
   public final int MAX_CARS = 2500;
  
  //default constructor
  public ParkingLot() {
    numCars = 0;
  }

  //set up constructor
  public ParkingLot(int initCar){
    numCars = initCar;
  }

//accesor
  public int getNumCars(){
    return numCars;
  }
//mutator 
  public void setNumCars (int theNumCars){
    if (theNumCars < MAX_CARS && theNumCars > 0){
    numCars = theNumCars;
    }
  }  
// to string method
public String toString() {
  return "Number of cars is " + numCars;
}  

// boolean method 
public boolean equals(Object other){
  ParkingLot p =(ParkingLot)other;
  if (this.numCars == p.numCars){
    return true;
  }else {
    return false;
  }
}

 }

