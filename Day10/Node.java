package Day10;

class Node {
    private int value;
    public Node left;
    public Node right;

    public void addTo(Node n) {
        if(this.value < n.value){
            if(n.left == null){
                n.left = this;
            } else{
                addTo(n.left);
            }
        } else{
            if(n.right == null){
                n.right = this;
            } else{
                addTo(n.right);
            }
        }
    }

    public int getValue() {
        return value;
    }

    public void setValue(int value) {
        this.value = value;
    }

    public Node(int value) {
        this.value = value;
    }
}
