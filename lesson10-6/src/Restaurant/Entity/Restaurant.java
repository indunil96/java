package Restaurant.Entity;

public class Restaurant {

	private int id;
	private String restaurantname;
	private String rating;
	private int vote;

	public int getVote() {
		return vote;
	}

	public void setVote(int vote) {
		this.vote = vote;
	}

	public String getRestaurantname() {
		return restaurantname;
	}

	public void setRestaurantname(String restaurantname) {
		this.restaurantname = restaurantname;
	}

	public String getRating() {
		return rating;
	}

	public void setRating(String rating) {
		this.rating = rating;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

}
