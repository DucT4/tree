public class myBinarySearchTree {
    public treeNode mRoot;

    public myBinarySearchTree() {

    }

    public treeNode insert(treeNode root, int value) {
        if (root == null) {
            return new treeNode(value);
        }

        treeNode current = root;
        while (true) {
            if (value < current.getValue()) {
                if (current.getLeft() == null) {
                    current.setLeft(new treeNode(value));
                    break;
                }
                current = current.getLeft();
            } else if (value > current.getValue()) {
                if (current.getRight() == null) {
                    current.setRight(new treeNode(value));
                    break;
                }
                current = current.getRight();
            }
        }
        return root;
    }

    public treeNode insertIntoBST(treeNode nodeRoot, int value) {
        treeNode newNode = new treeNode(value);
        if (nodeRoot == null) {
            return new treeNode(value);
        }
        if (value < nodeRoot.getValue())

        {
            if (nodeRoot.getLeft() == null) {
                nodeRoot.setLeft(newNode);

            } else {
                insertIntoBST(nodeRoot.getLeft(), value);
            }

        } else if (value > nodeRoot.getValue()) {
            if (nodeRoot.getRight() == null) {
                nodeRoot.setRight(newNode);
            } else {
                insertIntoBST(nodeRoot.getRight(), value);
            }
        }
        return nodeRoot;
    }

    // tim con trai cung cua root
    // Phương thức tìm node trái cùng (node có giá trị nhỏ nhất) trong cây
    public treeNode findLeftModeNode(treeNode root) {
        if (root == null)
            return null;
        treeNode leftMostNode = root;
        while (leftMostNode.getLeft() != null) {
            leftMostNode = leftMostNode.getLeft();
        }
        return leftMostNode;
    }

    // Phương thức xóa một node có giá trị cụ thể khỏi cây
    public treeNode delete(treeNode root, int value) {
        if (root == null) {
            return null;
        }
        // Tìm node cần xóa
        if (value < root.getValue()) {
            root.setLeft(delete(root.getLeft(), value));
        } else if (value > root.getValue()) {
            root.setRight(delete(root.getRight(), value));
        } else {
            // Đã tìm thấy node cần xóa

            // Trường hợp 1: Node là lá (không có con)
            if (root.getLeft() == null && root.getRight() == null) {
                return null;
            }
            // th2: node co 1 la
            if (root.getLeft() == null && root.getRight() != null) {
                return root.getRight();
            }
            if (root.getLeft() != null && root.getRight() == null) {
                return root.getLeft();
            }

            // Trường hợp 3: Node có cả hai con
            // Tìm node trái cùng của cây con bên phải
            treeNode leftMostNodeOfRight = findLeftModeNode(root.getRight());
            // Thay thế giá trị của node cần xóa bằng giá trị của node trái cùng
            root.setValue(leftMostNodeOfRight.getValue());
            delete(root.getRight(), leftMostNodeOfRight.getValue());
        }
        return root;
    }
}