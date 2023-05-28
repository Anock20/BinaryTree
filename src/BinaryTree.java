public class BinaryTree {
    private Object root;
    private BinaryTree left, right;

    public BinaryTree(Object root) {

        this.root = root;
    }

    public BinaryTree(Object root, BinaryTree left, BinaryTree right) {
        this(root);
        if (left != null)
            this.left = left;
        if (right != null)
            this.right = right;
    }

    public BinaryTree(BinaryTree that) {

        this.root = that.root;
        if (that.left != null)
            this.left = new BinaryTree(that.left);
        if (that.right != null)
            this.right = new BinaryTree(that.right);
    }

    public Object getRoot() {

        return this.root;
    }

    public BinaryTree getLeft() {

        return this.left;
    }

    public BinaryTree getRight() {
        return this.right;
    }
    public Object setRoot(Object object) {

        Object oldRoot = this.root;
        this.root = object;
        return oldRoot;
    }
    public BinaryTree setLeft (BinaryTree tree) {
        BinaryTree oldLeft = this.left;
        this.left = tree;
        return oldLeft;
    }
    public BinaryTree setRight (BinaryTree tree) {
        BinaryTree oldRight = this.right;
        this.right = tree;
        return oldRight;
    }
    public String toString() {
        StringBuilder sb = new StringBuilder("[");
        if (left != null)
            sb.append(left + ",");
        sb.append(root);
        if (right != null)
            sb.append("," + right);
        return sb + "]";
    }
}