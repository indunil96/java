package Restaurant.Model;

import java.util.ArrayList;

import Restaurant.Entity.Food;
import Restaurant.Entity.Table;
import Restaurant.Menu.RestaurantMenu;
import Restaurant.Table.RestaurantTable;

public class RestaurantModel {

	public ArrayList<Food> findAll() {
		RestaurantMenu rm = new RestaurantMenu();
		return rm.getData();
	}

	public ArrayList<Food> findByKeyWord(String word) {
		RestaurantMenu rm = new RestaurantMenu();
		ArrayList<Food> food = rm.getData();
		ArrayList<Food> result = new ArrayList<>();
		for (Food f : food) {
			if (f.getName().contains(word)) {
				result.add(f);
			}
		}
		return result;
	}

	public ArrayList<Food> orderById(int id) {
		RestaurantMenu rm = new RestaurantMenu();
		ArrayList<Food> food = rm.getData();
		ArrayList<Food> result = new ArrayList<>();
		for (Food f : food) {
			if (f.getId() == id) {
				result.add(f);
			}
		}
		return result;
	}

	public ArrayList<Food> findByPrice(int minprice, int maxprice) {
		RestaurantMenu rm = new RestaurantMenu();
		ArrayList<Food> food = rm.getData();
		ArrayList<Food> result = new ArrayList<>();
		for (Food f : food) {
			if (f.getPrice() >= minprice && f.getPrice() <= maxprice) {
				result.add(f);
			}
		}
		return result;
	}

	public ArrayList<Food> findByType(String type) {
		RestaurantMenu rm = new RestaurantMenu();
		ArrayList<Food> food = rm.getData();
		ArrayList<Food> result = new ArrayList<>();
		for (Food f : food) {
			if (f.getType().contains(type)) {
				result.add(f);
			}
		}
		return result;
	}

	public ArrayList<Table> findTable(int people) {
		RestaurantTable rt = new RestaurantTable();
		ArrayList<Table> tables = rt.Table();
		ArrayList<Table> result = new ArrayList<>();
		for (Table t : tables) {
			if (people <= t.getMaxCapacity() && (people + 2) >= t.getMaxCapacity() && t.isOpen() == true) {
				result.add(t);
			}
		}
		return result;
	}
}
