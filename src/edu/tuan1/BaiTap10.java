package edu.tuan1;
import java.util.ArrayList;
import java.util.Scanner;
class BaiTap10 {

	public static void main(String[] args) {
		System.out.println(" Nguyen Tuan Anh_20181055");
		Scanner scanner = new Scanner(System.in);
        System.out.println("Nhập N:");
        int n = scanner.nextInt();
        while (nhap(n)){
            System.out.println("Nhập sai vui lòng nhập lại");
            System.out.println("Nhập N:");
            n = scanner.nextInt();
        }

        ArrayList<Integer> nguyento = songuyento(n);
        ArrayList<Integer>trienkhai = new ArrayList<>();
        int count=0;
        int length = n;
        boolean ab = true;
        do{
            if(n==1){
                ab=false;
            }
            if(n% nguyento.get(count)==0){
                n = n/nguyento.get(count);
                trienkhai.add(nguyento.get(count));
            }
            else{
                count++;
            }

        }while(ab);
        for(int i = 0 ; i < trienkhai.size()-1;i++){
            for(int j =i+1;j< trienkhai.size();j++){
                if(trienkhai.get(i)==trienkhai.get(j)){
                    trienkhai.set(j,0);
                }
            }
        }
        System.out.println("Các ước số nguyên tố khác nhau của: "+length+":");
        for(int i = 0 ; i < trienkhai.size();i++){
            if(trienkhai.get(i)!=0){
                System.out.print(trienkhai.get(i)+" ");
            }
        }

    }
    public static boolean nhap(int n){
        if(n<0){
            return true;
        }
        else{
            return false;
        }
    }
    public static ArrayList<Integer> songuyento(int n){
        ArrayList<Integer>nt = new ArrayList<>();
        for(int i =2 ; i <n;i++){
            boolean KT= true;
            for(int j = 2; j <i ; j++){
                if(i%j ==0){
                    KT = false;
                    break;
                }
            }
            if(KT){
                nt.add(i);
            }
        }
        return nt;
    }
}