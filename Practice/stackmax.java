public class Intwithmax {
	
	private int the_int;
	private int the_max;

	public Intwithmax(int theint, int themax) {
		the_int = theint;
		the_max = themax;
	}

}

public class Stackwithmax {

    private Deque<Intwithmax> the_deque = new Deque<Intwithmax>();
    //default constructer, do not pass in any value

    public boolean empty() {
    	return the_deque.isEmpty();
    }

    public void push(int input) {
    	the_deque.addFirst(new Intwithmax(input, Math.max(input, thie.empty()? input : this.max())));
    }

    public int pop() {
    	return the_deque.removeFirst().the_int;
    }

    public int peek() {
    	return the_deque.peekFirst().the_int;
    }

    public int max() {
    	return the_deque.peekFirst().the_max;
    }


}