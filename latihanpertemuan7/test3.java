package latihanpertemuan7;

public class test3 {
	    private MatakuliahNode head;

	    // Menambahkan sebuah MatakuliahNode di posisi tengah dari list
	    public void addMid(Matakuliah matakuliah, int position) {
	        MatakuliahNode newNode = new MatakuliahNode(matakuliah);
	        if (position < 0) {
	            System.out.println("Posisi harus lebih besar dari atau sama dengan 0");
	            return;
	        }

	        if (position == 0) {
	            newNode.setNext(head);
	            head = newNode;
	            return;
	        }

	        MatakuliahNode current = head;
	        for (int i = 0; i < position - 1; i++) {
	            if (current == null) {
	                System.out.println("Posisi tidak valid");
	                return;
	            }
	            current = current.getNext();
	        }

	        if (current == null) {
	            System.out.println("Posisi tidak valid");
	            return;
	        }

	        newNode.setNext(current.getNext());
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
