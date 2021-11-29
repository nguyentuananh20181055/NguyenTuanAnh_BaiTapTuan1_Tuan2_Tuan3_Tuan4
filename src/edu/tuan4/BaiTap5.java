package edu.tuan4;

import java.util.Scanner;
class BaiTap5 {

	public static void main(String[] args) {
		System.out.println("Nguyen Tuan Anh_20181055");
		  Scanner scanner = new Scanner(System.in);
	        System.out.print("Nhập xâu kí tự: ");
	        String n = scanner.nextLine();
	        String[] a = n.split("");
	        System.out.print("Số ban đầu: ");
	        for (int i = 0; i < a.length; i++) {
	            System.out.print(a[i]);
	        }
	        System.out.println("\n");
	        for (int i = 0; i < a.length; i++) {
	            if (a[i].equals("0")) {
	                a[i] = "1";
	            } else if (a[i].equals("1")) {
	                a[i] = "0";
	            }
	        }
	        System.out.print("Số lúc sau: ");
	        for (int i = 0; i < a.length; i++) {
	            System.out.print(a[i]);
	        }
	        System.out.println("");
	}

}
