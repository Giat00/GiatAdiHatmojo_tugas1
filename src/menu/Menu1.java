package menu;

public class Menu1 {
	
	//deklerasi 8atribut
	private String nama;
	private String npm;
	private String kelas;
	private int nilai;
	private double uas;
	private double kehadiran;
	private double tugas;
	private double uts;
	
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
		
		public Menu1(){
	    }
		public Menu1(String nama, String npm, String kelas){
		    	this.nama = nama;
		        this.npm = npm;
		        this.kelas = kelas;
		}
	    public Menu1(String nama, String npm, String kelas, int nilai, double uas, double kehadiran, double tugas, double uts){
	    	this.nama = nama;
	        this.npm = npm;
	        this.kelas = kelas;
	        this.nilai = nilai;
	    	this.uas = uas;
	    	this.kehadiran = kehadiran;
	    	this.tugas = tugas ;
	    	this.uts = uts;
	    }
	  //membuat getter and setter untuk class menu1
	    public String getnama() {
	        return nama;
	    }
        public void setnama(String nama) {
            this.nama = nama;
        }
        public String getnpm() {
            return npm;
        }
        public void setnpm(String npm) {
            this.npm = npm;
        }    
        public String getkelas() {
            return kelas;
        }
        public void setkelas(String kelas) {
            this.kelas = kelas;
        }
        public int getnilai() {
            return nilai;
        }
        public void setnilai(int nilai) {
            this.nilai = nilai;
        }
		public double getuas() {
			return uas;
		}
		public void setuas(double uas) {
			this.uas = uas;
		}
		public double getkehadiran() {
			return kehadiran;
		}
		public void setkehadiran(double kehadiran) {
			this.kehadiran = kehadiran;
		}
		public double gettugas() {
			return tugas;
		}
		public void settugas(double tugas) {
			this.tugas = tugas;
		}
		public double getuts() {
			return uts;
		}
		public void setuts(double uts) {
			this.uts = uts;
		}
        public double getnilaiakhir() {
        	return nilaiakhir();
        }
}
