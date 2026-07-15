class Node{
    String url;
    Node previous;
    Node next;

    Node(String url){
        this.url = url;
    }
}
class BrowserHistory {
    Node current;

    public BrowserHistory(String homepage) {
        current = new Node(homepage);
    }
    
    public void visit(String url) {
        Node newNode = new Node(url);
        current.next = null;

        newNode.previous = current;
        current.next = newNode;

        current = newNode;
    }
    
    public String back(int steps) {
        while(steps > 0 && current.previous != null){
            current = current.previous;
            steps--;
        }
        return current.url;
    }
    
    public String forward(int steps) {
        while(steps > 0 && current.next != null){
            current = current.next;
            steps--;
        }
        return current.url;
    }
}

/**
 * Your BrowserHistory object will be instantiated and called as such:
 * BrowserHistory obj = new BrowserHistory(homepage);
 * obj.visit(url);
 * String param_2 = obj.back(steps);
 * String param_3 = obj.forward(steps);
 */