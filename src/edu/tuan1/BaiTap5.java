package edu.tuan1;

class BaiTap5 {

	public static void main(String[] args) {
		System.out.println("\n Nguyen Tuan Anh_ 20181055");
		System.out.println("Cac so tu 1000 den 2000 chia het cho 3, 5, 7 la : ");
		for (int i = 1000; i < 2000; i++) {
			if (i % 3 == 0 && i % 5 == 0 && i % 7 == 0) {
				System.out.print(i + " ");
			}
		}
	}

}
