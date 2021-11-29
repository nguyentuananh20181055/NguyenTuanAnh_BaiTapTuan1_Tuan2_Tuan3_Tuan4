package edu.tuan1;
import java.util.Scanner;
class BaiTap8 {

	public static void main(String[] args) {
		System.out.println(" Nguyen Tuan Anh_20181055");
		 Scanner scanner =  new Scanner(System.in);
	        System.out.println("Nhập N:");
	        int n = scanner.nextInt();
	        while (nhap(n)){
	            System.out.println("Nhập sai vui lòng nhập lại");
	            System.out.println("Nhập N:");
	            n = scanner.nextInt();
	        }

	        if(n==2){
	            System.out.println("Ước số nguyên tố nhỏ nhất của N là: 1");
	        }
	        else if(n==1){
	            System.out.println("Ước số nguyên tố nhỏ nhất của N là: 1");
	        }
	        else if(n==0){
	            System.out.println("Ước số nguyên tố nhỏ nhất của N là: 1");
	        }
	        else{
	            boolean KT=true;
	            for(int i =2 ; i <= Math.sqrt(n) ; i++){
	                if(n%i==0){
	                    KT=false;
	                    break;
	                }
	            }
	            if(KT) {
	                int min = 1;
	                for (int i = 1; i < n; i++) {
	                    if (n % i == 0) {
	                        if (i < min) {
	                            min = i;
	                        }
	                    }
	                }
	                System.out.println("Ước số nguyên tố nhỏ nhất của "+n+" là: "+min);
	            }
	            else{
	                System.out.println(n+" không phải số nguyên tố!");
	            }

	        }


	    }
	    public static boolean nhap(int n){
	        if(n<0){
	            return true;
	        }
	        else{
	            return false;
	        }
	    }
	}