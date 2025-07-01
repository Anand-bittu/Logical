package com.anand.stramAPI;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

class Product
{
	private String catagory;
	private String name;
	private double price;
	public Product(String catagory, String name, double price) {
		this.catagory = catagory;
		this.name = name;
		this.price = price;
	}
	public String getCatagory() {
		return catagory;
	}
	public void setCatagory(String catagory) {
		this.catagory = catagory;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	@Override
	public String toString() {
		return "Product [catagory=" + catagory + ", name=" + name + ", price=" + price + "]";
	}
}

class OderIteam{
	private double price;
	private int quality;
	
	public OderIteam(double price, int quality) {
		this.price = price;
		this.quality = quality;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public int getQuality() {
		return quality;
	}

	public void setQuality(int quality) {
		this.quality = quality;
	}

	//method to caluate sum
	public double calculatePrice() {
		return this.price *  this.quality;
	}

	@Override
	public String toString() {
		return "OderIteam [price=" + price + ", quality=" + quality + "]";
	}
}
class Order{
	List<OderIteam> iteam;
	int quality;
	public Order(List<OderIteam> iteam, int quality) {
		this.iteam = iteam;
		this.quality = quality;
	}
	public List<OderIteam> getIteam() {
		return iteam;
	}
	public void setIteam(List<OderIteam> iteam) {
		this.iteam = iteam;
	}
	public int getQuality() {
		return quality;
	}
	public void setQuality(int quality) {
		this.quality = quality;
	}
	@Override
	public String toString() {
		return "Order [iteam=" + iteam + ", quality=" + quality + "]";
	}
}
class Person1{
	String name;
	int age;
	public Person1(String name, int age) {
		this.name = name;
		this.age = age;
	}
	@Override
	public String toString() {
		return "Person1 [name=" + name + ", age=" + age + "]";
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	
}
public class AdvanceSorting {
	public static void main(String[] args) {
		   List<Product> products = Arrays.asList(
	                new Product("Electronics", "Laptop", 1200.0),
	                new Product("Clothing", "Shirt", 30.0),
	                new Product("Electronics", "Mouse", 25.0),
	                new Product("Clothing", "Jeans", 50.0),
	                new Product("Electronics", "Keyboard", 25.0)
	        );
		   products.forEach(p->System.out.println(p));
		   System.out.println("after sorting ");

List<Product> result=products.stream().sorted(Comparator.comparing(Product::getCatagory)
				.thenComparingDouble(Product::getPrice).thenComparing(Product::getName)).collect(Collectors.toList());   
		   
              result.forEach(e->System.out.println(e));
		   
	}

}
