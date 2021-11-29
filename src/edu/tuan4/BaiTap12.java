package edu.tuan4;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
class BaiTap12 {

	public static void main(String[] args) {
		System.out.println("Nguyen Tuan Anh_20181055");
		 Scanner scanner = new Scanner(System.in);
	        String s1 = "Nguyễn Thị A";
	        String s2 = "Phạm Trọng B";
	        String s3 = "Lê Thị C";
	        String s4 = "Nguyen Tuan Anh";
	        int count = 0;
	        List<String> arr = Arrays.asList(s1, s2, s3, s4);
	        for (int i = 0; i < arr.size(); i++) {
	            if (arr.get(i).contains("Thị")) {
	                ++count;
	            }
	        }
	        System.out.println("Số bạn có tên đệm Thị: " + count);
	}

}
