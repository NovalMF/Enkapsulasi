public class Hewan1{
	
	public void tampilkan(){
		Hewan H = new Hewan();
        H.setNama("Kucing");        
		H.setKaki(4);
        System.out.println("Nama Hewan  = "+H.getNama());
		System.out.println("Jumlah Kaki = "+H.getKaki());
	}
}