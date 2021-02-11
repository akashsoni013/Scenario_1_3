package com.apiautomation.tests;

import org.testng.Assert;
import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import io.restassured.path.json.JsonPath;
import io.restassured.response.Response;

//e58b43f4e40d8a86396b627e2a150e58
public class InvalidApiKeyTest {

	@Test
	private static void getInvalidApiKeyResponse() {
		RestAssured.baseURI = "http://api.openweathermap.org";

		Response resp = RestAssured.given().contentType(ContentType.JSON)
				.body("{\r\n" + "  \"external_id\": \"SF_TEST001\",\r\n"
						+ "  \"name\": \"San Francisco Test Station\",\r\n" + "  \"latitude\": 37.76,\r\n"
						+ "  \"longitude\": -122.43,\r\n" + "  \"altitude\": 150\r\n" + "}")
				.when().post("/data/3.0/stations").then().assertThat().statusCode(401).extract().response();

		JsonPath json = resp.jsonPath();
		String message = json.getString("message");
		Assert.assertEquals(message,
				"Invalid API key. Please see http://openweathermap.org/faq#error401 for more info.",
				"Verify the Invalid API key message displayed");
	}

}
