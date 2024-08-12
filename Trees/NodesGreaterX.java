public class NodesGreaterX {

    static int greaterX(BinaryTreeNode<Integer> root, int x){
        if(root==null){
            return 0;
        }
        int count=0;
        // If root's data is greater than x, include this node in the count
        if (root.data > x) {
            count = 1;
        }

        // Recursively count nodes in the left and right subtrees that are greater than x
        int left = greaterX(root.left, x);
        int right = greaterX(root.right, x);
        
        // Return the total count
        return count + left + right;
    }
    public static void main(String[] args) {
        BinaryTreeNode<Integer> root=BinaryTreeUse.takeInput();

        // BinaryTreeUse.printTreeDetailed(root);
        System.out.println(greaterX(root, 2));
    }
}
