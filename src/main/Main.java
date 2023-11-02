package main;

import java.util.Scanner;

import factory.Factory;
import model.Bake;
import singleton.ViewAll;

public class Main {

	Scanner scan = new Scanner(System.in);
	
	ViewAll viewAllBake = ViewAll.getInstance();
	
	public Main() {
		
		int input;
		
		do {
			mainMenu();
			input = scan.nextInt(); scan.nextLine();
			
			switch(input) {
			
				case 1:
					menu1();
					break;
					
				case 2:
					menu2();
					break;
					
				case 3:
					System.out.println("Thank you for using Nom Nom service...");
					break;
					
			}
		} while(input != 3);
		
		
	}
	
	public void menu1() {
		
		String type, name, softness, confirm, top1 = null, top2 = null, top3 = null, payment;
		int typeValid = 0, softvalid = 0, confValid = 0, payValid = 0;
		float price;
		
		do {
			System.out.print("Input Confectionary Type : ");
			type = scan.nextLine();
			
			if(type.equals("Cupcake")) {
				typeValid = 1;
			} else if(type.equals("Tart")) {
				typeValid = 2;
			}		
		} while(typeValid < 1 || typeValid > 2);
		
		do {
			System.out.print("Input Confectionary Name : ");
			name = scan.nextLine();
		} while (name.length() < 5 || name.length() > 15);
		
		do {
			System.out.print("input Confectionary Softness : ");
			softness = scan.nextLine();
			
			if(softness.equals("Fluffy")) {
				softvalid = 1;
			} else if(softness.equals("Medium")) {
				softvalid = 2;
			} else if(softness.equals("Hard")) {
				softvalid = 3;
			}
		} while(softvalid < 1 || softvalid > 3);
		
		do {
			System.out.print("Add additional topping [Y | N] : ");
			confirm = scan.nextLine();
			
			if(confirm.equals("Y")) {
				confValid = 1;
				
				do {
					System.out.print("Input topping 1 : ");
					top1 = scan.nextLine();
				} while(top1.length() < 1 || top1.length() > 10);
				
				do {
					System.out.print("Input topping 2 : ");
					top2 = scan.nextLine();
				} while(top2.length() < 1 || top2.length() > 10);
				
				
				do {
					System.out.print("Input topping 3 : ");
					top3 = scan.nextLine();
				} while(top3.length() < 1 || top3.length() > 10);
				
				
			} else if(confirm.equals("N")) {
				confValid = 2;
			}
		} while(confValid < 1 || confValid > 2);
		
		do {
			System.out.print("Input confectionary Price : ");
			price = scan.nextFloat(); scan.nextLine();
		} while(price < 10.0 || price > 50.0);
		
		do {
			System.out.print("What kind of payment : ");
			payment = scan.nextLine();
			
			if(payment.equals("Cash")) {
				payValid = 1;
			} else if(payment.equals("Transfer")) {
				payValid = 2;
			} else if(payment.equals("Crypto")) {
				payValid = 3;
			}
			
		} while(payValid < 1 || payValid > 3);
		
		System.out.println("Confectionary done...");
		
		Bake bakery = null;
		
		Factory bakeryFactory = new Factory();
		
		bakery = bakeryFactory.createBakery(type, name, softness, top1, top2, top3, payment, price);
		
		viewAllBake.getGetBakeList().add(bakery);
	}

	public void menu2() {
		viewAllBake.viewAll();
	}

	public void mainMenu() {
		System.out.println("Nom Nom Co");
		System.out.println("===========");
		System.out.println("1. Bake Confectionary");
		System.out.println("2. View All Confectionary");
		System.out.println("3. Exit");
		System.out.print(">> ");
	}
	
	public void cls() {
		for(int i = 0;i<10;i++) {
			System.out.println();
		}
	}

	public static void main(String[] args) {
		new Main();
	}

}
