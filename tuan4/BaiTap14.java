package edu.tuan4;
import java.util.Scanner;
class BaiTap14 {

	public static void main(String[] args) {
		System.out.println("Nguyen Tuan Anh_20181055");
	    System.out.print("Nhập xâu kí tự N: ");
        Scanner scan = new Scanner(System.in);
        String s1 = scan.nextLine();
        int count = s1.length();

        char[] s2 = s1.toCharArray();
        char s3 = s2[0];
        for (int i = 1; i < count; i++) {
            for (int j = 0; j < count - 1; j++) {
                s2[j] = s2[j + 1];
            }
            s2[count - 1] = s3;
            s3 = s2[0];
        }
        System.out.print("Kết quả xâu Sn: ");
        for (int i = 0; i < count; i++) {
            System.out.print(s2[i]);
        }
        System.out.println("");

	}

}


	
