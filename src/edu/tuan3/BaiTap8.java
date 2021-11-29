package edu.tuan3;
import java.util.Scanner;
import java.util.ArrayList;
import java.util.*;
class BaiTap8 {

	public static void main(String[] args) {
		System.out.println("Nguyen Tuan Anh_20181055");
		  Scanner scanner = new Scanner(System.in);
	        System.out.print("Nhập độ dài dãy số:");
	        int n = scanner.nextInt();
	        System.out.print("Nhập số: ");
	        int b[] = new int[n];
	        for (int i = 0; i < n; i++) {
	            int nhap = scanner.nextInt();
	            b[i] = nhap;
	        }
	        List<Integer> c = new ArrayList<>();
	        for (int i = 0; i < b.length; i++) {
	            c.add(b[i]);
	        }
	        c.stream().filter(s -> s != 0).forEach(s -> System.out.println(s));
	    }
	}
	
