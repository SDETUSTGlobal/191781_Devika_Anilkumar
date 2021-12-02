package restapi;

import static io.restassured.RestAssured.given;

import org.testng.annotations.Test;

public class NewTest {
  @Test
  
  public void f(){
	  
	     getResponseBody();
	     getResponseStatus();
  } 
	 
 String url="http://demo.guru99.com/V4/sinkministatement.php?CUSTOMER_ID=68195&PASSWORD=1234!&Account_No=1";
 void getResponseBody(){
      given().when().get(url).then().log()
     .all();

 given().queryParam("CUSTOMER_ID","68195")
              .queryParam("PASSWORD","1234!")
              .queryParam("Account_No","1") .when().get("http://demo.guru99.com/V4/sinkministatement.php").then().log().body();
  }
  void getResponseStatus(){
	   int statusCode= given().queryParam("CUSTOMER_ID","68195")
	           .queryParam("PASSWORD","1234!")
	           .queryParam("Account_No","1")
	           .when().get("http://demo.guru99.com/V4/sinkministatement.php").getStatusCode();
	   System.out.println("The response status is "+statusCode);
	 
	   given().when().get(url).then().assertThat().statusCode(200);
	}
	 
}
