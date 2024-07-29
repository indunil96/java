package Restaurant.View;

import java.util.ArrayList;

import Restaurant.Entity.Food;
import Restaurant.Entity.Restaurant;
import Restaurant.Entity.Table;

public class View {

	int num;

	public void showRestaurant(ArrayList<Restaurant> restaurants) {
		if (restaurants.size() == 0) {
			System.out.println("見つかりませんでした");
		} else {
			for (Restaurant r : restaurants) {
				System.out.println("店ID	:" + r.getId());
				System.out.println("店名	:" + r.getRestaurantname());
				System.out.println("すすめ	:" + r.getRating() + "(" + r.getVote() + ")");
				System.out.println();
			}
		}
	}

	public void showTable(ArrayList<Table> tables) {
		for (Table t : tables) {
			System.out.println("テーブル:" + t.getNum());
			System.out.println("利用できる時間:" + t.getDuration() + "分");
		}
	}

	public void showJapan(ArrayList<Food> foods) {

		if (foods.size() == 0) {
			System.out.println("見つかりませんでした");
		} else {
			for (Food fn : foods) {
				if (fn.getCountry() == "日本") {
					System.out.println("ID      :" + fn.getId());
					System.out.println("料理名  :" + fn.getName());
					System.out.println("価格　　:" + fn.getPrice() + "円");
					System.out.println("Type    :" + fn.getType());
					System.out.println();
				}
			}

		}

	}

	public void showNepal(ArrayList<Food> foods) {

		if (foods.size() == 0) {
			System.out.println("見つかりませんでした");
		} else {
			for (Food fn : foods) {
				if (fn.getCountry() == "ネパール") {
					System.out.println("ID      :" + fn.getId());
					System.out.println("料理名  :" + fn.getName());
					System.out.println("価格　　:" + fn.getPrice() + " Rupees");
					System.out.println("Type    :" + fn.getType());
					System.out.println();
				}
			}

		}
	}

	public void showSrinlanka(ArrayList<Food> foods) {

		if (foods.size() == 0) {
			System.out.println("見つかりませんでした");
		} else {
			for (Food fn : foods) {
				if (fn.getCountry() == "スリランカ") {
					System.out.println("ID      :" + fn.getId());
					System.out.println("料理名  :" + fn.getName());
					System.out.println("価格　　:" + fn.getPrice() + " Rupees");
					System.out.println("Type    :" + fn.getType());
					System.out.println();
				}
			}

		}

	}

	public void showVietNam(ArrayList<Food> foods) {

		if (foods.size() == 0) {
			System.out.println("見つかりませんでした");
		} else {
			for (Food fn : foods) {
				if (fn.getCountry() == "VIET NAM") {
					System.out.println("ID      :" + fn.getId());
					System.out.println("料理名  :" + fn.getName());
					System.out.println("価格　　:" + fn.getPrice() + "円");
					System.out.println("Type    :" + fn.getType());
					System.out.println();
				}
			}

		}

	}

	public void orderJapan(ArrayList<Food> foods) {

		if (foods.size() == 0) {
			System.out.println("見つかりませんでした");
		} else {
			for (Food fn : foods) {
				if (fn.getCountry() == "日本") {
					num += fn.getPrice();
				}
			}

		}

	}

	public void totalJapan() {
		System.out.print(num + "円");
		num = 0;
	}

	public void orderVietNam(ArrayList<Food> foods) {

		if (foods.size() == 0) {
			System.out.println("見つかりませんでした");
		} else {
			for (Food fn : foods) {
				if (fn.getCountry() == "VIET NAM") {
					num += fn.getPrice();
				}
			}

		}

	}

	public void totalVietNam() {
		System.out.print(num + "円");
		num = 0;
	}

	public void orderSrinlanka(ArrayList<Food> foods) {

		if (foods.size() == 0) {
			System.out.println("見つかりませんでした");
		} else {
			for (Food fn : foods) {
				if (fn.getCountry() == "スリランカ") {
					num += fn.getPrice();
				}
			}

		}

	}

	public void totalSrinlanka() {
		System.out.print(num + " Rupees");
		num = 0;
	}

	public void orderNepal(ArrayList<Food> foods) {

		if (foods.size() == 0) {
			System.out.println("見つかりませんでした");
		} else {
			for (Food fn : foods) {
				if (fn.getCountry() == "ネパール") {
					num += fn.getPrice();
				}
			}

		}

	}

	public void totalNepal() {
		System.out.print(num + " Rupees");
		num = 0;
	}

}
