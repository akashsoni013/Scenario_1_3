package com.apiautomation.tests;

import java.util.HashMap;
import java.util.Map;
import java.util.Random;

import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.http.ContentType;

public class RegisterTwoStations {

	@Test
	public void registerTwoStations() {
		Random rnd = new Random();
		int number = rnd.nextInt();

		Map<String, String> map = new HashMap<String, String>();
		map.put("external_id", "SF_TEST001");
		map.put("name", "San Francisco Test Station" + number);
		map.put("latitude", "37.76");
		map.put("longitude", "-122.43");
		map.put("altitude", "150");

		RestAssured.baseURI = "http://api.openweathermap.org";

		RestAssured.given().queryParam("appid", "e58b43f4e40d8a86396b627e2a150e58").contentType(ContentType.JSON).when()
				.body(map).post("/data/3.0/stations}").then().log().body(true);

//		RestAssured.given().queryParam("appid", "e58b43f4e40d8a86396b627e2a150e58").contentType(ContentType.JSON)
//				.when()
//				.body("{\"external_id\": \"Interview1 \",\n"
//						+ "\"name\": \"Interview Station "+number+"\", \"latitude\": 33.44,\n"
//						+ "\"longitude\": -12.44,\n" + "\"altitude\": 444 ")
//				.post("/data/3.0/stations}").then().log().body(true);
	}
}

//{
//	  "external_id": "SF_TEST001",
//	  "name": "San Francisco Test Station",
//	  "latitude": 37.76,
//	  "longitude": -122.43,
//	  "altitude": 150
//	}

//"external_id": "DEMO_TEST001",
//"name Interview Station <Random Number>",
//"latitude": 33.33,
//"longitude": -111.43,
//"altitude": 444 

//"external_id": "Interview1 ",
//"name": "Interview Station <Random Number>",
//"latitude": 33.44,
//"longitude": -12.44,
//"altitude": 444 