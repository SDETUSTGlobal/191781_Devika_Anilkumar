package restapi;
import static io.restassured.RestAssured.given;


public class myFirstRestAssuredClass {

    final static String url="http://demo.guru99.com/V4/sinkministatement.php?CUSTOMER_ID=68195&PASSWORD=1234!&Account_No=1";

    public static void main(String args[]) {

        getResponseBody();


        ; }

    //This will fetch the response body as is and log it. given and when are optional here


    public static void getResponseBody(){

        given().queryParam("CUSTOMER_ID","68195")
                .queryParam("PASSWORD","1234!")
                .queryParam("Account_No","1")
                .when().get("http://demo.guru99.com/V4/sinkministatement.php").then().log()
                .body();
    }


}
