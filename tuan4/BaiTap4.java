package edu.tuan4;
import java.util.Scanner;
class BaiTap4 {

	public static void main(String[] args) {
		System.out.println("Nguyen Tuan Anh_20181055");
		 Scanner scanner = new Scanner(System.in);
	        System.out.print("Nhập tên đầy đủ: ");
	        String n = scanner.nextLine();
	        String[] arr = n.split("");
	        for (int i = 0; i < arr.length; i++) {
	            if (arr[i].equals(" ")) {
	                for (int j = 0; j < i; j++) {
	                    System.out.print(arr[j]);
	                }
	                break;
	            }
	        }
	        System.out.println("");
	    }
	}
