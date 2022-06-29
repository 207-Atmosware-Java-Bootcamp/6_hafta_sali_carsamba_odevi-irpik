package com.turkcell;

public class Ulke {
	private String ulkeAdi;
	
	public String getUlkeAdi() {
		return ulkeAdi;
	}
	
	public void setUlkeAdi(String ulkeAdi) {
		this.ulkeAdi = ulkeAdi;
	}
	
	// İç olan class (İl)
	public class Il {
		private String ilAdi;
		
		public String getIlAdi() {
			return ilAdi;
		}
		
		public void setIlAdi(String ilAdi) {
			this.ilAdi = ilAdi;
		}
		
		// İç olan class (İlçe)
		public class Ilce {
			private String ilceAdi;
			
			public String getIlceAdi() {
				return ilceAdi;
			}
			
			public void setIlceAdi(String ilceAdi) {
				this.ilceAdi = ilceAdi;
			}
			
			// İç Class (mahalle)
			public class Mahalle {
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
		Ulke ulke = new Ulke();
		ulke.setUlkeAdi("Türkiye");
		
		Ulke.Il il = new Ulke().new Il();
		il.setIlAdi("Ankara");
		
		Ulke.Il.Ilce ilce = new Ulke().new Il().new Ilce();
		ilce.setIlceAdi("Çubuk");
		
		Ulke.Il.Ilce.Mahalle mahalle = new Ulke().new Il().new Ilce().new Mahalle();
		mahalle.setMahalleAdi("Atatürk Mah.");
		
		System.out.println("Ülke Adı: " + ulke.getUlkeAdi() + " İl adı: " + il.getIlAdi() + " İlçe Adı: "
				+ ilce.getIlceAdi() + " Mahalle: " + mahalle.getMahalleAdi());
		
	}
}
