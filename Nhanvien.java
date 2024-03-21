package Quanly;

public class Nhanvien {
	private String name;
	private int year;
	private double luong;
	public Nhanvien(String name, int year, double luong) {
		this.name = name;
		this.year = year;
		this.luong = luong;
	}
	public String getName() {
		return name;
	}
	public int getYear() {
		return year;
	}
	public double getLuong() {
		return luong;
	}
}
