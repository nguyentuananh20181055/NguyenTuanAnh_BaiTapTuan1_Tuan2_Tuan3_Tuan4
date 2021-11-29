package edu.tuan4;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
class BaiTap11 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Nguyen Tuan Anh_20181055");
		 Scanner scanner = new Scanner(System.in);
	        String s1 = "Nguyen Tuan Anh";
	        String s2 = "Nguyen Thanh An ";
	        String s3 = "Nguyen Thi Thu Uyen ";
	        int count = 0;
	        List<String> arr = Arrays.asList(s1, s2, s3);
	        for (int i = 0; i < arr.size(); i++) {
	            if (arr.get(i).contains("An")) {
	                ++count;
	            }
	        }
	        System.out.println("Số bạn có tên An: " + count);
	}

}
