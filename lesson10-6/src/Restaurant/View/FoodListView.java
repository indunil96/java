package Restaurant.View;

import java.util.ArrayList;

import Restaurant.Entity.Food;

public class FoodListView {

	public void showJapan(ArrayList<Food> foods) {

		System.out.println("検索結果：" + foods.size() + "件");

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

		System.out.println("検索結果：" + foods.size() + "件");

		if (foods.size() == 0) {
			System.out.println("見つかりませんでした");
		} else {
			for (Food fn : foods) {
				if (fn.getCountry() == "ネパール") {
					System.out.println("ID      :" + fn.getId());
					System.out.println("料理名  :" + fn.getName());
					System.out.println("価格　　:" + fn.getPrice() + "Rupees");
					System.out.println("Type    :" + fn.getType());
					System.out.println();
				}
			}

		}
	}

	public void showSrinlanka(ArrayList<Food> foods) {

		System.out.println("検索結果：" + foods.size() + "件");

		if (foods.size() == 0) {
			System.out.println("見つかりませんでした");
		} else {
			for (Food fn : foods) {
				if (fn.getCountry() == "スリランカ") {
					System.out.println("ID         :" + fn.getId());
					System.out.println("料理名  :" + fn.getName());
					System.out.println("価格　　:" + fn.getPrice() + "Rupees");
					System.out.println("Type    :" + fn.getType());
					System.out.println();
				}
			}

		}

	}

	public void showVietNam(ArrayList<Food> foods) {

		System.out.println("検索結果：" + foods.size() + "件");

		if (foods.size() == 0) {
			System.out.println("見つかりませんでした");
		} else {
			for (Food fn : foods) {
				if (fn.getCountry() == "ベトナム") {
					System.out.println("ID      :" + fn.getId());
					System.out.println("料理名  :" + fn.getName());
					System.out.println("価格　　:" + fn.getPrice() + "Rupees");
					System.out.println("Type    :" + fn.getType());
					System.out.println();
				}
			}

		}

	}
}
