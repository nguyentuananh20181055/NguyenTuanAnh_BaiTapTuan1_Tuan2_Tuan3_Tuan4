package edu.tuan3;
import java.util.Scanner;
import java.util.stream.Collectors;
import java.util.ArrayList;
import java.util.*;
class BaiTap3 {

	public static void main(String[] args) {
		System.out.println("Nguyen Tuan Anh_20181055");
		Scanner scanner = new Scanner(System.in);
		System.out.println("Nhâòp ğôò daÌi cuÒa daŞy:");
		int n = scanner.nextInt();
		List<Integer> b = new ArrayList();
		System.out.println("Nhâòp daŞy sôì: ");
		for (int i= 0 ; i<n; i++) {
			int nhap = scanner.nextInt();
			b.add(nhap);
			
		}
		b= b.stream ().sorted (new Comparator <Integer>() {
			@Override
			public int compare(Integer o1, Integer o2) {
				return o1.compareTo(o2);
			}
			}).collect(Collectors.toList());
		System.out.println(b.get(0));
		
			
		}
}


