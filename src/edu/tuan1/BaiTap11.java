package edu.tuan1;
import java.util.Scanner;
import java.util.ArrayList;
import java.util.Random;
class BaiTap11 {

	public static void main(String[] args) {
		System.out.println(" Nguyen Tuan Anh_20181055");
		 Scanner scanner = new Scanner(System.in);
	        System.out.println("Nhập dãy số:");
	        int n = scanner.nextInt();
	        String m = String.valueOf(n);
	        String []b = m.split("");
	        String luutru[] = new String[b.length];
	        Random random = new Random();
	        String[]after = manglucsau(b);
	        for(int i = 0 ; i  < b.length ; i++){
	            int vitri = random.nextInt(after.length);
	            luutru[i]=after[vitri];
	            after[vitri]="0";
	            after = manglucsau(after);
	        }
	        System.out.println("Danh sách lúc sau: ");
	        for(int i=0;i< luutru.length;i++){
	            System.out.print(luutru[i]);
	        }
	    }
	    public static String[] manglucsau(String[]b){
	        ArrayList<String>a = new ArrayList<>();
	        for(int i= 0 ; i <b.length;i++){
	            if(b[i]!="0"){
	                a.add(b[i]);
	            }
	        }
	        String after[] = new String[a.size()];
	        for(int i = 0 ; i < a.size();i++){
	            after[i] = a.get(i);
	        }
	        return after;
	    }
	}