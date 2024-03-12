package StrukturRemoveHeadMidTail;

public class RemuveHead {
	 public static void main(String[] args) {
	        // 1. Create list dengan keyword new
	        List AtasList = new List();

	        // 2. Tambah elemen sehingga elemenlist berisi (1,5,3,6,2)
	        AtasList.addFirst(2);
	        AtasList.addFirst(6);
	        AtasList.addFirst(3);
	        AtasList.addFirst(5);
	        AtasList.addFirst(1);

	        // 3. Tampilkan elemen list
	        System.out.println("Elemen List sebelum penghapusan awal:");
	        AtasList.display();
		
		    // 4. Hapus elemen di awal list
		    AtasList.removeHead();
		    
	        // 5. Tampilkan elemen list setelah penghapusan tengah
	        System.out.println("Elemen List setelah penghapusan awal:");
	        AtasList.display();


	}
}
