public class Traversals {

    static void  preOrder(BinaryTreeNode<Integer> root){
        if(root==null){
            return ;
        }
        System.out.println(root.data);
        preOrder(root.left);
        preOrder(root.right);
        
    }

    static void  InOrder(BinaryTreeNode<Integer> root){
        if(root==null){
            return ;
        }
        
        InOrder(root.left);
        System.out.println(root.data);
        InOrder(root.right);
        
    }

    static void  postOrder(BinaryTreeNode<Integer> root){
        if(root==null){
            return ;
        }
        System.out.println(root.data);
        postOrder(root.left);
        postOrder(root.right);
        
    }
    public static void main(String[] args) {
        BinaryTreeNode<Integer> root=BinaryTreeUse.takeInput();

        BinaryTreeUse.printTreeDetailed(root);
        preOrder(root);
        
    }
}
