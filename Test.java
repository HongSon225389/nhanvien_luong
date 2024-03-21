package Quanly;

import java.util.Scanner;

public class Test {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("So nhan vien : ");
		int n = sc.nextInt();
		Nhanvien[] nv = new Nhanvien[n];
		for(int i=0;i<n;++i) {
			System.out.println("Nhan vien "+(i+1));
			System.out.println("Name : ");
			String name = sc.next();
			System.out.println("Luong : ");
			double luong = sc.nextDouble();
			nv[i] = new Nhanvien(name,luong);
		}
		sc.close();
		System.out.println("Danh sach nhan vien va luong : ");
		for(int i=0;i<n;++i) {
			System.out.println("Name : " +nv[i].getName() +" - Luong : "+nv[i].getLuong() );
		}
	}
}
