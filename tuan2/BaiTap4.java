package edu.tuan2;
import java.util.Scanner;
class BaiTap4 {

	public static void main(String[] args) {
		System.out.print("Nguyen Tuan Anh_20181055");
		Scanner scanner = new Scanner(System.in);
        System.out.println("\nNhập số tự nhiên bất kì:");
        int n = scanner.nextInt();
        int result = Fibonaxi(n);
        System.out.println(result);
    }
    public static int Fibonaxi(int k){
        if(k==1){
            return 1;
        }
        else if(k==0){
            return 0;
        }
        else{
            return Fibonaxi(k-1)+Fibonaxi(k-2);
        }
    }
}

