package Restaurant.Controller;

import java.util.ArrayList;
import java.util.Scanner;

import Restaurant.Entity.Food;
import Restaurant.Entity.Restaurant;
import Restaurant.Entity.Table;
import Restaurant.Model.RestaurantModel;
import Restaurant.Name.RestaurantName;
import Restaurant.View.View;

public class RestaurantController {

	public static void main(String[] args) {
		RestaurantName rn = new RestaurantName();
		RestaurantModel rm = new RestaurantModel();
		View view = new View();
		Table tb = new Table();
		Scanner sc_int = new Scanner(System.in);
		Scanner sc_str = new Scanner(System.in);
		while (true) {
			int id = 0;
			System.out.println("-----RESTAURANT-----");
			System.out.println();

			ArrayList<Restaurant> restaurants = rn.getName();
			view.showRestaurant(restaurants);

			System.out.println("店IDを入力してください(0:入らない)");
			int num = sc_int.nextInt();
			if (num == 0) {
				break;
			}
			System.out.println("いらっしゃいませ");
			System.out.println("何名様ですか");

			int people = sc_int.nextInt();
			if (people > 6) {
				System.out.println("6名までご利用できますので...");
			} else {
				ArrayList<Table> table = rm.findTable(people);
				view.showTable(table);

				System.out.println("テーブルは何番をご利用しますか");
				int tables = sc_int.nextInt();

				System.out.println(tables + "番にご案内します");
				System.out.println(people + "名様ご来店です");
				System.out.println("いらっしゃいませ");
				System.out.println();

				System.out.println("🍖🍖🍖料理検索🥑🥑🥑");
				while (true) {
					System.out.println("-----MENU-----");
					System.out.println("1:全件表示"
							+ "\n2:キーワード検索"
							+ "\n3:価格検索"
							+ "\n4:IDで注文"
							+ "\n5:種類検索"
							+ "\n6:会計");
					int menu = sc_int.nextInt();

					if (menu == 1) {

						ArrayList<Food> foods = rm.findAll();

						if (num == 1) {
							view.showJapan(foods);
						} else if (num == 2) {
							view.showSrinlanka(foods);
						} else if (num == 3) {
							view.showNepal(foods);
						} else if (num == 4) {
							view.showVietNam(foods);
						}
					} else if (menu == 2) {

						System.out.println("キーワードを入力してください");
						String word = sc_str.nextLine();

						ArrayList<Food> foods = rm.findByKeyWord(word);

						if (num == 1) {
							view.showJapan(foods);
						} else if (num == 2) {
							view.showSrinlanka(foods);
						} else if (num == 3) {
							view.showNepal(foods);
						} else if (num == 4) {
							view.showVietNam(foods);
						}
					} else if (menu == 3) {

						System.out.println("最小の価格を入力してください");
						int min = sc_int.nextInt();
						System.out.println("最大の価格を入力してください");
						int max = sc_int.nextInt();

						ArrayList<Food> foods = rm.findByPrice(min, max);

						if (num == 1) {
							view.showJapan(foods);
						} else if (num == 2) {
							view.showSrinlanka(foods);
						} else if (num == 3) {
							view.showNepal(foods);
						} else if (num == 4) {
							view.showVietNam(foods);
						}

					} else if (menu == 4) {

						System.out.println("IDを入力してください");
						id = sc_int.nextInt();

						ArrayList<Food> foods = rm.orderById(id);

						if (num == 1) {
							view.showJapan(foods);
							view.orderJapan(foods);
						} else if (num == 2) {
							view.showSrinlanka(foods);
							view.orderSrinlanka(foods);
						} else if (num == 3) {
							view.showNepal(foods);
							view.orderNepal(foods);
						} else if (num == 4) {
							view.showVietNam(foods);
							view.orderVietNam(foods);
						}

					} else if (menu == 5) {

						System.out.println("タイプを入力してください");
						String type = sc_str.nextLine();

						ArrayList<Food> foods = rm.findByType(type);

						if (num == 1) {
							view.showJapan(foods);
						} else if (num == 2) {
							view.showSrinlanka(foods);
						} else if (num == 3) {
							view.showNepal(foods);
						} else if (num == 4) {
							view.showVietNam(foods);
						}

					} else if (menu == 6) {

						System.out.print("はい、かしこまりました。ご会計は");
						if (num == 1) {
							view.totalJapan();
						} else if (num == 2) {
							view.totalSrinlanka();
						} else if (num == 3) {
							view.totalNepal();
						} else if (num == 4) {
							view.totalVietNam();
						}
						System.out.println("でございます。");
						System.out.println("ありがとうございました。");
						break;
					}
				}
			}
		}
	}

}
