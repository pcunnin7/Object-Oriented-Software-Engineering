public class CarDecorator implements Car {

   protected Car car;
    
    public CarDecorator (Car c) {
    
     this.car = c;}
    
    @Override
    
    public int topSpeed(){
        return this.car.topSpeed();
     };
    
    }