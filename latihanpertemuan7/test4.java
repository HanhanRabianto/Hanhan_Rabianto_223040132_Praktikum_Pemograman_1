package latihanpertemuan7;

public class test4 {
	    public static void main(String[] args) {
	        ListMatakuliah list = new ListMatakuliah();

	        // Menambahkan matakuliah ke tengah daftar
	        list.addMid(new Matakuliah("IF003", "Struktur Diskrit", 3), 0);

	        // Menambahkan matakuliah ke akhir daftar
	        list.addTail(new Matakuliah("IF004", "Konstruksi PL Berorientasi Objek", 3));

	        // Menambahkan matakuliah ke akhir daftar
	        list.addTail(new Matakuliah("IF002", "Pemrograman Web", 3));

	        // Menambahkan matakuliah ke akhir daftar
	        list.addTail(new Matakuliah("IF001", "Dasar Pemrograman", 4));

	        // Menampilkan elemen-elemen dalam daftar
	        list.displayElement();
	    }
	}

}
