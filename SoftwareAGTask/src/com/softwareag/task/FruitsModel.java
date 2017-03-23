package com.softwareag.task;

public class FruitsModel {
	private Integer id;
	private String name;
	private String type;
	private String size;
	String color;
	public enum type {
		seedfruit, seddlessfruit
	};

	public enum color {
		Red, Green, Blue, Black, Orange, Yellow
	};

	public FruitsModel(int id, String name, String type, String size, String color) {
		super();
		this.id = id;
		this.name = name;
		this.type = type;
		this.size = size;
		this.color = color;

	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getSize() {
		return size;
	}

	public void setSize(String size) {
		this.size = size;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

}
