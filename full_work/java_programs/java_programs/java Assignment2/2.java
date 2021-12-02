class Area{
      public int show(int c){
          
           return c*c;
      }
}
 
public class Aggregation {
    
    Area a =new Area();
    void res()
    { 
      System.out.println(a.show(8));     
    }
      public static void main(String args[]){
        
         Aggregation f=new Aggregation();
         f.res();
            
      }
}