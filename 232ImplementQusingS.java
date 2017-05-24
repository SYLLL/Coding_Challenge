//stack in two directions
public class MyQueue {
    public Stack<Integer> st = null;
    private Stack<Integer> ex = null;

    /** Initialize your data structure here. */
    public MyQueue() {
        st = new Stack<Integer>();
        ex = new Stack<Integer>();
    }
    
    /** Push element x to the back of queue. */
    public void push(int x) {
        st.push(x);
    }
    
    /** Removes the element from in front of queue and returns that element. */
    public int pop() {
        while (st.size() > 0) {
            ex.push(st.pop());
        }
        Integer temp = ex.pop();
        while (ex.size() > 0) {
            st.push(ex.pop());
        }
        return (int) temp;
    }
    
    /** Get the front element. */
    public int peek() {
        while (st.size() > 0) {
            ex.push(st.pop());
        }
        Integer temp = ex.peek();
        while (ex.size() > 0) {
            st.push(ex.pop());
        }
        return (int) temp;
    }
    
    /** Returns whether the queue is empty. */
    public boolean empty() {
        return (st.size() == 0);
    }
}

/**
 * Your MyQueue object will be instantiated and called as such:
 * MyQueue obj = new MyQueue();
 * obj.push(x);
 * int param_2 = obj.pop();
 * int param_3 = obj.peek();
 * boolean param_4 = obj.empty();
 */