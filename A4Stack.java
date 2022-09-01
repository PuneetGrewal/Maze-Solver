// Name: Puneet Grewal
// V#: V00951156

public class A4Stack<T> implements Stack<T> {

	private static final int DEFAULT_CAPACITY = 5;
	private T[] data;
	private int top;

	public A4Stack() {
		data = (T[]) new Object[DEFAULT_CAPACITY];
		top = 0;
	}

	public A4Stack(int size) {
		data = (T[]) new Object[size];
		top = 0;
	}

	public void push(T v) throws FullStackException {
		// TODO: implement this

		if (isFull()){
			throw new FullStackException ("Stack is full.");
		} else {
			data[top] = v;
			top = top + 1;
		}
	}

	public T pop() throws EmptyStackException {
		// TODO: implement this

		if (isEmpty()){
			throw new EmptyStackException ("Stack is empty.");
		} else {
			T val = top();
			top = top - 1;
			data[top] = null;
			return val;
		}

	}

	public void popAll() {
		// TODO: implement this

		if (top!=0){
			data = (T[]) new Object[DEFAULT_CAPACITY];
			top=0;
		} else {
			return;
		}
	}

	public boolean isEmpty() {
		// TODO: implement this
		return(top==0);

	}

	public boolean isFull() {
		// TODO: implement this
		return (data.length == top);


	}

	public T top() throws EmptyStackException {
		// TODO: implement this

		if(isEmpty()){
			throw new EmptyStackException();
		} else {
			return data[top-1];
		}

	}
}
