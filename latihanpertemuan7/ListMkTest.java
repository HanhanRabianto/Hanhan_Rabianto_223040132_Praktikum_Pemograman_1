package latihanpertemuan7;

public class ListMkTest {
	 public static void main(String[]args ) {
		 ListMatakuliah list = new ListMatakuliah();
		 
		 list.addHead(new Matakuliah("IF001", "Dasar Pemograman", 4));
		 list.addHead(new Matakuliah("IF002", "Pemograman Web", 3));
		 list.displayElement();
	 }
	}
