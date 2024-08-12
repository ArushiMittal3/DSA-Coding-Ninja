public class SumOfNotes {

    static int sumOfNodes(BinaryTreeNode<Integer> root){
        if(root==null){
            return 0;
        }
        

        
       int left=sumOfNodes(root.left);
        int right=sumOfNodes(root.right);
        return left+ right+ root.data;
    }
    public static void main(String[] args) {
        BinaryTreeNode<Integer> root=BinaryTreeUse.takeInput();

        // BinaryTreeUse.printTreeDetailed(root);
        System.out.println(sumOfNodes(root));
    }
}
