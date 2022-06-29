package com.turkcell;

import com.turkcell.UlkeStatic.Il.Ilce;
import com.turkcell.UlkeStatic.Il.Ilce.Mahalle;

public class UlkeStatic {
	private String ulkeAdi;
	
	public String getUlkeAdi() {
		return ulkeAdi;
	}
	
	public void setUlkeAdi(String ulkeAdi) {
		this.ulkeAdi = ulkeAdi;
	}
	
	// İç Class (İl)
	public static class Il {
		private String ilAdi;
		
		public String getIlAdi() {
			return ilAdi;
		}
		
		public void setIlAdi(String ilAdi) {
			this.ilAdi = ilAdi;
		}
		
		// İç Class (ilçe)
		public static class Ilce {
			private String ilceAdi;
			
			public String getIlceAdi() {
				return ilceAdi;
			}
			
			public void setIlceAdi(String ilceAdi) {
				this.ilceAdi = ilceAdi;
			}
			
			// İç Class (mahalle)
			public static class Mahalle {
				private String mahalleAdi;
				
				public String getMahalleAdi() {
					return mahalleAdi;
				}
				
				public void setMahalleAdi(String mahalleAdi) {
					this.mahalleAdi = mahalleAdi;
				}
			}
			
		}
		
	}
	
	// main test
	public static void main(String[] args) {
		UlkeStatic ulke = new UlkeStatic();
		ulke.setUlkeAdi("Türkiye");
		
		Il il = new Il();
		il.setIlAdi("Ankara");
		
		Ilce ilce = new Ilce();
		ilce.setIlceAdi("Çubuk");
		
		Mahalle mahalle = new Mahalle();
		mahalle.setMahalleAdi("Atatürk Mah.");
		
		System.out.println("Ülke Adı: " + ulke.getUlkeAdi() + " İl adı: " + il.getIlAdi() + " İlçe Adı: "
				+ ilce.getIlceAdi() + " Mahalle Adı: " + mahalle.getMahalleAdi());
	}
}
