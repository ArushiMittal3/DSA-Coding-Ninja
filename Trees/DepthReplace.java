
public class DepthReplace {

    static void depthPrint(BinaryTreeNode<Integer> root ,int k){
        if(root==null){
            return ;
        }
        
        root.data=k;
        
        depthPrint(root.left,k+1);
        depthPrint(root.right,k+1);
        
    }
    public static void main(String[] args) {
        BinaryTreeNode<Integer> root=BinaryTreeUse.takeInput();

        BinaryTreeUse.printTreeDetailed(root);
        depthPrint(root, 0);
        BinaryTreeUse.printTreeDetailed(root);
    }
}
