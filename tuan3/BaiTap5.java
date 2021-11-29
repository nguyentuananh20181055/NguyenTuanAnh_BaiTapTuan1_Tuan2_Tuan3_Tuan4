package edu.tuan3;
import java.util.Scanner;
import java.util.ArrayList;

class BaiTap5 {

	  public static void main(String[] args) {
		  System.out.println("Nguyen Tuan Anh_20181055");
	        Scanner scanner = new Scanner(System.in);
	        System.out.print("Nhập độ dài của dãy số:");
	        int n = scanner.nextInt();
	        System.out.print("Nhập số:");
	        int b[] = new int[n];
	        for (int i = 0; i < n; i++) {
	            int nhap = scanner.nextInt();
	            b[i] = nhap;
	        }
	        ArrayList<Integer> c = new ArrayList<>();
	        ArrayList<Integer> d = new ArrayList<>();
	        for (int i = 0; i < b.length; i++) {
	            if (isCheck(b, b[i])) {
	                c.add(b[i]);
	            };
	            if (isCheckHopso(b, b[i]) == false) {
	                d.add(b[i]);
	            }
	        }
	        System.out.println("Nguyên tố: " + c.size());
	        System.out.println("Hợp số: " + d.size());
	    }

	    public static boolean isCheck(int b[], int input) {
	        boolean KT = true;
	        if (input == 1) {
	            KT = false;
	            return KT;
	        }
	        for (int i = 2; i < input; i++) {
	            if (input % i == 0) {
	                KT = false;
	                break;
	            }
	        }
	        return KT;
	    }

	    public static boolean isCheckHopso(int b[], int input) {
	        boolean KT = true;
	        if (input == 1) {
	            KT = true;
	            return KT;
	        }
	        for (int i = 2; i < input; i++) {
	            if (input % i == 0) {
	                KT = false;
	                break;
	            }
	        }
	        return KT;
	    }
	}
