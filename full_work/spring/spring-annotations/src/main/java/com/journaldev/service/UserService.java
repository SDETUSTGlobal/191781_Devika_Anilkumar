package com.journaldev.service;
 
import com.journaldev.drivers.DataBaseDriver;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;
 
@Service
public class UserService {
 
    @Autowired
    @Qualifier("oracleDriver")
    private DataBaseDriver dataBaseDriver;
 
    public String getDriverInfo(){
        return dataBaseDriver.getInfo();
    }
}
