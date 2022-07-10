package com.task;

import io.restassured.RestAssured;
import io.restassured.response.Response;
import io.restassured.response.ResponseBody;
import io.restassured.specification.RequestSpecification;

public class WriteValue {
	
	

	static RequestSpecification req;
	public static void main(String[] args) {

		 Response response = RestAssured.given().header("content-type", "application/json").log().all().body("{\r\n" + 
				"    \"name\": \"jayavel\",\r\n" + 
				"    \"job\": \"leader\"\r\n" + 
				"}").post("https://reqres.in/api/users");
		 
		System.err.println(response.getStatusCode());
		ResponseBody body = response.getBody();

		
		System.out.println(body.asPrettyString());
}

}
