package edu.tuan2;
import java.util.Scanner;
class BaiTap2 {

	public static void main(String[] args) {
		System.out.print("Nguyen Tuan Anh_20181055");
        Scanner scanner = new Scanner(System.in);
        System.out.println("\nNhập số tự nhiên N bất kì:");
        int n = scanner.nextInt();
        float result =0;
        int t =1;
        int a=1;
        for(int i=1 ; i <=n ; i++){
            t*=i;
            result+=(float)1/t;
        }
        System.out.println(result);
    }
	
}