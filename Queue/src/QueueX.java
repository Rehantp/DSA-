

public class QueueX {
	private int[] queueArray;
	private int maxSize;
	private int rear;
	private int front;
	private int noitems;

	public QueueX(int maxSize) {

		this.queueArray = new int[maxSize];
		this.maxSize = maxSize;
		this.rear = -1;
		this.front = 0;
		this.noitems = 0;
	}

	public boolean isEmpty() {
		if (noitems == 0) {
			return true;
		} else {
			return false;
		}
	}

	public void insert(int x) {
		if (noitems == maxSize) {
			System.out.println("Queue is full");
		}

		else {
			rear++;
			queueArray[rear] = x;
			noitems++;
		}
	}

	public int remove() {
		if (rear == -1) {
			return -99;
		} else {
			int temp = queueArray[front];
			front++;
			noitems--;
			return temp;
		}
	}

}
