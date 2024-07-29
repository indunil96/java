package Restaurant.Name;

import java.util.ArrayList;
import java.util.Random;

import Restaurant.Entity.Restaurant;

public class RestaurantName {

	public ArrayList<Restaurant> getName() {
		ArrayList<Restaurant> restaurants = new ArrayList<>();
		Random r = new Random();
		int vote1 = r.nextInt(500);
		String rating1 = "";
		if (vote1 >= 350) {
			rating1 = "⭐⭐⭐⭐⭐";
		} else if (vote1 >= 200) {
			rating1 = "⭐⭐⭐⭐";
		} else {
			rating1 = "⭐⭐⭐";
		}

		int vote2 = r.nextInt(500);
		String rating2 = "";
		if (vote2 >= 350) {
			rating2 = "⭐⭐⭐⭐⭐";
		} else if (vote2 >= 200) {
			rating2 = "⭐⭐⭐⭐";
		} else {
			rating2 = "⭐⭐⭐";
		}

		int vote3 = r.nextInt(500);
		String rating3 = "";
		if (vote3 >= 350) {
			rating3 = "⭐⭐⭐⭐⭐";
		} else if (vote3 >= 200) {
			rating3 = "⭐⭐⭐⭐";
		} else {
			rating3 = "⭐⭐⭐";
		}

		int vote4 = r.nextInt(500);
		String rating4 = "";
		if (vote4 >= 350) {
			rating4 = "⭐⭐⭐⭐⭐";
		} else if (vote4 >= 200) {
			rating4 = "⭐⭐⭐⭐";
		} else {
			rating4 = "⭐⭐⭐";
		}

		Restaurant r1 = new Restaurant();
		r1.setId(1);
		r1.setRestaurantname("日本料理店");
		r1.setRating(rating1);
		r1.setVote(vote1);
		restaurants.add(r1);

		Restaurant r2 = new Restaurant();
		r2.setId(2);
		r2.setRestaurantname("スリランカ料理店");
		r2.setRating(rating2);
		r2.setVote(vote2);
		restaurants.add(r2);

		Restaurant r3 = new Restaurant();
		r3.setId(3);
		r3.setRestaurantname("ネパール料理店");
		r3.setRating(rating3);
		r3.setVote(vote3);
		restaurants.add(r3);

		Restaurant r4 = new Restaurant();
		r4.setId(4);
		r4.setRestaurantname("ベトナム料理店");
		r4.setRating(rating4);
		r4.setVote(vote4);
		restaurants.add(r4);

		return restaurants;

	}

}
