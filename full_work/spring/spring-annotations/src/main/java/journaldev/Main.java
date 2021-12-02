package journaldev;
 
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
 
import com.journaldev.config.AppConfig;
import com.journaldev.drivers.DataBaseDriver;
import com.journaldev.service.UserService;
 
public class Main {
	public static void main(String[] args) {
	AbstractApplicationContext appContext = new AnnotationConfigApplicationContext(AppConfig.class);
 
	DataBaseDriver oracle = appContext.getBean("oracleDriver", DataBaseDriver.class);
	DataBaseDriver mysql = appContext.getBean("mysqlDriver", DataBaseDriver.class);
		
        System.out.println("Oracle driver info:");
        System.out.println(oracle.getInfo());
        
        System.out.println("MySQL driver info:");
        System.out.println(mysql.getInfo());
 
        System.out.println("UserService Information");
	UserService userService = appContext.getBean(UserService.class);
	System.out.println(userService.getDriverInfo());
 
	appContext.close();
	}
}
