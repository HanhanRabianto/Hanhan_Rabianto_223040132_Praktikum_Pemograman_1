package StrukturRemoveHeadMidTail;

public class RemuveTail {
	public static void main(String[] args) {
        // 1. Create list dengan keyword new
        List BawahList = new List();

        // 2. Tambah elemen sehingga elemenlist berisi (1,5,3,6,2)
        BawahList.addFirst( 2);
        BawahList.addFirst( 6);
        BawahList.addFirst( 3);
        BawahList.addFirst( 5);
        BawahList.addFirst( 1);
        // 3. Tampilkan elemen list
        System.out.println("Elemen list sebelum penghapusan di akhir:");
        BawahList.displayList();
        // 4. Hapus elemen di akhir list
        BawahList.removeTail();
        // 5. Tampilkan elemen list
        System.out.println("Elemen list setelah penghapusan di akhir:");
        BawahList.displayList();
        

}
}
