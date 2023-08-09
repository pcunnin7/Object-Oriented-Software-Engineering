public class CarFactory {

    static Car create(String s) {
    
   
    
   if (s == "sedan") {
    
    return new SedanCar();
    
   }
    
    else if (s == "sport") {
    
     return new SportCar();}
    
    
    
    
  else {System.out.println("Invalid Car type."); return null;}
    
    
    
    
    }
    
    }