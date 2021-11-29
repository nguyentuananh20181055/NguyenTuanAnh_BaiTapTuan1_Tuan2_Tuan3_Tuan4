package edu.tuan1;

import java.util.Scanner;
class BaiTap12 {
	     
	    public static void main(String[] args) throws Exception {
	         System.out.print("Nguyen Tuan Anh_20181055");
	    Scanner scanner = new Scanner(System.in);
	    System.out.print("\nNhap h= ");
	    int h = scanner.nextInt();
	      
	         while (nhap(h)) {
	        	 System.out.println("Nhap sai vui long nhap lai");
	        	 System.out.print("Nhap h= ");
	        	 h = scanner.nextInt();
	        	 
	         }
	        for(int i = 1; i <= h ; i++){
	          for(int j = 1; j <= i; j++) {
	                System.out.print("* ");
	          }
	            System.out.println("");
	        }
	         
	        
	    }
	    public static boolean nhap(int h) {
	    	if ((h>=2)  &&	 (h<=10)) {
	    		return false;
	    		
	    	} else {
	    		return true;
	    }
	    		
	  }
	   
	}
