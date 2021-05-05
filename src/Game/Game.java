package Game;

public class Game {
	
	String Id;
	String Name;
	String PriceTag;
	
	public Game() {}
	
	public Game(String id, String name, String priceTag) {
		super();
		Id = id;
		Name = name;
		PriceTag = priceTag;
	}

	public String getId() {
		return Id;
	}

	public void setId(String id) {
		Id = id;
	}

	public String getName() {
		return Name;
	}

	public void setName(String name) {
		Name = name;
	}

	public String getPriceTag() {
		return PriceTag;
	}

	public void setPriceTag(String priceTag) {
		PriceTag = priceTag;
	}

	
	
	
	

}
