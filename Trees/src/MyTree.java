/**
 * Rewritten version of a Tree
 * @author John Anselmo
 * @version 1.0
 */
public class MyTree<E> {
    private TreeNode<E> root;

    /**
     * Add data to the tree
     * @param data the data to add to the tree
     */
    public boolean add( E data ) {
        if ( root == null ) {
            root = new TreeNode<E>( data );
        }
        else {
            
        }
        return true;
    }

    /**
     * TreeNode class used in MyTree
     * @author John Anselmo
     * @version 1.0
     */
    private class TreeNode<E> {
        private E data;
        private TreeNode<E> left;
        private TreeNode<E> right;

        public TreeNode( E data ) {
            this.data = data;
            left = null;
            right = null;
        }

        public TreeNode( E data, TreeNode<E> left, TreeNode<E> right ) {
            this.data = data;
            this.left = left;
            this.right = right;
        }
    }
}