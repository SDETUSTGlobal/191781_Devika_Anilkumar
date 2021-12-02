class Bird{  
 void feature(){
      System.out.println("feathers"); 
      System.out.println("beak"); 
 } 
}  
public class Owl extends Bird{  
  
  void feature(){
      System.out.println("deep brown colored"); 
      System.out.println("Dark Eyes"); 
 } 
 public static void main(String args[]){  
     
  Bird obj=new Owl(); 
  obj.feature();
  System.out.println(obj instanceof Owl);
}
}