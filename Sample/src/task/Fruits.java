package task;

public class Fruits {
	private Integer id;
	private String name;

	private String size;

	public enum type {
		Berry, Pomes, Hesperidiums, Pepos, Drupes, Aggregate
	};

	public enum color {
		Red, Green, Orange, Yellow
	};

	public Fruits(int id, String name, String type, String size, String color) {
		super();
		this.id = id;
		this.name = name;
		this.size = size;

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

}
