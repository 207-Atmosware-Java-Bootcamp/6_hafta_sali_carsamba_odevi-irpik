package com.turkcell;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Diziler_AllInOne {
	
	// diziyi oluşturma
	public static int[] createArray() {
		Scanner scn = new Scanner(System.in);
		Random rnd = new Random();
		System.out.print("Dizi boyutunu giriniz: ");
		int size = scn.nextInt();
		int[] arr = new int[size];
		for (int i = 0; i < arr.length; i++) {
			arr[i] = rnd.nextInt(50) + 1;
		}
		return arr;
	}
	
	// diziyi kopyalama
	public static int[] cloneMethod(int[] arr) {
		int[] cloneArray = arr.clone();
		System.out.print("Clone: ");
		for (int i : cloneArray) {
			System.out.print(i + " ");
		}
		System.out.println();
		return cloneArray;
	}
	
	// kopyalanmış dizi sıralama
	public static int[] cloneSorted(int[] arr) {
		Arrays.sort(arr);
		System.out.print("Clone Sorted: ");
		for (int i : arr) {
			System.out.print(i + " ");
		}
		System.out.println();
		return arr;
	}
	
	// en küçük , en büyük sayılar , toplamları ve ortalamalası
	public static void minMaxAndSumAverage(int[] arr) {
		System.out.println("En küçük sayı: " + arr[0]);
		System.out.println("En büyük sayı: " + arr[arr.length - 1]);
		int sum = 0;
		for (int i : arr) {
			sum += i;
		}
		System.out.println("Toplamları: " + sum);
		System.out.println("Ortalama değer: " + (sum / arr.length));
	}
	
	// tek, çift sayılardan kaç tane ve tek, çift sayı toplamları (tek ve çift
	// dizileri)
	public static void oddNumberAndEvenNumber(int[] arr) {
		int oddCount = 0;
		int oddNumberSum = 0;
		int evenCount = 0;
		int evenNumberSum = 0;
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] % 2 == 0) {
				evenCount++;
				evenNumberSum += arr[i];
			} else {
				oddCount++;
				oddNumberSum += arr[i];
			}
		}
		int[] oddArray = new int[oddCount];
		int[] evenArray = new int[evenCount];
		int j = 0, k = 0;
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] % 2 == 0) {
				evenArray[j] = arr[i];
				j++;
			} else {
				oddArray[k] = arr[i];
				k++;
			}
		}
		
		System.out.println("Tek sayı adeti: " + oddCount);
		System.out.println("Tek sayı toplamı: " + oddNumberSum);
		System.out.print("Tek Sayı Dizisi: ");
		for (int i = 0; i < oddArray.length; i++) {
			System.out.print(oddArray[i] + " ");
		}
		System.out.println();
		
		System.out.println("Çift sayı adeti: " + evenCount);
		System.out.println("Çift sayı toplamı: " + evenNumberSum);
		System.out.print("Çift Sayı Dizisi: ");
		for (int i = 0; i < evenArray.length; i++) {
			System.out.print(evenArray[i] + " ");
		}
		System.out.println();
	}
	
	// dizilerde en büyük ile 25 karşılatıralım hangisi büyük
	public static void compare(int arrNumber, int number) {
		if (arrNumber > number) {
			System.out.println("Dizi değeri büyük: " + arrNumber);
		} else if (arrNumber == number) {
			System.out.println("Eşit: " + arrNumber);
		} else {
			System.out.println("Sayı büyük: " + number);
		}
	}
	
	// dizideki tekrar eden sayıları bir dizide göstrelim
	public static int[] repeatingNumbers(int[] arr) {
		int[] temp = new int[arr.length];
		int count = 0;
		for (int i = 0; i < arr.length; i++) {
			Arrays.sort(temp);
			if (i == arr.length - 1) {
				break;
			} else {
				if (arr[i] == arr[i + 1]) {
					if (Arrays.binarySearch(temp, arr[i]) < 0) {
						temp[count] = arr[i];
						count++;
					}
				}
			}
		}
		
		int length = count;
		int[] repeatNumbers = new int[count];
		System.out.print("Tekrar eden sayılar: ");
		for (int i = 0; i < repeatNumbers.length; i++) {
			repeatNumbers[i] = temp[temp.length - length];
			length--;
			System.out.print(repeatNumbers[i] + " ");
		}
		System.out.println();
		
		return repeatNumbers;
	}
	
	// dizideki tekrar eden sayılar yerine 1 kere tekrar sayı göstersin (tekrarsız
	// dizi elemanları)
	public static void removeRepait(int[] arr, int repeatNumbers) {
		int[] array = new int[arr.length - repeatNumbers];
		array[0] = arr[0];
		int arrayCount = 0;
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] != array[arrayCount]) {
				arrayCount++;
				array[arrayCount] = arr[i];
			}
		}
		System.out.print("Tekarsız dizi: ");
		for (int i = 0; i < array.length; i++) {
			System.out.print(array[i] + " ");
		}
		System.out.println();
	}
	
	public static void main(String[] args) {
		// dizi oluşturma
		int[] arr = createArray();
		System.out.print("Dizi: ");
		for (int i : arr) {
			System.out.print(i + " ");
		}
		System.out.println();
		
		// diziyi kopyalama
		int[] cloneArr = cloneMethod(arr);
		
		// kopyalanmış dizi sıralama
		int[] cloneSort = cloneSorted(cloneArr);
		
		// en küçük , en büyük sayılar , toplamları ve ortalamalası
		minMaxAndSumAverage(cloneSort);
		
		// tek, çift sayılardan kaç tane ve tek, çift sayı toplamları (tek ve çift
		// dizileri)
		oddNumberAndEvenNumber(cloneSort);
		
		// dizilerde en büyük ile 25 karşılatıralım hangisi büyük
		compare(cloneSort[cloneSort.length - 1], 25);
		
		// dizideki elemanlardan 5 sayısı var mı ? (java.util.Arrays.binarySearch())
		String numberControl = Arrays.binarySearch(cloneSort, 5) >= 0 ? "5 sayısı dizi'de var"
				: " 5 sayısı dizi'de yok";
		System.out.println(numberControl);
		
		// dizideki tekrar eden sayıları bir dizide göstrelim ?
		int[] repeatNumbersArr = repeatingNumbers(cloneSort);
		
		// dizideki tekrar eden sayılar yerine 1 kere tekrar sayı göstersin (tekrarsız
		// dizi elemanları)
		removeRepait(cloneSort, repeatNumbersArr.length);
	}
}