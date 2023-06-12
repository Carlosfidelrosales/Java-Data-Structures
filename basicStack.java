public class basicStack {
    private int maxSize;
    private int top;
    private int[] stackArray;
    
    // constructor
    public basicStack(int size) {
        maxSize = size;
        stackArray = new int[maxSize];
        top = -1; // Initial Empty Stack
    }
    
    // This will add element on the top of the stack
    public void push(int value) {
        if (top == maxSize - 1) {
            System.out.println("Stack overflow. Cannot push element " + value);
            return;
        }
        stackArray[++top] = value;
    }
    
    // Removing element on the top of the stack
    public void pop() {
        if (top == -1) {
            System.out.println("Stack underflow. Cannot pop element from an empty stack.");
            return;
        }
        int poppedElement = stackArray[top--];
        System.out.println("Popped element: " + poppedElement);
    }
    
    // Return top of stack
    public int peek() {
        if (top == -1) {
            System.out.println("Stack is empty.");
            return -1;
        }
        return stackArray[top];
    }
    
    public static void main(String args[]) {
        basicStack stack = new basicStack(3);
        stack.push(1);
        stack.push(2);
        System.out.println("Top element: " + stack.peek());
        stack.pop();
        System.out.println("Top element: " + stack.peek());
    }
}

