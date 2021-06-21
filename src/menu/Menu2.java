package menu;

public class Menu2 extends Menu1 {
	private int nilai;
	private String atribut2;
	private String atribut3;
		
	//2method subclass
	public String grade() {
		String nilgrade; 
        if(nilai >= 80) 
            nilgrade = "A";
        else if(nilai >= 60) 
            nilgrade = "B"; 
        else if(nilai >= 50) 
            nilgrade = "C"; 
        else if(nilai >= 30)
            nilgrade = "D"; 
        else
            nilgrade = "E"; 
        
        return nilgrade; 
	}
	 
	public String ketlulus() {
		String ketlulus;
        if(nilai >= 80) 
        	ketlulus = "Lulus";
        else if(nilai >= 60) 
        	ketlulus = "Lulus"; 
        else if(nilai >= 50) 
        	ketlulus = "Lulus"; 
        else if(nilai >= 30)
        	ketlulus = "Gagal"; 
        else
        	ketlulus = "Gagal"; 
        
        return ketlulus; 
	}
	
	//membuat getter and setter untuk class menu2
			public int nilai() {
				return nilai;
			}

			public void nilai(int nilai) {
				this.nilai = nilai;
			}
			
			public String getAtribut2() {
				return atribut2;
			}

			public void setAtribut2(String atribut2) {
				this.atribut2 = atribut2;
			}

			public String getAtribut3() {
				return atribut3;
			}

			public void setAtribut3(String atribut3) {
				this.atribut3 = atribut3;
			}
	        
	        //membuat ovveride
			public void cetakketlulus() {		
				System.out.println("Lulus");
			}
			public void grade1() {
				System.out.println("B");
		    }
}
