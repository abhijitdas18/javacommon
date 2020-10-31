package com.abhi.common;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.Scanner;
import org.json.*;


public class ReadJSONDataFromURL {
    //inline will store the JSON data streamed in string format
    String inline = "";
    public void func() {
        try {
            String movieURL = "https://jsonmock.hackerrank.com/api/movies/search/?Title=super";
            URL url = new URL(movieURL);
            //Parse URL into HttpURLConnection in order to open the connection in order to get the JSON data
            HttpURLConnection conn = (HttpURLConnection) url.openConnection();
            //Set the request to GET or POST as per the requirements
            conn.setRequestMethod("GET");
            //Use the connect method to create the connection bridge
            conn.connect();
            //Get the response status of the Rest API
            int responsecode = conn.getResponseCode();
            System.out.println("Response code is: " + responsecode);
            //Iterating condition to if response code is not 200 then throw a runtime exception
            //else continue the actual process of getting the JSON data
            if(responsecode != 200)
                throw new RuntimeException("HttpResponseCode: " +responsecode);
            else
            {
                //Scanner functionality will read the JSON data from the stream
                Scanner sc = new Scanner(url.openStream());
                while(sc.hasNext())
                {
                    inline += sc.nextLine();
                }
                System.out.println("\nJSON Response in String format");
                System.out.println(inline);
                //Close the stream when reading the data has been finished
                sc.close();
            }

            JSONObject json = new JSONObject(inline);

            System.out.println(json.toString());

            //Disconnect the HttpURLConnection stream
            conn.disconnect();
        } catch (Exception e) {
            System.out.println("Exception .....");
        }
    }

    public static void main(String[] args) {
        new ReadJSONDataFromURL().func();
    }
}
