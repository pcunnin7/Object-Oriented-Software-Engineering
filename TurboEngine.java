public class TurboEngine extends CarDecorator {

TurboEngine(Car c){

 super(c);}

 @Override
 public int topSpeed(){
    return super.topSpeed() + 10;
 };


}