/**
 * Ini adalah class Sekolah
 * Class ini hanya class simple untuk menggambarkan proses komentar yang digenerate menjadi javadoc
 */
package documentingJava.Instansi.Pendidikan;

/**
 * @author muhammad.thahir
 * @version 1.0.0
 */

public class Sekolah {
	
	
	/**
	 * Constructor Sekolah
	 * 
	 * @param Guru Nama Guru
	 * @param Siswa Nama Siswa
	 * @param Kelas Nama Kelas
	 */
	public Sekolah(String Guru,String Siswa,String Kelas){
		this.Guru = Guru;
		this.Siswa = Siswa;
		this.Kelas = Kelas;
	}
	
	private String Guru;
	private String Siswa;
	private String Kelas;
	
	
	/** fungsi untuk memanggil guru dari class sekolah
	 * @return String nama guru
	 */
	public String getGuru() {
		return Guru;
	}
	
	
	/**
	 * fungsi untuk mengubah nama guru dari class sekolah
	 * @param guru nama guru yang akan diganti
	 */
	public void setGuru(String guru) {
		Guru = guru;
	}
	
	/**
	 * @return nama siswa
	 */
	public String getSiswa() {
		return Siswa;
	}
	public void setSiswa(String siswa) {
		Siswa = siswa;
	}
	public String getKelas() {
		return Kelas;
	}
	public void setKelas(String kelas) {
		Kelas = kelas;
	}

}
