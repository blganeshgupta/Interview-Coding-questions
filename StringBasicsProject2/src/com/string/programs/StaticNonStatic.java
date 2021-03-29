package com.string.programs;

public class StaticNonStatic {
	public static void atmMoneyWithdraw() {
		System.out.println("For with drawing the money we need only atm password");
	}
	public void onlineMoneyTransfer() {
		System.out.println("in this situation defenently we need phone with password we can't do transaction");
	}
	

	public static void main(String[] args) {
		atmMoneyWithdraw() ;
		StaticNonStatic sts=new StaticNonStatic();
		sts.onlineMoneyTransfer();

	}

}
