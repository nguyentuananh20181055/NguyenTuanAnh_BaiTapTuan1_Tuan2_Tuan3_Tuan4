package edu.tuan1;

class BaiTap7 {

	public static void main(String[] args) {
		System.out.println("\n Nguyen Tuan Anh_ 20181055");
		int count=0;
		System.out.print("\nSo cac so tu nhien <=100 cho 5 la : ");
		for (int i = 0; i <= 100; i++) {
			if (i % 5 == 0) {
				count++;
			}
		}System.out.println(count);

		//b
		System.out.print("So cac so tu nhien <=100 cho 5 du 1 la : ");
		for (int i = 0; i <= 100; i++) {
			if (i % 5 == 1) {
				count++;
			}
		}System.out.println(count);
		//c
		System.out.print("So cac so tu nhien <=100 cho 5 du 2 la : ");
		for (int i = 0; i <= 100; i++) {
			if (i % 5 == 2) {
				count++;
			}
		}System.out.println(count);
		//d
		System.out.print("So cac so tu nhien <=100 cho 5 du 3 la : ");
		for (int i = 0; i <= 100; i++) {
			if (i % 5 == 3) {
				count++;
			}
		}System.out.println(count);
	}

}