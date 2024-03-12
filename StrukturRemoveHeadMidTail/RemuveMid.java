package StrukturRemoveHeadMidTail;

public class RemuveMid {

    public static void main(String[] args) {
        // 1. Create list dengan keyword new
        List tengahList = new List();

        // 2. Tambah elemen sehingga elemenlist berisi (1,5,3,6,2)
        tengahList.addFirst(2);
        tengahList.addFirst(6);
        tengahList.addFirst(3);
        tengahList.addFirst(5);
        tengahList.addFirst(1);

        // 3. Tampilkan elemen list
        System.out.println("Elemen List sebelum penghapusan tengah:");
        tengahList.display();

        // 4. Hapus elemen 3 di tengah list
        tengahList.removeMid(3);

        // 5. Tampilkan elemen list setelah penghapusan tengah
        System.out.println("Elemen List setelah penghapusan tengah:");
        tengahList.display();
    }
}
