package Restaurant.Table;

import java.util.ArrayList;
import java.util.Random;

import Restaurant.Entity.Table;

public class RestaurantTable {

	public ArrayList<Table> Table() {
		Random rand = new Random();
		ArrayList<Table> tables = new ArrayList<>();

		Table t1 = new Table();
		t1.setNum(1);
		t1.setMaxCapacity(2);
		t1.setOpen(rand.nextBoolean());
		t1.setDuration(90);
		tables.add(t1);

		Table t2 = new Table();
		t2.setNum(2);
		t2.setMaxCapacity(2);
		t2.setOpen(rand.nextBoolean());
		t2.setDuration(90);
		tables.add(t2);

		Table t3 = new Table();
		t3.setNum(3);
		t3.setMaxCapacity(2);
		t3.setOpen(rand.nextBoolean());
		t3.setDuration(90);
		tables.add(t3);

		Table t4 = new Table();
		t4.setNum(4);
		t4.setMaxCapacity(2);
		t4.setOpen(rand.nextBoolean());
		t4.setDuration(90);
		tables.add(t4);

		Table t5 = new Table();
		t5.setNum(5);
		t5.setMaxCapacity(2);
		t5.setOpen(rand.nextBoolean());
		t5.setDuration(90);
		tables.add(t5);

		Table t6 = new Table();
		t6.setNum(6);
		t6.setMaxCapacity(4);
		t6.setOpen(rand.nextBoolean());
		t6.setDuration(120);
		tables.add(t6);

		Table t7 = new Table();
		t7.setNum(7);
		t7.setMaxCapacity(4);
		t7.setOpen(rand.nextBoolean());
		t7.setDuration(120);
		tables.add(t7);

		Table t8 = new Table();
		t8.setNum(8);
		t8.setMaxCapacity(4);
		t8.setOpen(rand.nextBoolean());
		t8.setDuration(120);
		tables.add(t8);

		Table t9 = new Table();
		t9.setNum(9);
		t9.setMaxCapacity(6);
		t9.setOpen(rand.nextBoolean());
		t9.setDuration(150);
		tables.add(t9);

		Table t10 = new Table();
		t10.setNum(10);
		t10.setMaxCapacity(6);
		t10.setOpen(rand.nextBoolean());
		t10.setDuration(150);
		tables.add(t10);

		return tables;
	}

}