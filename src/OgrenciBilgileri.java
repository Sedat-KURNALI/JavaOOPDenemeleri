
public class OgrenciBilgileri {

	private String ogrenciAdi;

	private String ogrenciSoyadi;

	private int ogrenciNo;

	private String ogrenciSinifSube;

	public String getOgrenciAdi() {
		return ogrenciAdi;
	}

	public void setOgrenciAdi(String ogrenciAdi) {
		this.ogrenciAdi = ogrenciAdi;
	}

	public String getOgrenciSoyadi() {
		return ogrenciSoyadi;
	}

	public void setOgrenciSoyadi(String ogrenciSoyadi) {
		this.ogrenciSoyadi = ogrenciSoyadi;
	}

	public int getOgrenciNo() {
		return ogrenciNo;
	}

	public void setOgrenciNo(int ogrenciNo) {
		this.ogrenciNo = ogrenciNo;
	}

	public String getOgrenciSinifSube() {
		return ogrenciSinifSube;
	}

	public void setOgrenciSinifSube(String ogrenciSinifSube) {
		this.ogrenciSinifSube = ogrenciSinifSube;
	}

	@Override
	public String toString() {
		return "OgrenciBilgileri [ogrenciAdi=" + ogrenciAdi + ", ogrenciSoyadi=" + ogrenciSoyadi + ", ogrenciNo="
				+ ogrenciNo + ", ogrenciSinifSube=" + ogrenciSinifSube + "]";
	}

}
