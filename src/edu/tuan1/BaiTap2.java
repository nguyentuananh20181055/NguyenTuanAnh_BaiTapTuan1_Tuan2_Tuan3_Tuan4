package edu.tuan1;

class BaiTap2 {

	public static void main(String[] args) {
		  System.out.println("\n Nguyen Tuan Anh_ 20181055");
	      System.out.printf("\n 20 so nguyen to dau tien la : ");
	        int dem = 0; 
	        int i = 2;   
	        while (dem < 20) {
	            if (soNguyenTo(i)) {
	                System.out.print(i + " ");
	                dem++;
	            }
	           
	            i++;
	        }	
		}
		public static boolean soNguyenTo(int n) {
	        // so nguyen n < 2 khong phai la so nguyen to
	        if (n < 2) {
	            return false;
	        }
	        // check so nguyen to khi n >= 2
	        int a = (int) Math.sqrt(n);
	        for (int i = 2; i <= a; i++) {
	            if (n % i == 0) {
	                return false;
	            }
	        } 
	        
	        return true;
	    }  
	}


	
