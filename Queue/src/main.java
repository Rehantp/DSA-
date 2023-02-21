import java.util.Scanner;

public class main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		QueueX obj1 = new QueueX(5);

		for (int x = 0; x < 5; x++) {
			System.out.print("insert value " + (x + 1) + ":");
			Scanner sc = new Scanner(System.in);
			int in = sc.nextInt();
			obj1.insert(in);

		}
		
  System.out.println("Transactions");
  
		QueueX oddArray = new QueueX(5);
		QueueX EvenArray = new QueueX(5);

		while (!obj1.isEmpty()) {

			int value = obj1.remove();
			// System.out.println(value);
			if (value % 2 == 0) {
				EvenArray.insert(value);
				//System.out.println(" Transaction " + value + " for pc1");
			} else {
				//System.out.println(" Transaction " + value + " for pc2");
				oddArray.insert(value);
			}

		}

		 System.out.println("PC 1");
		 while (!oddArray.isEmpty()) {
		 System.out.println("Transacton :" + oddArray.remove());
		 }
		
		 System.out.println("PC 2");
		 while (!EvenArray.isEmpty()) {
		 System.out.println("Transacton :" + EvenArray.remove());
		
		 }
		
	}

}
