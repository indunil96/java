package Restaurant.Menu;

import java.util.ArrayList;

import Restaurant.Entity.Food;

public class RestaurantMenu {

	public ArrayList<Food> getData() {
		ArrayList<Food> menu = new ArrayList<>();

		Food fv1 = new Food();
		fv1.setId(1);
		fv1.setName("PHO");
		fv1.setCountry("VIET NAM");
		fv1.setPrice(880);
		fv1.setType("麵");
		menu.add(fv1);

		Food fv2 = new Food();
		fv2.setId(2);
		fv2.setName("BUN BO HUE");
		fv2.setCountry("VIET NAM");
		fv2.setPrice(990);
		fv2.setType("麵");
		menu.add(fv2);

		Food fv3 = new Food();
		fv3.setId(3);
		fv3.setName("BUN CA");
		fv3.setCountry("VIET NAM");
		fv3.setPrice(990);
		fv3.setType("麵");
		menu.add(fv3);

		Food fv4 = new Food();
		fv4.setId(4);
		fv4.setName("BUN DAU MAM TOM");
		fv4.setCountry("VIET NAM");
		fv4.setPrice(990);
		fv4.setType("麵");
		menu.add(fv4);

		Food fv5 = new Food();
		fv5.setId(5);
		fv5.setName("BUN TRON THIT NUONG");
		fv5.setCountry("VIET NAM");
		fv5.setPrice(880);
		fv5.setType("麵");
		menu.add(fv5);

		Food fv6 = new Food();
		fv6.setId(6);
		fv6.setName("BUN CHA HA NOI");
		fv6.setCountry("VIET NAM");
		fv6.setPrice(880);
		fv6.setType("麵");
		menu.add(fv6);

		Food fv7 = new Food();
		fv7.setId(7);
		fv7.setName("BANH MI THAP CAM");
		fv7.setCountry("VIET NAM");
		fv7.setPrice(770);
		fv7.setType("パン");
		menu.add(fv7);

		Food fv8 = new Food();
		fv8.setId(8);
		fv8.setName("BANH MI THIT NUONG");
		fv8.setCountry("VIET NAM");
		fv8.setPrice(660);
		fv8.setType("パン");
		menu.add(fv8);

		Food fv9 = new Food();
		fv9.setId(9);
		fv9.setName("BANH MI PATE");
		fv9.setCountry("VIET NAM");
		fv9.setPrice(660);
		fv9.setType("パン");
		menu.add(fv9);

		Food fv10 = new Food();
		fv10.setId(10);
		fv10.setName("COM RANG DUONG CHAU");
		fv10.setCountry("VIET NAM");
		fv10.setPrice(770);
		fv10.setType("チャーハン");
		menu.add(fv10);

		Food fv11 = new Food();
		fv11.setId(11);
		fv11.setName("COM RANG HAI SAN");
		fv11.setCountry("VIET NAM");
		fv11.setPrice(990);
		fv11.setType("チャーハン");
		menu.add(fv11);

		Food fv12 = new Food();
		fv12.setId(12);
		fv12.setName("COM BO LUC LAC");
		fv12.setCountry("VIET NAM");
		fv12.setPrice(990);
		fv12.setType("チャーハン");
		menu.add(fv12);

		Food fv13 = new Food();
		fv13.setId(13);
		fv13.setName("COM SUON CHUA NGOT");
		fv13.setCountry("VIET NAM");
		fv13.setPrice(990);
		fv13.setType("チャーハン");
		menu.add(fv13);

		Food fv14 = new Food();
		fv14.setId(14);
		fv14.setName("XOI THAP CAM");
		fv14.setCountry("VIET NAM");
		fv14.setPrice(770);
		fv14.setType("おこわ");
		menu.add(fv14);

		Food fv15 = new Food();
		fv15.setId(15);
		fv15.setName("XOI CHA MUC");
		fv15.setCountry("VIET NAM");
		fv15.setPrice(770);
		fv15.setType("おこわ");
		menu.add(fv15);

		Food fv16 = new Food();
		fv16.setId(16);
		fv16.setName("16");
		fv16.setCountry("VIET NAM");
		fv16.setPrice(330);
		fv16.setType("コーヒー");
		menu.add(fv16);

		Food fv17 = new Food();
		fv17.setId(17);
		fv17.setName("MILK CAFE");
		fv17.setCountry("VIET NAM");
		fv17.setPrice(390);
		fv17.setType("コーヒー");
		menu.add(fv17);

		Food fv18 = new Food();
		fv18.setId(18);
		fv18.setName("EGG CAFE");
		fv18.setCountry("VIET NAM");
		fv18.setPrice(490);
		fv18.setType("コーヒー");
		menu.add(fv18);

		Food fv19 = new Food();
		fv19.setId(19);
		fv19.setName("BO HUC");
		fv19.setCountry("VIET NAM");
		fv19.setPrice(440);
		fv19.setType("ジュース");
		menu.add(fv19);

		Food fv20 = new Food();
		fv20.setId(20);
		fv20.setName("STING");
		fv20.setCountry("VIET NAM");
		fv20.setPrice(440);
		fv20.setType("ジュース");
		menu.add(fv20);

		Food fs1 = new Food();
		fs1.setId(1);
		fs1.setName("kottu");
		fs1.setCountry("スリランカ");
		fs1.setType("とり肉と野菜");
		fs1.setPrice(800);
		menu.add(fs1);

		Food fs2 = new Food();
		fs2.setId(2);
		fs2.setName("スリランカフライドライス");
		fs2.setCountry("スリランカ");
		fs2.setType("とり肉と野菜とお米");
		fs2.setPrice(700);
		menu.add(fs2);

		Food fs3 = new Food();
		fs3.setId(3);
		fs3.setName("スリランカ　カレーライス");
		fs3.setCountry("スリランカ");
		fs3.setPrice(500);
		fs3.setType("カレーライス");
		menu.add(fs3);

		Food fs4 = new Food();
		fs4.setId(4);
		fs4.setName("ミルクライス");
		fs4.setCountry("スリランカ");
		fs4.setPrice(400);
		fs4.setType("牛乳とお米");
		menu.add(fs4);

		Food fs5 = new Food();
		fs5.setId(5);
		fs5.setName("idiappa");
		fs5.setCountry("スリランカ");
		fs5.setPrice(500);
		fs5.setType("麵");
		menu.add(fs5);

		Food fs6 = new Food();
		fs6.setId(6);
		fs6.setName("badairigu");
		fs6.setCountry("スリランカ");
		fs6.setPrice(400);
		fs6.setType("野菜");
		menu.add(fs6);

		Food fs7 = new Food();
		fs7.setId(7);
		fs7.setName("idiappa kottu");
		fs7.setCountry("スリランカ");
		fs7.setPrice(1000);
		fs7.setType("野菜と麵");
		menu.add(fs7);

		Food fs8 = new Food();
		fs8.setId(8);
		fs8.setName("parata");
		fs8.setCountry("スリランカ");
		fs8.setPrice(300);
		fs8.setType("ナ－ン");
		menu.add(fs8);

		Food fs9 = new Food();
		fs9.setId(9);
		fs9.setName("faluda");
		fs9.setCountry("スリランカ");
		fs9.setPrice(400);
		fs9.setType("ドリンク");
		menu.add(fs9);

		Food fs10 = new Food();
		fs10.setId(10);
		fs10.setName("mixed seafood rice");
		fs10.setCountry("スリランカ");
		fs10.setPrice(1300);
		fs10.setType("シーフード");
		menu.add(fs10);

		Food fs11 = new Food();
		fs11.setId(11);
		fs11.setName("GalArakku");
		fs11.setCountry("スリランカ");
		fs11.setPrice(600);
		fs11.setType("お酒");
		menu.add(fs11);

		Food fs12 = new Food();
		fs12.setId(12);
		fs12.setName("egg rotti");
		fs12.setCountry("スリランカ");
		fs12.setPrice(300);
		fs12.setType("卵とナーン");
		menu.add(fs12);

		Food fs13 = new Food();
		fs13.setId(13);
		fs13.setName("seafood noodle curry");
		fs13.setCountry("スリランカ");
		fs13.setPrice(1100);
		fs13.setType("麵とシーフード");
		menu.add(fs13);

		Food fs14 = new Food();
		fs14.setId(14);
		fs14.setName("ラッシー");
		fs14.setCountry("スリランカ");
		fs14.setPrice(300);
		fs14.setType("ドリンク");
		menu.add(fs14);

		Food fs15 = new Food();
		fs15.setId(15);
		fs15.setName("豚肉ロースステーキカレー");
		fs15.setCountry("スリランカ");
		fs15.setPrice(1400);
		fs15.setType("豚肉");
		menu.add(fs15);

		Food fs16 = new Food();
		fs16.setId(16);
		fs16.setName("cheese kottu");
		fs16.setCountry("スリランカ");
		fs16.setPrice(1000);
		fs16.setType("チーズとkottu");
		menu.add(fs16);

		Food fs17 = new Food();
		fs17.setId(17);
		fs17.setName("rotti");
		fs17.setCountry("スリランカ");
		fs17.setPrice(300);
		fs17.setType("rotti");
		menu.add(fs17);

		Food fs18 = new Food();
		fs18.setId(18);
		fs18.setName("ライオンストロングビール");
		fs18.setCountry("スリランカ");
		fs18.setPrice(300);
		fs18.setType("ビール");
		menu.add(fs18);

		Food fs19 = new Food();
		fs19.setId(19);
		fs19.setName("カールスバーグラガー");
		fs19.setCountry("スリランカ");
		fs19.setPrice(270);
		fs19.setType("ビール");
		menu.add(fs19);

		Food fs20 = new Food();
		fs20.setId(20);
		fs20.setName("ライオンラガー");
		fs20.setCountry("スリランカ");
		fs20.setPrice(270);
		fs20.setType("ビール");
		menu.add(fs20);

		Food fj1 = new Food();
		fj1.setId(1);
		fj1.setName("Sushi");
		fj1.setCountry("日本");
		fj1.setPrice(2000);
		fj1.setType("Seafood");
		menu.add(fj1);

		Food fj2 = new Food();
		fj2.setId(2);
		fj2.setName("Ramen");
		fj2.setCountry("日本");
		fj2.setPrice(800);
		fj2.setType("Noodle Soup");
		menu.add(fj2);

		Food fj3 = new Food();
		fj3.setId(3);
		fj3.setName("Tempura");
		fj3.setCountry("日本");
		fj3.setPrice(1500);
		fj3.setType("Battered Fried");
		menu.add(fj3);

		Food fj4 = new Food();
		fj4.setId(4);
		fj4.setName("Sashimi");
		fj4.setCountry("日本");
		fj4.setPrice(2000);
		fj4.setType("Raw Fish");
		menu.add(fj4);

		Food fj5 = new Food();
		fj5.setId(5);
		fj5.setName("Udon");
		fj5.setCountry("日本");
		fj5.setPrice(500);
		fj5.setType("Noodle Soup");
		menu.add(fj5);

		Food fj6 = new Food();
		fj6.setId(6);
		fj6.setName("Soba");
		fj6.setCountry("日本");
		fj6.setPrice(500);
		fj6.setType("Noodle Soup");
		menu.add(fj6);

		Food fj7 = new Food();
		fj7.setId(7);
		fj7.setName("Yakitori");
		fj7.setCountry("日本");
		fj7.setPrice(250);
		fj7.setType("Grilled Chicken");
		menu.add(fj7);

		Food fj8 = new Food();
		fj8.setId(8);
		fj8.setName("Okonomiyaki");
		fj8.setCountry("日本");
		fj8.setPrice(700);
		fj8.setType("Pancake");
		menu.add(fj8);

		Food fj9 = new Food();
		fj9.setId(9);
		fj9.setName("Takoyaki");
		fj9.setCountry("日本");
		fj9.setPrice(550);
		fj9.setType("Snack");
		menu.add(fj9);

		Food fj10 = new Food();
		fj10.setId(10);
		fj10.setName("Tonkatsu");
		fj10.setCountry("日本");
		fj10.setPrice(800);
		fj10.setType("Fried Pork");
		menu.add(fj10);

		Food fj11 = new Food();
		fj11.setId(11);
		fj11.setName("Gyudon");
		fj11.setCountry("日本");
		fj11.setPrice(500);
		fj11.setType("Rice Bowl");
		menu.add(fj11);

		Food fj12 = new Food();
		fj12.setId(12);
		fj12.setName("Shabu-shabu");
		fj12.setCountry("日本");
		fj12.setPrice(3500);
		fj12.setType("Hot Pot");
		menu.add(fj12);

		Food fj13 = new Food();
		fj13.setId(13);
		fj13.setName("Sukiyaki");
		fj13.setCountry("日本");
		fj13.setPrice(3500);
		fj13.setType("Hot Pot");
		menu.add(fj13);

		Food fj14 = new Food();
		fj14.setId(14);
		fj14.setName("Kaiseki");
		fj14.setCountry("日本");
		fj14.setPrice(20000);
		fj14.setType("Multi-Course");
		menu.add(fj14);

		Food fj15 = new Food();
		fj15.setId(15);
		fj15.setName("Unagi");
		fj15.setCountry("日本");
		fj15.setPrice(3500);
		fj15.setType("Grilled Eel");
		menu.add(fj15);

		Food fj16 = new Food();
		fj16.setId(16);
		fj16.setName("Onigiri");
		fj16.setCountry("日本");
		fj16.setPrice(200);
		fj16.setType("Rice Ball");
		menu.add(fj16);

		Food fj17 = new Food();
		fj17.setId(17);
		fj17.setName("Gyoza");
		fj17.setCountry("日本");
		fj17.setPrice(650);
		fj17.setType("Dumplings");
		menu.add(fj17);

		Food fj18 = new Food();
		fj18.setId(18);
		fj18.setName("Nabe");
		fj18.setCountry("日本");
		fj18.setPrice(2500);
		fj18.setType("Hot Pot");
		menu.add(fj18);

		Food fj19 = new Food();
		fj19.setId(19);
		fj19.setName("Matcha");
		fj19.setCountry("日本");
		fj19.setPrice(550);
		fj19.setType("Beverage");
		menu.add(fj19);

		Food fj20 = new Food();
		fj20.setId(20);
		fj20.setName("Taiyaki");
		fj20.setCountry("日本");
		fj20.setPrice(350);
		fj20.setType("Sweet Snack");
		menu.add(fj20);

		Food fj21 = new Food();
		fj21.setId(21);
		fj21.setName("Dorayaki");
		fj21.setCountry("日本");
		fj21.setPrice(300);
		fj21.setType("Sweet Snack");
		menu.add(fj21);

		Food fj22 = new Food();
		fj22.setId(22);
		fj22.setName("Mochi");
		fj22.setCountry("日本");
		fj22.setPrice(200);
		fj22.setType("Sweet Snack");
		menu.add(fj22);

		Food fj23 = new Food();
		fj23.setId(23);
		fj23.setName("Yakisoba");
		fj23.setCountry("日本");
		fj23.setPrice(750);
		fj23.setType("Stir-Fried Noodles");
		menu.add(fj23);

		Food fj24 = new Food();
		fj24.setId(24);
		fj24.setName("Chawanmushi");
		fj24.setCountry("日本");
		fj24.setPrice(900);
		fj24.setType("Steamed Custard");
		menu.add(fj24);

		Food fj25 = new Food();
		fj25.setId(25);
		fj25.setName("Miso Soup");
		fj25.setCountry("日本");
		fj25.setPrice(250);
		fj25.setType("Soup");
		menu.add(fj25);

		Food fn1 = new Food();
		fn1.setId(1);
		fn1.setName("Sukuti");
		fn1.setCountry("ネパール");
		fn1.setPrice(300);
		fn1.setType("Snacks");
		menu.add(fn1);

		Food fn2 = new Food();
		fn2.setId(2);
		fn2.setName("Chowmein");
		fn2.setCountry("ネパール");
		fn2.setPrice(150);
		fn2.setType("Snacks");
		menu.add(fn2);

		Food fn3 = new Food();
		fn3.setId(3);
		fn3.setName("Thukpa");
		fn3.setCountry("ネパール");
		fn3.setPrice(150);
		fn3.setType("Snacks");
		menu.add(fn3);

		Food fn4 = new Food();
		fn4.setId(4);
		fn4.setName("Momo");
		fn4.setCountry("ネパール");
		fn4.setPrice(150);
		fn4.setType("Snacks");
		menu.add(fn4);

		Food fn5 = new Food();
		fn5.setId(5);
		fn5.setName("Chowmein");
		fn5.setCountry("ネパール");
		fn5.setPrice(150);
		fn5.setType("Snacks");
		menu.add(fn5);

		Food fn6 = new Food();
		fn6.setId(6);
		fn6.setName("Laphing");
		fn6.setCountry("ネパール");
		fn6.setPrice(150);
		fn6.setType("Snacks");
		menu.add(fn6);

		Food fn7 = new Food();
		fn7.setId(7);
		fn7.setName("Chatpate");
		fn7.setCountry("ネパール");
		fn7.setPrice(80);
		fn7.setType("Snacks");
		menu.add(fn7);

		Food fn8 = new Food();
		fn8.setId(8);
		fn8.setName("PaniPuri");
		fn8.setCountry("ネパール");
		fn8.setPrice(100);
		fn8.setType("Snacks");
		menu.add(fn8);

		Food fn9 = new Food();
		fn9.setId(9);
		fn9.setName("Khaja Set");
		fn9.setCountry("ネパール");
		fn9.setPrice(350);
		fn9.setType("Snacks");
		menu.add(fn9);

		Food fn10 = new Food();
		fn10.setId(10);
		fn10.setName("Selroti");
		fn10.setCountry("ネパール");
		fn10.setPrice(50);
		fn10.setType("Snacks");
		menu.add(fn10);

		Food fn11 = new Food();
		fn11.setId(11);
		fn11.setName("Chilly Momo");
		fn11.setCountry("ネパール");
		fn11.setPrice(250);
		fn11.setType("Snacks");
		menu.add(fn11);

		Food fn12 = new Food();
		fn12.setId(12);
		fn12.setName("Tea/Coffee");
		fn12.setCountry("ネパール");
		fn12.setPrice(50 / 100);
		fn12.setType("Breakfast");
		menu.add(fn12);

		Food fn13 = new Food();
		fn13.setId(13);
		fn13.setName("Bread Jam");
		fn13.setCountry("ネパール");
		fn13.setPrice(50);
		fn13.setType("Breakfast");
		menu.add(fn13);

		Food fn14 = new Food();
		fn14.setId(14);
		fn14.setName("Boiled Egg");
		fn14.setCountry("ネパール");
		fn14.setPrice(60);
		fn14.setType("Breakfast");
		menu.add(fn14);

		Food fn15 = new Food();
		fn15.setId(15);
		fn15.setName("Sandwich");
		fn15.setCountry("ネパール");
		fn15.setPrice(150);
		fn15.setType("Breakfast");
		menu.add(fn15);

		Food fn16 = new Food();
		fn16.setId(16);
		fn16.setName("Thakali Set");
		fn16.setCountry("ネパール");
		fn16.setPrice(1150);
		fn16.setType("Lunch/Dinner");
		menu.add(fn16);

		Food fn17 = new Food();
		fn17.setId(17);
		fn17.setName("Nepali Set");
		fn17.setCountry("ネパール");
		fn17.setPrice(950);
		fn17.setType("Lunch/Dinner");
		menu.add(fn17);

		Food fn18 = new Food();
		fn18.setId(18);
		fn18.setName("Chicken Thali Set");
		fn18.setCountry("ネパール");
		fn18.setPrice(950);
		fn18.setType("Lunch/Dinner");
		menu.add(fn18);

		Food fn19 = new Food();
		fn19.setId(19);
		fn19.setName("Mutton Thali Set");
		fn19.setCountry("ネパール");
		fn19.setPrice(1150);
		fn19.setType("Lunch/Dinner");
		menu.add(fn19);

		Food fn20 = new Food();
		fn20.setId(20);
		fn20.setName("Pork Thali Set");
		fn20.setCountry("ネパール");
		fn20.setPrice(1050);
		fn20.setType("Lunch/Dinner");
		menu.add(fn20);

		Food fn21 = new Food();
		fn21.setId(21);
		fn21.setName("Vegetable Thali Set");
		fn21.setCountry("ネパール");
		fn21.setPrice(850);
		fn21.setType("Lunch/Dinner");
		menu.add(fn21);

		Food fn22 = new Food();
		fn22.setId(22);
		fn22.setName("Thakali Set");
		fn22.setCountry("ネパール");
		fn22.setPrice(1150);
		fn22.setType("Meal");
		menu.add(fn22);

		Food fn23 = new Food();
		fn23.setId(23);
		fn23.setName("Thakali Set");
		fn23.setCountry("ネパール");
		fn23.setPrice(1150);
		fn23.setType("Meal");
		menu.add(fn23);

		Food fn24 = new Food();
		fn24.setId(24);
		fn24.setName("Thakali Set");
		fn24.setCountry("ネパール");
		fn24.setPrice(1150);
		fn24.setType("Meal");
		menu.add(fn24);

		return menu;

	}

}
