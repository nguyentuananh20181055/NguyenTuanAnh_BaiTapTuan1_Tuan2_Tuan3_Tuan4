package edu.tuan1;
 import java.util.ArrayList;
class BaiTap1 {

	
	 public static void main(String[] args) {
		 System.out.println("\n Nguyen Tuan Anh_ 20181055");
	        ArrayList<Integer> nguyento = hopto(100);
	        System.out.println("Hợp số < 100 là: ");
	        for(int i = 0 ; i < nguyento.size(); i++){
	            System.out.print(nguyento.get(i)+" ");
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
	    public static ArrayList<Integer> hopto(int n){
	        ArrayList<Integer>nt = new ArrayList<>();
	        for(int i =2 ; i <n;i++){
	            boolean KT= false;
	            for(int j = 2; j <i ; j++){
	                if(i%j ==0){
	                    KT = true;
	                    break;
	                }
	            }
	            if(KT){
	                nt.add(i);
	            }
	        }
	        return nt;
	    }
	}