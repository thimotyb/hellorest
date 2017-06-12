package org.jboss.samples.rs.webservices;

import java.util.ArrayList;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;

@Path("/MyRESTApplication")
public class HelloWorldResource {

	@GET()
	@Produces("text/plain")
	public String sayHello() {
	    return "Hello World!";
	}
	
	@GET
	@Path("item")
	@Produces({"application/xml"})
	public Item  getItem() {
	 
	  Item item = new Item("computer",2500);
	 
	 return item;
	} 
	
	@GET
	@Path("itemList")
	@Produces({"application/xml"})
	 public ItemList  getCollItems() {
	  ArrayList list = new ArrayList();
	  Item item1 = new Item("computer",2500);
	  Item item2 = new Item("chair",100);
	  Item item3 = new Item("table",200);
	 
	  list.add(item1);
	  list.add(item2);
	  list.add(item3);
	 
	  return new ItemList(list);
	 }
	
	@GET
	@Path("items")
	@Produces("application/json")
	public ItemList  getJSONItems() {
	  ArrayList list = new ArrayList();
	  Item item1 = new Item("computer",2500);
	  Item item2 = new Item("chair",100);
	  Item item3 = new Item("table",200);
	 
	  list.add(item1);
	  list.add(item2);
	  list.add(item3);
	 
	  return new ItemList(list);
	}  
	
	@GET
	  @Path("login/{zip}")
	  public String login(@PathParam("zip") String id) {
	   return "Id is " +id;
	  }
	
}
