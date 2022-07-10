package com.task;

import io.restassured.RestAssured;
import io.restassured.response.Response;
import io.restassured.response.ResponseBody;
import io.restassured.specification.RequestSpecification;

public class WriteValue {
	
	

	static RequestSpecification req;
	public static void main(String[] args) {

		 req = RestAssured.given();
			// req = req.header("co");
			// req = req.pathParam("page", "2");
			 Response response = req.get("https://reqres.in/api/users/2");
		System.err.println(response.getStatusCode());
			ResponseBody body = response.getBody();
			
			System.out.println(body.asString());
			System.out.println(body.asPrettyString());
			
}

}
