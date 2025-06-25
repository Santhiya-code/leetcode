class MyQueue {
     private Queue<Integer> qu;
    public MyQueue(){
       qu=new LinkedList<>();
    }
    
    public void push(int x) {
        qu.add(x);
    }
    
    public int pop() {
        return qu.poll();
    }
    
    public int peek() {
        return qu.peek();
    }
    
    public boolean empty() {
        if(qu.isEmpty()){
            return true;
        }
        return false;
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