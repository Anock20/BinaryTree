
public class TestBinaryTree {
    public static void main(String[] args) {
        BinaryTree treeB = new BinaryTree("B");
        BinaryTree treeD = new BinaryTree("D");
        BinaryTree treeE = new BinaryTree("E");
        BinaryTree treeC = new BinaryTree("C", treeD, treeE);
        BinaryTree treeA = new BinaryTree("A", treeB, treeC);
        System.out.println("treeA:" + treeA);
        System.out.println("treeB: " + treeB);
        System.out.println("treeC:" + treeC);
        System.out.println("treeD:" + treeD);
        System.out.println("treeE: " + treeE);
    }
}