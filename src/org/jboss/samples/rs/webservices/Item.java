package org.jboss.samples.rs.webservices;

import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement(name = "item")
public class Item {

	private String description;
	private int price;
	
	public Item() {
		description = "";
		price = 0;
	}
	
	public Item(String description, int price) {
		this.description = description;
		this.price = price;
	}
	
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	
}
