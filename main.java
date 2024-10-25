public class main {
    public static void main(String[] args) {
     myBinarySearchTree searchTree = new myBinarySearchTree();
    searchTree.mRoot = searchTree.insertIntoBST(searchTree.mRoot, 5);
    searchTree.mRoot = searchTree.insertIntoBST (searchTree.mRoot, 1);
    searchTree.mRoot = searchTree.insertIntoBST(searchTree.mRoot, 6);
    searchTree.mRoot = searchTree.insertIntoBST(searchTree.mRoot, 0);
    searchTree.mRoot = searchTree.insertIntoBST(searchTree.mRoot, 3);
    searchTree.mRoot = searchTree.insertIntoBST(searchTree.mRoot, 7);
    searchTree.mRoot = searchTree.insertIntoBST(searchTree.mRoot, 2);
    searchTree.mRoot = searchTree.insertIntoBST(searchTree.mRoot, 4);
       searchTree.mRoot = searchTree.delete(searchTree.mRoot, 1);
    System.out.println("done");

    }
}
