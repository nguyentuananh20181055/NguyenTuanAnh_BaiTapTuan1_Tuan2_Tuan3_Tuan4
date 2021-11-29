package edu.tuan4;
import java.util.Scanner;
class BaiTap16 {

	public static void main(String[] args) {
		System.out.println("Nguyen Tuan Anh_20181055");
		 Scanner scanner = new Scanner(System.in);
	        String xau1 = "Tuấn";
	        String xau2 = "NguyễnTuấnAnh";
	        boolean KT = true;
	        for (int i = 0; i < xau1.length(); i++) {
	            if (!xau2.contains(xau1.split("")[i])) {
	                KT = false;
	            }
	        }
	        if (KT) {
	            System.out.println("Xâu 1 là con của xâu 2!");
	        } else {
	            System.out.println("Xâu 1 không là con của xâu 1");
	        }
	    }
	}
