class BrowserHistory {
    Stack <String> backStack;
    Stack <String> fwdStack;
    String current;
    public BrowserHistory(String homepage) {
        backStack=new Stack<>();
        fwdStack=new Stack<>();
        current =homepage;
    }
    
    public void visit(String url) {
        backStack.push(current);
        current=url;
        fwdStack.clear();
    }
    
    public String back(int steps) {
        while(steps>0 && !backStack.isEmpty()){
            steps--;
            fwdStack.push(current);
            current=backStack.pop();
        }
        return current;
    }
    
    public String forward(int steps) {
        while(steps>0 && !fwdStack.isEmpty()){
            steps--;
            backStack.push(current);
            current=fwdStack.pop();
        }
        return current;
    }
}

/**
 * Your BrowserHistory object will be instantiated and called as such:
 * BrowserHistory obj = new BrowserHistory(homepage);
 * obj.visit(url);
 * String param_2 = obj.back(steps);
 * String param_3 = obj.forward(steps);
 */