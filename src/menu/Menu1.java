package menu;

public class Menu1 {
	
	//deklerasi 8atribut
	String nama;
	String npm;
	String kelas;
	int nilai;
	double uas;
	double kehadiran;
	double tugas;
	double uts;
	
	//deklarasi 4method
		//method untuk mencetak nilai
		public void cetakketlulus() {		
			System.out.println("Anda Lulus");			
		}
		//method untuk grade
		public void grade1() {
			   System.out.println("A");
		}
		//method NIlai Akhir
		public double nilaiakhir() {
			double nilai = getkehadiran()*0.3+gettugas()*0.3+getuts()*0.2+getuas()*0.2;
			double data = 4;
			double nilaiakhir = nilai/data;
			
			return nilaiakhir;
		}
		//membuat method tampilan
		public void tampilan() {
			System.out.println("NPM :" + this.nama);
	        System.out.println("NPM :" + this.npm);
	        System.out.println("Kelas :" + this.kelas);
		}
}
