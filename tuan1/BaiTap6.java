package edu.tuan1;

class BaiTap6 {

	public static void main(String[] args) {
		System.out.println("\n Nguyen Tuan Anh_ 20181055");
        for(int i = 1 ; i < 10000; i++) {
            int sum = 0;
            for(int j = 1 ; j <= i/2;j++){
                if(i%j==0){
                    sum+=j;
                }
            }
            if(i==1){
                System.out.println("Số hoàn hảo là :" + i);
            }
            else if(sum == i){
                System.out.println("Số hoàn hảo là: "+i);
            }
        }
    }
}
