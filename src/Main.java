import java.util.Scanner;

public class Main {
	
	private static Sarkicilar sarkici = new Sarkicilar();
	private static Scanner scan = new Scanner(System.in);
	
	public static void islemleri_bastir() {
		System.out.println("\t 0-islemleri görüntüle.");
		System.out.println("\t 1-sarkicilari görüntüle.");
		System.out.println("\t 2-sarkici ekle.");
		System.out.println("\t 3-sarkici güncelle.");
		System.out.println("\t 4-sarkici sil.");
		System.out.println("\t 5-sarkici ara.");
		System.out.println("\t 6-sarkici cik.");
	}
	
	public static void goruntule() {
		sarkici.Sarkici_bastir();
	}
	
	public static void ekle() {
		
		System.out.println("eklemek istediğiniz sarkici ismi:");
		String isim = scan.nextLine();
		sarkici.sarkici_ekle(isim);
	}
	public static void guncelle() {
		
		System.out.println("guncellemek istediğiniz pozisyon(1,2,3 vb.)");
		int pozisyon = scan.nextInt();
		scan.nextLine();
		String yeni_isim = scan.nextLine();
		
		sarkici.sarkici_guncelle(yeni_isim, pozisyon-1);
	}
	
	public static void sil() {
		
		System.out.println("silmek istediğiniz pozisyon(1,2,3 vb.)");
		int pozisyon = scan.nextInt();
		sarkici.sarkici_sil(pozisyon-1);
	}
	
	public static void ara() {
		
		System.out.println("aramak istediğiniz sarkici ismi:");
		String isim = scan.nextLine();
		sarkici.sarkici_ara(isim);
		
	}

	public static void main(String[] args) {
		System.out.println("Sarkici programina hoşgeldiniz..");
		islemleri_bastir();
		
		boolean cikis = false;
		int islem;
		
		while(!cikis) {
			
			System.out.println("islem seciniz:");
			islem = scan.nextInt();
			scan.nextLine();
			
			switch(islem) {
				case 0:
					islemleri_bastir();
					break;
				case 1:
					goruntule();
					break;
				case 2:
					ekle();
					break;
				case 3:
					guncelle();
					break;
				case 4:
					sil();
					break;
				case 5:
					ara();
					break;
				case 6:
					cikis = true;
					System.out.println("Uygulamadan cikiliyor..");
					break;
					
			
			
			}
			
			
			}
		
		
		
		
		
	}

}
