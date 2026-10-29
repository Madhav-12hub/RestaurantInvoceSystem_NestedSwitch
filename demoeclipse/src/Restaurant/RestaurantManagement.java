package Restaurant;

import java.util.Scanner;

public class RestaurantManagement {
	public static void main(String [] args){
		System.out.println("===================================================");
		System.out.println("         !!   WELCOME TO THE RESTAURANT  !!	     ");
		System.out.println("===================================================");
		
		Scanner Sc=new Scanner(System.in);
		String str="";
		double total_bill=0;
		
		do {
		System.out.println("Enter The Catagory : Veg/Non-veg/Starters/Drinks/Desarts");
		String catg=Sc.next();
		
		switch(catg) {
		
		case "Veg"->{
			String vyg="";
			double veg_total_price=0;
			
			do {
				
				System.out.println("Enter the items");
				String veg_items=Sc.next();
				
				switch(veg_items){
				
				case "pbm"-> {
					System.out.println("pdm - Paneer Butter Masal : Price: 250");
					double pbm_price=250;
					veg_total_price +=pbm_price;
					
				}
				case "pp" -> {
				    System.out.println("pp - Palak Paneer : Price: 220");
				    double pp_price = 220;
				    veg_total_price += pp_price;
				}

				case "ch" -> {
				    System.out.println("ch - Chole Masala : Price: 180");
				    double ch_price = 180;
				    veg_total_price += ch_price;
				}

				case "dm" -> {
				    System.out.println("dm - Dal Makhani : Price: 200");
				    double dm_price = 200;
				    veg_total_price += dm_price;
				}

				case "vp" -> {
				    System.out.println("vp - Veg Pulao : Price: 160");
				    double vp_price = 160;
				    veg_total_price += vp_price;
				}

				case "mp" -> {
				    System.out.println("mp - Matar Paneer : Price: 230");
				    double mp_price = 230;
				    veg_total_price += mp_price;
				}

				case "pm" -> {
				    System.out.println("pm - Paneer Masala : Price: 240");
				    double pm_price = 240;
				    veg_total_price += pm_price;
				}

				case "bm" -> {
				    System.out.println("bm - Bhindi Masala : Price: 170");
				    double bm_price = 170;
				    veg_total_price += bm_price;
				}
				default -> System.out.println("Sorry we Dont have The Above item");
					
				}
				
				System.out.println("Do you want to Continue your orders  clicdk (Yes/No)");
				vyg=Sc.next();
								
			}while(vyg.equalsIgnoreCase("Yes"));
			
			System.out.println("The Total Veg Bill: " +veg_total_price);
			 total_bill+=veg_total_price;
			
		}
		
		case "Non-Veg"->{
			String nvyg="";
			double non_veg_total_price=0;
			
			do {
				
				System.out.println("Enter the NON veg Items.");
				String non_veg_items="";
				
				switch(non_veg_items) {
					
				case "cdb"->{
					System.out.println("cdb-Chicken Dum Biriyani: Price: 300/-");
					double cdb_price=300;
					non_veg_total_price=+cdb_price;	
				}
				case "mcb" -> {
				    System.out.println("mcb - Mutton Dum Biriyani: Price: 350/-");
				    double mcb_price = 350;
				    non_veg_total_price += mcb_price;
				}

				case "fry" -> {
				    System.out.println("fry - Chicken Fry: Price: 250/-");
				    double fry_price = 250;
				    non_veg_total_price += fry_price;
				}

				case "ctk" -> {
				    System.out.println("ctk - Chicken Tikka: Price: 280/-");
				    double ctk_price = 280;
				    non_veg_total_price += ctk_price;
				}

				case "c65" -> {
				    System.out.println("c65 - Chicken 65: Price: 220/-");
				    double c65_price = 220;
				    non_veg_total_price += c65_price;
				}

				case "cf" -> {
				    System.out.println("cf - Chicken Fry Piece Biryani: Price: 280/-");
				    double cf_price = 280;
				    non_veg_total_price += cf_price;
				}

				case "pbf" -> {
				    System.out.println("pbf - Prawns Biryani: Price: 380/-");
				    double pbf_price = 380;
				    non_veg_total_price += pbf_price;
				}

				case "fb" -> {
				    System.out.println("fb - Fish Biryani: Price: 320/-");
				    double fb_price = 320;
				    non_veg_total_price += fb_price;
				}

				case "egb" -> {
				    System.out.println("egb - Egg Biryani: Price: 180/-");
				    double egb_price = 180;
				    non_veg_total_price += egb_price;
				}
				default -> System.out.println("Sorry We Dont Have the Iteams in Our Menu Card!!");				
				}
				
				System.out.println("Do you Want to Continue the Orders? (Yes/No)");
				nvyg=Sc.next();
			}while(nvyg.equalsIgnoreCase("Yes"));
				System.out.println("The Total Non Veg Bill :" +non_veg_total_price);
				 total_bill+=non_veg_total_price;	
		}
		
		case "Drinks"->{
			String stat="";
			double Drink_total_bill=0;
			
			do {
				System.out.println("Enter the starters Iteams");
				String drinks=Sc.next();
				
				switch(drinks) {
				
				case "sprite" -> {
					System.out.println("sprite(The Strong CHeer Up) Price: 25/-");
					double sprite=25;
					Drink_total_bill+=sprite;	
				}
				case "coke" -> {
				    System.out.println("coke (Coca-Cola) Price: 30/-");
				    double coke = 30;
				    Drink_total_bill += coke;
				}

				case "pepsi" -> {
				    System.out.println("pepsi (Pepsi) Price: 30/-");
				    double pepsi = 30;
				    Drink_total_bill += pepsi;
				}

				case "maaza" -> {
				    System.out.println("maaza (Mango Drink) Price: 25/-");
				    double maaza = 25;
				    Drink_total_bill += maaza;
				}

				case "thumsup" -> {
				    System.out.println("thumsup (Thums Up) Price: 35/-");
				    double thumsup = 35;
				    Drink_total_bill += thumsup;
				}

				case "lassi" -> {
				    System.out.println("lassi (Sweet Lassi) Price: 40/-");
				    double lassi = 40;
				    Drink_total_bill += lassi;
				}
				
				default -> System.out.println("We Dont offer Such Drink!! Sorry");
				}
				
				System.out.println("Do you want to continue... Click Yes or No");
				stat=Sc.next();				
				
			}while(stat.equalsIgnoreCase("Yes"));
			
			System.out.println("The total staters Bill : " +Drink_total_bill);
			total_bill+=Drink_total_bill;
		}
		
		case "Starters"->{
			String nxp="";
			double Starters_total_bill=0;
			
			do {
				System.out.println("Enter the Starters details");
				String starter=Sc.next();
				
				switch(starter) {
				
				case "c65" -> {
					System.out.println("c65 Chicken 65     price: 230/-");
					double c65_price=230;
					Starters_total_bill+=c65_price;
					
				}
				
				case "chf" -> {
				    System.out.println("chf Chicken Fry     price: 250/-");
				    double chf_price = 250;
				    Starters_total_bill += chf_price;
				}

				case "ct" -> {
				    System.out.println("ct Chicken Tikka     price: 280/-");
				    double ct_price = 280;
				    Starters_total_bill += ct_price;
				}

				case "cp" -> {
				    System.out.println("cp Chilli Paneer     price: 200/-");
				    double cp_price = 200;
				    Starters_total_bill += cp_price;
				}

				case "vp" -> {
				    System.out.println("vp Veg Pakora     price: 150/-");
				    double vp_price = 150;
				    Starters_total_bill += vp_price;
				}

				case "gm" -> {
				    System.out.println("gm Gobi Manchurian     price: 180/-");
				    double gm_price = 180;
				    Starters_total_bill += gm_price;
				}

				case "pp" -> {
				    System.out.println("pp Paneer Pakora     price: 190/-");
				    double pp_price = 190;
				    Starters_total_bill += pp_price;
				}
				
				default -> System.out.println("Sorry that iteam is not availabale");
				}
				System.out.println("Do you wanna order something more iteams like deserts");
				nxp=Sc.next();
				
			}while(nxp.equalsIgnoreCase("Yes"));
				System.out.println("The Total Startes Bill : " +Starters_total_bill);
				total_bill+=Starters_total_bill;
		}
		case "Desarts"->{
			String des="";
			double desart_total_price=0;
			
			do {
				System.out.println("Enter the Desart Iteams");
				String desart=Sc.next();
				
				switch(desart) {
				
				case "Mbc"->{
					System.out.println("Mbc Mango Barfi Cakepie   price: 290/-");
					double Mbc_price=290;
					desart_total_price+=Mbc_price;	
				}
				
				case "bc" -> {
				    System.out.println("bc Black Forest Cake   price: 250/-");
				    double bc_price = 250;
				    desart_total_price += bc_price;
				}

				case "gc" -> {
				    System.out.println("gc Gulab Jamun Cake   price: 220/-");
				    double gc_price = 220;
				    desart_total_price += gc_price;
				}

				case "ic" -> {
				    System.out.println("ic Ice Cream   price: 100/-");
				    double ic_price = 100;
				    desart_total_price += ic_price;
				}

				case "br" -> {
				    System.out.println("br Brownie   price: 150/-");
				    double br_price = 150;
				    desart_total_price += br_price;
				}

				case "rp" -> {
				    System.out.println("rp Rasmalai   price: 120/-");
				    double rp_price = 120;
				    desart_total_price += rp_price;
				}
				 default -> System.out.println("This product is not available");
				}
				
				System.out.println("Do you wann Continute this orders if Yes Click Yes / No");
				des=Sc.next();
				
			}while(des.equalsIgnoreCase("Yes"));
			
			System.out.println("The Desarts Bill : " +desart_total_price);
			total_bill+=desart_total_price;
		}	
		}
		
		  System.out.println("\nDo you want to order from another category? (Yes/No)");
		    str = Sc.next();
		}while(str.equalsIgnoreCase("yes"));
		
		
		System.out.println("============================================");
		System.out.println("              ORDER DETAILS                 ");
		System.out.println("============================================");
		
		
		System.out.println("Total Bill Before Discount : Rs. " + total_bill);
		
		
		double discount = 0;
		double final_bill = total_bill;
		
		
		if(total_bill >2000) {
			 discount = total_bill * 20 / 100;
			 final_bill = total_bill - discount;
			 
			 System.out.println("Congratulations! You got a 20% discount.");
			 System.out.println("Discount Amount            : Rs. " + discount);
		}else {
			System.out.println("No discount applicable.");
		    System.out.println("Order above Rs. 2000 to get a 20% discount!");
		}
		
		System.out.println("--------------------------------------------");
		System.out.println("Final Bill After Discount  : Rs. " + final_bill);
		System.out.println("============================================");
		System.out.println("       THANK YOU! VISIT AGAIN!              ");
		System.out.println("============================================");
		
		
	}
}
