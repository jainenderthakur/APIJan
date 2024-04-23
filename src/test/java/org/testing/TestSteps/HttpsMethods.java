package org.testing.TestSteps;

import static io.restassured.RestAssured.given;

import java.util.Properties;

import io.restassured.http.ContentType;
import io.restassured.response.Response;

public class HttpsMethods {

	//input parameters- Request body, URI key name
	Properties pr;
	
	public HttpsMethods(Properties pr)
	{
		this.pr=pr;
	}
	
		public Response postmethod(String requestbody, String urikeyname)
	{	
		String urivalue=pr.getProperty(urikeyname);
		
		Response r=
		given()
		.contentType(ContentType.JSON)
		.body(requestbody)
		.when()
		.post(urivalue);
	
		System.out.println("Status code is "+r.statusCode());
		System.out.println("Response is "+r.asString());
		return r;
	}
		
		public void getallmethod(String urikeyname)
		{	
			String urivalue=pr.getProperty(urikeyname);
			
			Response r=
			given()
			.contentType(ContentType.JSON)
			.when()
			.get(urivalue);
		
			System.out.println("Status code is "+r.statusCode());
			System.out.println("Response is "+r.asString());
		}
		
		public void getparticular(String urikeyname, String endpoint)
		{	
			String urivalue=pr.getProperty(urikeyname)+"/"+endpoint;
			
			Response r=
			given()
			.contentType(ContentType.JSON)
			.when()
			.get(urivalue);
		
			System.out.println("Status code is "+r.statusCode());
			System.out.println("Response is "+r.asString());
		}	
		
		public void putmethod(String requestbody, String urikeyname, String endpoint)
		{
			String urivalue=pr.getProperty(urikeyname)+"/"+endpoint;
			
			Response r=
			given()
			.contentType(ContentType.JSON)
			.body(requestbody)
			.when()
			.put(urivalue);
			
			System.out.println("Status code is "+r.statusCode());
			System.out.println("Response is "+r.asString());		 	
		}
		
		public void deletemethod(String urikeyname, String endpoint)
		{
			String urivalue=pr.getProperty(urikeyname)+"/"+endpoint;
			
			Response r=
			given()
			.contentType(ContentType.JSON)
			.when()
			.delete(urivalue);
			
			System.out.println("Status code is "+r.statusCode());
			System.out.println("Response is "+r.asString());	
		}
}