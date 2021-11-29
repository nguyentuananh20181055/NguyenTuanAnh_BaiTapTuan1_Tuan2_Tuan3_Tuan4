package edu.tuan4;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;
class BaiTap10 {

	public static void main(String[] args) {
		System.out.println("Nguyen Tuan Anh_20181055");
		Scanner scanner = new Scanner(System.in);
        String s1 = "Nguyễn Tuấn Anh";
        System.out.println("Xâu ký tự 1: " + s1);
        String s2 = "Nguyễn Tuấn Anh - SVBK";
        System.out.println("Xâu ký tự 2: " + s2);
        List<String> arr = Arrays.asList(s1, s2);
        Map<Integer, String> stringMap = new HashMap<>();
        int max = s1.length();
        for (int i = 1; i < arr.size(); i++) {
            if (max < arr.get(i).length()) {
                max = arr.get(i).length();
                stringMap.put(1, arr.get(i));
            }
        }
        System.out.println("Xâu có độ dài nhất là: " + stringMap.get(1));

	}

}
