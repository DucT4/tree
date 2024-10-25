public class treeNode {
    private int value;
    private treeNode left;
    private treeNode right;

    public treeNode(int value) {
        this.value = value;
    }
    public int getValue(){
        return this.value;
    }   
    public void setValue(int value){
        this.value = value;
    }
    public void setLeft(treeNode left) {
        this.left = left;
    }
    public void setRight(treeNode right) {
        this.right = right;
    }   
    public treeNode getLeft(){
        return this.left;
    }
    public treeNode getRight(){
        return this.right;
    }
}
