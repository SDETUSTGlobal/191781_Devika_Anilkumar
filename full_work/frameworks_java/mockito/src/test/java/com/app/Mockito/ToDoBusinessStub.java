package com.app.Mockito;

import static org.junit.Assert.*;  
import java.util.List;  
import org.junit.Test;  
  public class ToDoBusinessStub {  
      @Test  
    public void test() {  
            ToDoService doServiceStub = new ToDoServiceStub();   
                      ToDoBusiness business = new ToDoBusiness(doServiceStub);  
              List<String> retrievedtodos = business.getTodosforSpring(" Dummy ");  
                  assertEquals(2, retrievedtodos.size());  
       System.out.println(" Stub is working correctly...!!");  
       }   
 }  
