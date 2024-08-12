public class Height {

    static int height(BinaryTreeNode<Integer> root, int x){
        if(root==null){
            return 0;
        }
        

        // Recursively count nodes in the left and right subtrees that are greater than x
        int left =  height(root.left, x);
        int right =  height(root.right, x);
        
        // Return the total count
        return 1+ Math.max(left,right);
    }
    public static void main(String[] args) {
        BinaryTreeNode<Integer> root=BinaryTreeUse.takeInput();

        BinaryTreeUse.printTreeDetailed(root);
        System.out.println(height(root, 2));
    }
}
