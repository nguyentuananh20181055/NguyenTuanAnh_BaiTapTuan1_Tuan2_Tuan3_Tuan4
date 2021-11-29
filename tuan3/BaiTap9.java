package edu.tuan3;
import java.util.Scanner;
import java.util.ArrayList;
import java.util.*;
class BaiTap9 {

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
	        System.out.print("Nhập số C:5");
	        int soC = scanner.nextInt();
	        System.out.println("Các số bằng số C:");
	        for (int i = 0; i < c.size(); i++) {
	            if (soC == c.get(i)) {
	                System.out.println(c.get(i));
	            }
	        }
	        System.out.println("Các số nhỏ hơn số C:");
	        for (int i = 0; i < c.size(); i++) {
	            if (soC > c.get(i)) {
	                System.out.println(c.get(i));
	            }
	        }
	        System.out.println("Các số lớn hơn số C:");
	        for (int i = 0; i < c.size(); i++) {
	            if (soC < c.get(i)) {
	                System.out.println(c.get(i));
	            }
	        }
	    }
	}