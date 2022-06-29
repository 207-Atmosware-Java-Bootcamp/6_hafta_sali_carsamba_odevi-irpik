package com.turkcell;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class RandomOdev {
	
	public static void homework(int number) {
		String[] students = { "Ali Furkan Ergüven", "Alim Yoğurtcu", "Arda Kozan", "Beytullah Zor", "Burak Can Gületin",
				"Doğus Sağlam", "Emre Yıldız", "Furkan Gürcay", "Hüseyin Barış Aktaş", "İbrahim Bayramlı",
				"Kadir İrpik", "Kubilay Alp Ağacan", "Mehmet Mustafa Özçelik", "Mustafa Kemal", "Ömer Faruk Çalıskan",
				"Şeyda Özdemir", "Tolga Güreli", "Tuba Arğın", "Yigit Özen" };
		int[] temp = new int[number];
		Random rnd = new Random();
		temp[0] = rnd.nextInt(students.length) + 1;
		System.out.println("1. Ödev: " + students[temp[0] - 1]);
		for (int i = 1; i < number; i++) {
			Arrays.sort(temp);
			while (true) {
				int rndNumber = rnd.nextInt(students.length) + 1;
				if (Arrays.binarySearch(temp, rndNumber) < 0) {
					temp[i] = rndNumber;
					System.out.println((i + 1) + ". Ödev: " + students[temp[i] - 1]);
					break;
				}
			}
			
		}
	}
	
	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		System.out.print("Ödev Sayısını Giriniz: ");
		int number = scn.nextInt();
		homework(number);
		scn.close();
	}
	
}
