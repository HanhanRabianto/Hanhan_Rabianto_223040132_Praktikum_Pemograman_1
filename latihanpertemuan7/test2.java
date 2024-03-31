package latihanpertemuan7;

public class test2 {
	    private MatakuliahNode head;

	    // Menambahkan sebuah MatakuliahNode di bagian belakang (tail) dari list
	    public void addTail(Matakuliah matakuliah) {
	        MatakuliahNode newNode = new MatakuliahNode(matakuliah);
	        if (head == null) {
	            head = newNode;
	            return;
	        }

	        MatakuliahNode current = head;
	        while (current.getNext() != null) {
	            current = current.getNext();
	        }
	        current.setNext(newNode);
	    }

	    // Metode untuk menampilkan elemen-elemen dalam list
	    public void displayElement() {
	        MatakuliahNode current = head;
	        while (current != null) {
	            System.out.println(current.getData());
	            current = current.getNext();
	        }
	    }
	}

}
