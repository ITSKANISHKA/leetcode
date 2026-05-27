import java.util.Stack;

class MinStack {

    Stack<Integer> st = new Stack<>();
    public void push(int val) {
        st.push(val);
    }

    public void pop() {
        st.pop();
    }

    public int top() {
        return st.peek();
    }

    public int getMin() {
        int min = Integer.MAX_VALUE;
        for(int x : st) {
            min = Math.min(min, x);
        }
        return min;
    }
}