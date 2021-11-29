package edu.tuan1;
import java.util.ArrayList;
class BaiTap3 {

	 public static void main(String[] args) {
		 System.out.println("\n Nguyen Tuan Anh_ 20181055");
	        ArrayList<Integer> nguyento = songuyento(2000);
	        System.out.println("Số nguyên tố từ 1000 đến 2000 là: ");
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
	    public static ArrayList<Integer> songuyento(int n){
	        ArrayList<Integer>nt = new ArrayList<>();
	        for(int i =1001 ; i <n;i++){
	            boolean KT= true;
	            for(int j = 2; j <i ; j++){
	                if(i%j ==0){
	                    KT = false;
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