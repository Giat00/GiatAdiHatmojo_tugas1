package menu;

public class Menu2 extends Menu1 {
	int nilai;
	String atribut2;
	String atribut3;
		
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
}
