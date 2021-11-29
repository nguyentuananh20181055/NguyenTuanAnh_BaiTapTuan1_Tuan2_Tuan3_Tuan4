package edu.tuan4;
import java.util.Scanner;
class BaiTap6 {

	public static void main(String[] args) {
		System.out.println("Nguyen Tuan Anh_20181055");
		   Scanner scanner = new Scanner(System.in);
	        System.out.print("Nhập xâu kí tự: ");
	        String n = scanner.nextLine();
	        String[] a = n.split("");
	        System.out.print("Xâu ban đầu: ");
	        for (int i = 0; i < a.length; i++) {
	            System.out.print(a[i]);
	        }
	        System.out.println("");
	        System.out.print("Xâu lúc sau: ");
	        for (int i = a.length - 1; i >= 0; i--) {
	            System.out.print(a[i]);
	        }
	        System.out.println("");
	}

}
