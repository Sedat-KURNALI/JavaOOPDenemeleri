import java.util.ArrayList;
import java.util.List;

public class Deneme001 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		OgrenciBilgileri ogrenci1 = new OgrenciBilgileri();

		ogrenci1.setOgrenciAdi("Sedat");
		ogrenci1.setOgrenciSoyadi("Kurnali");
		ogrenci1.setOgrenciNo(127);
		ogrenci1.setOgrenciSinifSube("10-BTL");

		OgrenciBilgileri ogrenci2 = new OgrenciBilgileri();
		ogrenci2.setOgrenciAdi("Taskin");
		ogrenci2.setOgrenciSoyadi("Yardim");
		ogrenci2.setOgrenciNo(34);
		ogrenci2.setOgrenciSinifSube("9-S");

		List<OgrenciBilgileri> listDenemeBilgileri = new ArrayList<>();

		listDenemeBilgileri.add(ogrenci1);
		listDenemeBilgileri.add(ogrenci2);
		System.out.println(listDenemeBilgileri);

		Object objectDenemesi = new Object();
		objectDenemesi = ogrenci1;
		System.out.println(objectDenemesi);

		System.out.println(listDenemeBilgileri.get(0).getOgrenciAdi());
		
		System.out.println(ogrenci1.getOgrenciAdi());
	}

}
