public class BST {
    Node root;

    Node createTree(int arr[], int start, int end) {
        if (start > end) return null;

        int mid = (start + end)/2;
        Node node = new Node(arr[mid]);

        node.left = createTree(arr, start, mid - 1);
        node.right = createTree(arr, mid + 1, end);

        return node;
    }
    
    public static void main(String[] args) {
    	
    	 BST bst = new BST();
         int arr[] = { 10, 20, 30, 40, 50, 60, 70, 80, 90, 100 };
         bst.root = bst.createTree(arr, 0, arr.length-1);
	}
}
public class Node {
    int value;
    Node left,right;
    public Node(int item) {
        value=item;
        left=right=null;
    }
}
