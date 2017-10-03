package net.rodor.HelloWorldRest;
//import javax.ws.rs.Path;
//import javax.ws.rs.GET;

@javax.ws.rs.Path("/helloworld")
public class Hello {
	
	//@javax.ws.rs.FormParam("firstName") String nombre;
	//http://127.0.0.1:9080/JRodorRest/rest/helloworld?firstName=jose
	@javax.ws.rs.GET
	 public String sayHelloWorld(@javax.ws.rs.QueryParam("firstName") String firstName) {
	        return "Hello World... "+ firstName;
	 }
	/**
	@javax.ws.rs.GET
	 public String sayHelloWorld() {
	        return "Hello World!";
	 }
	 ***/

}
