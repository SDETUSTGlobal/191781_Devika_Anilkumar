package com.app.Mockito;

import java.util.ArrayList;  
import java.util.List;  
  
// ToDoBusiness is a SUT (system under test)   
// ToDoService is a Dependency (as ToDoBusiness is dependent on it)  
  
public class ToDoBusiness {  
  
    public ToDoService doService;  
  
    public ToDoBusiness(ToDoService doService) {  
        this.doService = doService;  
    }        
    public List<String> getTodosforSpring(String user) {  
       List<String> retrievedtodos = new ArrayList<String>();  
        List<String> todos = doService.getTodos(user);  
                  for(String todo :todos) {  
            if(todo.contains("Spring")) {  
                retrievedtodos.add(todo);  
            }  
        }  
        return retrievedtodos;  
        }  
 }   
