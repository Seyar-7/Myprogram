package OnlyPractice;

import java.util.ArrayList;
import java.util.Scanner;


public class Main {
	
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		ArrayList <Bank> bank = new  ArrayList<Bank>();
		
		Bank bank1 = new Bank("BankOfAmerica","Seyar",50000,1111);
		
		bank.add(bank1);
		bank.add(new Bank("BankOfAmerica","Morid",40000,1112));
		bank.add(new Bank("BankOfAmerica","Toryalai",60000,1113));
		bank.add(new Bank("BankOfAmerica","Baryalai",70000,1114));
		
		for(Bank i:bank) {
			System.out.println(i);
		}
		
		String select = scan.next();
		String select1;
		int withdraw =0;
		int ID = 0;
		String correct;
		
		//seyar
		if(select.equalsIgnoreCase("Seyar")) {
			System.out.println("how much money you wanna transfer to?");
			
			withdraw = scan.nextInt();
			
			System.out.println("Who do you wanna transfer your money to?");
			select1 = scan.next();
			System.out.println("Enter his/her ID_Number?");
			ID = scan.nextInt();
			System.out.println("Make sure this ID is correct?");
			System.out.println(ID);
			System.out.println("Yes Or No");
			correct = scan.next();
			if(correct.equalsIgnoreCase("yes")) {
			if(select1.equalsIgnoreCase("Morid")&&ID == bank.get(1).ID) {
			 bank.get(0).setWithdraw(withdraw);
			 bank.get(1).setDeposit(withdraw);
			}
			if(select1.equalsIgnoreCase("toryalai")&&ID == bank.get(2).ID) {
				 bank.get(0).setWithdraw(withdraw);
				 bank.get(2).setDeposit(withdraw);
				}
			if(select1.equalsIgnoreCase("baryalai")&&ID == bank.get(3).ID) {
				 bank.get(0).setWithdraw(withdraw);
				 bank.get(3).setDeposit(withdraw);	
				}
		}
		}
		
		//morid
		if(select.equalsIgnoreCase("morid")) {
			System.out.println("how much money you wanna transfer to?");
			
			withdraw = scan.nextInt();
			
			System.out.println("Who do you wanna transfer your money to?");
			select1 = scan.next();
			System.out.println("Enter his/her ID_Number?");
			ID = scan.nextInt();
			System.out.println("Make sure this ID is correct?");
			System.out.println(ID);
			System.out.println("Yes Or No");
			correct = scan.next();
			if(correct.equalsIgnoreCase("yes")) {
			if(select1.equalsIgnoreCase("seyar")&&ID == bank.get(0).ID) {
			 bank.get(1).setWithdraw(withdraw);
			 bank.get(0).setDeposit(withdraw);
			}
			if(select1.equalsIgnoreCase("toryalai")&&ID == bank.get(2).ID) {
				 bank.get(1).setWithdraw(withdraw);
				 bank.get(2).setDeposit(withdraw);
				}
			if(select1.equalsIgnoreCase("baryalai")&&ID == bank.get(3).ID) {
				 bank.get(1).setWithdraw(withdraw);
				 bank.get(3).setDeposit(withdraw);	
				}
		}
		}
		
		//toryalai
		if(select.equalsIgnoreCase("toryalai")) {
			System.out.println("how much money you wanna transfer to?");
			
			withdraw = scan.nextInt();
			
			System.out.println("Who do you wanna transfer your money to?");
			select1 = scan.next();
			System.out.println("Enter his/her ID_Number?");
			ID = scan.nextInt();
			System.out.println("Make sure this ID is correct?");
			System.out.println(ID);
			System.out.println("Yes Or No");
			correct = scan.next();
			if(correct.equalsIgnoreCase("yes")) {
			if(select1.equalsIgnoreCase("seyar")&&ID == bank.get(0).ID) {
			 bank.get(2).setWithdraw(withdraw);
			 bank.get(0).setDeposit(withdraw);
			}
			if(select1.equalsIgnoreCase("morid")&&ID == bank.get(1).ID) {
				 bank.get(2).setWithdraw(withdraw);
				 bank.get(1).setDeposit(withdraw);
				}
			if(select1.equalsIgnoreCase("baryalai")&&ID == bank.get(3).ID) {
				 bank.get(2).setWithdraw(withdraw);
				 bank.get(3).setDeposit(withdraw);	
				}
		}
		}
		
		//baryalai
		if(select.equalsIgnoreCase("baryalai")) {
			System.out.println("how much money you wanna transfer to?");
			
			withdraw = scan.nextInt();
			
			System.out.println("Who do you wanna transfer your money to?");
			select1 = scan.next();
			System.out.println("Enter his/her ID_Number?");
			ID = scan.nextInt();
			System.out.println("Make sure this ID is correct?");
			System.out.println(ID);
			System.out.println("Yes Or No");
			correct = scan.next();
			if(correct.equalsIgnoreCase("yes")) {
			if(select1.equalsIgnoreCase("seyar")&&ID == bank.get(0).ID) {
			 bank.get(3).setWithdraw(withdraw);
			 bank.get(0).setDeposit(withdraw);
			}
			if(select1.equalsIgnoreCase("toryalai")&&ID == bank.get(2).ID) {
				 bank.get(3).setWithdraw(withdraw);
				 bank.get(2).setDeposit(withdraw);
				}
			if(select1.equalsIgnoreCase("morid")&&ID == bank.get(1).ID) {
				 bank.get(3).setWithdraw(withdraw);
				 bank.get(1).setDeposit(withdraw);	
				}
		}
		}
		System.out.println("------After_Transfer-----");
		
		for(Bank i:bank) {
			System.out.println(i);
		}
	}

}
