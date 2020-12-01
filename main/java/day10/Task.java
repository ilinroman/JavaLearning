package Day10;

public class Task {
    private static int counter = 0;

    public static void main(String[] args) {
        Node root = new Node(20);

        add(14, root);
        add(11, root);
        add(5, root);
        add(8, root);
        add(16, root);
        add(15, root);
        add(18, root);
        add(23, root);
        add(22, root);
        add(27, root);
        add(24, root);
        add(150, root);

        show(root);

        System.out.println("counter = " + counter);
    }

    private static void add(int value, Node n){
        if(value < n.getValue()){
            if(n.left == null){
                n.left = new Node(value);
            } else{
                add(value, n.left);
            }
        } else{
            if(n.right == null){
                n.right = new Node(value);
            } else{
                add(value, n.right);
            }
        }
    }

    private static void show(Node root){
        counter++;
        if(root != null){
            show(root.left);
            System.out.print(root.getValue() + " ");
            show(root.right);
        }
    }
}
