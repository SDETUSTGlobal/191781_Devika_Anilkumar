abstract class Car {
  
  
  public abstract void type();
  public void speed()
  {
      System.out.println(">=200 km/h ");
  }
}


public class Audi extends Car {
  public void type() {
    
    System.out.println("Automatic");
  }


  public static void main(String[] args) {
    Car a = new Audi(); 
    a.type();
    a.speed();
  }
}
